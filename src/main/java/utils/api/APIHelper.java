package utils.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class APIHelper {

    public static String testrailBaseURL = "https://betprophet.testrail.io/index.php?";

    public static String novaBaseURL = "http://nova-staging.betprophet.io";

    public static RequestSpecification requestSpec;
    public static RequestSpecBuilder builder = new RequestSpecBuilder();

}
