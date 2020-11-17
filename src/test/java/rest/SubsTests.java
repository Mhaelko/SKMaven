package rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class SubsTests {
    @BeforeClass
    public void setUp(){
        RestAssured.baseURI = "http://localhost/rest/json";
        RestAssured.port=8081;
    }

    @Test
    public void testAddSubsciber(){
        Response response = given()
                .get("/subscribers");
        int code = response.getStatusCode();
        String body = response.getBody().prettyPrint();

        System.out.println(code);
        //System.out.println(body);

    }

    @Test
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
}
