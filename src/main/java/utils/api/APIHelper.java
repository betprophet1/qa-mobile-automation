package utils.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class APIHelper {

    public static String baseURL = "https://betprophet.testrail.io/index.php?";

    public static RequestSpecification requestSpec;
    public static RequestSpecBuilder builder = new RequestSpecBuilder();

}
