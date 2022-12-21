package utils.api.testrail;

import com.google.gson.JsonObject;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import utils.api.APIHelper;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

@Setter
@Getter
@Builder
@ToString
public class TestRailAPI {

    public void updateResult(String testID, String status_id) {
        APIHelper.builder.setBaseUri(APIHelper.baseURL);
        RequestSpecification requestSpec = APIHelper.builder.build();
        Map<String, String> headerList = new HashMap<>();
        headerList.put("Content-Type", "application/json");
        headerList.put("Authorization", "Basic dGFpLmxkQGNhcmVoZWFsdGguaW86Q0ByZWhlYWx0aDIwMjE=");
        headerList.put("Cookie", "tr_session=ec3c176f-c10f-4010-89b3-8414772a59db");

        JsonObject jObject = new JsonObject();
        jObject.addProperty("status_id", status_id);



        ValidatableResponse response = given().spec(requestSpec)
                .headers(headerList)
                .body(jObject.toString())
                .when()
                .post(APIHelper.baseURL + "/api/v2/add_result_for_case/18/" + testID)
                .then()
                .statusCode(200);
    }

}
