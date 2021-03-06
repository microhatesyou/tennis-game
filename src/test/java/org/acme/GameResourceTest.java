package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@Disabled("TODO finish me please")
public class GameResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/game")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

}
