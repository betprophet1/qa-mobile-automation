package utils.api.nova;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.testng.annotations.BeforeClass;
import utils.ScenarioContext;
import utils.api.APIHelper;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

@Setter
@Getter
@Builder
@ToString
public class NovaAPI {

    public void getCSRFToken() {

        APIHelper.builder.setBaseUri(APIHelper.novaBaseURL);
        RequestSpecification requestSpec = APIHelper.builder.build();
        Map<String, String> headerList = new HashMap<>();
        headerList.put("User-Agent", "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.5060.134 Safari/537.36");

        ValidatableResponse response = given().spec(requestSpec)
                .headers(headerList)
                .when()
                .get(APIHelper.novaBaseURL + "/login")
                .then()
                .statusCode(200);

//        String token = response.extract().htmlPath().getString("html.head.meta.@content");
        String csrf_token = response.extract().htmlPath().getString("**.find {it.@name =='csrf-token'}.@content");
        ScenarioContext.currentContext().set("CSRF Token").with(csrf_token);
    }

    public void loginNova() {

        APIHelper.builder.setBaseUri(APIHelper.novaBaseURL);
        RequestSpecification requestSpec = APIHelper.builder.build();
        Map<String, String> headerList = new HashMap<>();
        headerList.put("x-csrf-token", ScenarioContext.currentContext().get("CSRF Token", String.class));
        headerList.put("Content-Type", "application/json");

        JsonObject jObject = new JsonObject();
        jObject.addProperty("email", "admin@betprophet.com");
        jObject.addProperty("password", "123123Aa");
        jObject.addProperty("remember", true);

        ValidatableResponse response = given().spec(requestSpec)
                .headers(headerList)
                .body(jObject.toString())
                .when()
                .post(APIHelper.novaBaseURL + "/login")
                .then()
                .statusCode(302);

    }

    public void getDashBoard() {

        APIHelper.builder.setBaseUri(APIHelper.novaBaseURL);
        RequestSpecification requestSpec = APIHelper.builder.build();
        Map<String, String> headerList = new HashMap<>();

        ValidatableResponse response = given().spec(requestSpec)
                .headers(headerList)
                .when()
                .get(APIHelper.novaBaseURL + "/dashboards/main")
                .then()
                .statusCode(200);

        String csrf_token = response.extract().htmlPath().getString("**.find {it.@name =='csrf-token'}.@content");
        ScenarioContext.currentContext().set("CSRF Token").with(csrf_token);
        System.out.println("CSRF Token " + ScenarioContext.currentContext().get("CSRF Token", String.class));

    }

    public void searchByPhone() {

        System.out.println("CSRF Token " + ScenarioContext.currentContext().get("CSRF Token", String.class));
        APIHelper.builder.setBaseUri(APIHelper.novaBaseURL);
        RequestSpecification requestSpec = APIHelper.builder.build();
        Map<String, String> headerList = new HashMap<>();
        headerList.put("x-csrf-token", ScenarioContext.currentContext().get("CSRF Token", String.class));

        ValidatableResponse response = given().spec(requestSpec)
                .headers(headerList)
                .when()
                .queryParam("search", "2543071584")
                .queryParam("filters", "W3siQXBwXFxOb3ZhXFxGaWx0ZXJzXFxVc2VyXFxBY2NvdW50VHlwZSI6IiJ9XQ%3D%3D")
                .queryParam("orderBy", "")
                .queryParam("perPage", "25")
                .queryParam("trashed", "")
                .queryParam("page", "1")
                .queryParam("relationshipType", "")
                .get(APIHelper.novaBaseURL + "/nova-api/users")
                .then()
                .statusCode(200);

        String userIDOfWilliam = response.extract().jsonPath().getString("resources.id.value");
        System.out.println("userIDOfWilliam " + userIDOfWilliam);
        ScenarioContext.currentContext().set("userIDOfWilliam").with(userIDOfWilliam);
    }

    public void deleteUser() {

        APIHelper.builder.setBaseUri(APIHelper.novaBaseURL);
        RequestSpecification requestSpec = APIHelper.builder.build();
        Map<String, String> headerList = new HashMap<>();
        headerList.put("x-csrf-token", ScenarioContext.currentContext().get("CSRF Token", String.class));

        ValidatableResponse response = given().spec(requestSpec)
                .headers(headerList)
                .when()
                .contentType("multipart/form-data")
                .multiPart("resources", ScenarioContext.currentContext().get("userIDOfWilliam", String.class))
                .queryParam("action", "delete")
                .queryParam("pivotAction", "false")
                .queryParam("search", "2543071584")
                .queryParam("filters", "W3siQXBwXFxOb3ZhXFxGaWx0ZXJzXFxVc2VyXFxBY2NvdW50VHlwZSI6IiJ9XQ%3D%3D")
                .queryParam("trashed", "")
                .post(APIHelper.novaBaseURL + "/nova-api/users/action")
                .then()
                .statusCode(200);

        String message = response.extract().jsonPath().getString("message");
        System.out.println("message " + message);
        assert message.equals("success");
    }

}
