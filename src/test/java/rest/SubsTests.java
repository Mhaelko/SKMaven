package rest;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.io.IoBuilder;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class SubsTests {
    private static final Logger LOG = LogManager.getLogger(SubsTests.class);
    @BeforeClass
    public void setUp(){
        RestAssured.baseURI = "http://localhost/rest/json";
        RestAssured.port=8081;
        config = config()
                .logConfig(new LogConfig()
                        .defaultStream(IoBuilder.forLogger(LOG).buildPrintStream()));
    }

    @Test
    @Ignore
    public void testAddSubsciber(){
        Response response = given()
                .log().all()
                .get("/subscribers");
        int code = response.getStatusCode();
        String body = response.getBody().prettyPrint();

        System.out.println(code);
        //System.out.println(body);

    }

    @Test
    @Ignore
    public void testGetAllSubscribers() {
        given()
                .when()
                .get("/subscribers")
                .then()
                .assertThat()
                .body("size()", greaterThanOrEqualTo(1))
                .and()
                .body("[0].id", equalTo(1))
                .and()
                .body("[0].firstName", equalTo("Peter"))
                .and()
                .statusCode(200);
    }

    @Test
    public void testCreateSubscriber() {
        JSONObject json = new JSONObject();
        json.put("firstName", "Test1");
        json.put("lastName", "Ltest1");
        json.put("age", 31);
        json.put("gender", "f");

        given()
                .log().all()
                .header("Content-Type", "application/json")
                .body(json.toJSONString())
                .post("/subscribers")
                .then()
                .assertThat()
                .header("Location", containsString("http://localhost:8081/rest/json/subscribers"))
                .statusCode(201);
    }
}
