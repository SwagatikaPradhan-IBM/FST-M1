package project;

import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.HashMap;
import java.util.Map;

@ExtendWith(PactConsumerTestExt.class)
public class consumerTest
{
    Map<String, String> headers = new HashMap<>();
    String createUser = "/api/users";
    @Pact(provider = "UserProvider", consumer = "UserConsumer")
    public RequestResponsePact createPact(PactDslWithProvider builder)
    {
        headers.put("Content-Type", "application/json");
        headers.put("Accept", "application/json");

        DslPart bodyRequestResponseUser = new PactDslJsonBody().numberType("id",178)
                .stringType("firstName", "Swagatika")
                .stringType("lastName", "Pradhan")
                .stringType("email","swagatikapradhan@gmail.com");

        /*DslPart bodyReceivedCreateUser = new PactDslJsonBody().numberType("id",178)
                .stringType("firstName", "Swagatika")
                .stringType("lastName", "Pradhan")
                .stringType("email","swagatikapradhan@gmail.com");*/

        return builder.given("A request to create a user")
                .uponReceiving("A request to create a user")
                .path(createUser).method("POST").headers(headers)
                .body(bodyRequestResponseUser).willRespondWith().status(201)
                .body(bodyRequestResponseUser).toPact();

    }
    @Test
    @PactTestFor(providerName = "UserProvider", port = "8080")
    public void runTest()
    {
        RestAssured.baseURI = "http://localhost:8080";
        RequestSpecification rq = RestAssured.given().headers(headers).when();
        Map<String, Object> map = new HashMap<>();
        map.put("id",178);
        map.put("firstName","Swagatika");
        map.put("lastName","Pradhan");
        map.put("email","swagatikapradhan@gmail.com");
        Response response = rq.body(map).post(createUser);
        assert(response.getStatusCode()==201);
    }

}
