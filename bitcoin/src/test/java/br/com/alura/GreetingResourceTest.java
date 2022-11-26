package br.com.alura;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;

import org.junit.jupiter.api.Test;

@QuarkusTest
public class GreetingResourceTest {

    @Test
/*    public void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("Hello from RESTEasy Reactive"));
    }*/
    public void testarSeStatusCodeDaRequisicaoE200() {
    	RestAssured
    	   	.given().get("bitcoins").then().statusCode(200);    	   	
    }

}