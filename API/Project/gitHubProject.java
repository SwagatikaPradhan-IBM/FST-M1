package project;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class gitHubProject {

    String sshKey = "ssh-ed25519 " +
            "AAAAC3NzaC1lZDI1NTE5AAAAIPMHQBakc8q5E8qDy4p/ZQG+0WZf9d5QskrvJKJm9FTq";
    int id;
    RequestSpecification reqSpec;
    ResponseSpecification resSpec;
    @BeforeClass
    public void setUp() {
        reqSpec = new RequestSpecBuilder()
                .setBaseUri("https://api.github.com/user/keys")
                .addHeader("Authorization", "token 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")
                .addHeader("Content-Type", "application/json")
                .build();

        resSpec = new ResponseSpecBuilder()
                .expectResponseTime(lessThan(5000L))
                .expectBody("key", equalTo(sshKey))
                .expectBody("title", equalTo("TestAPIKey"))
                .build();

    }
    @Test(priority = 1)
    public void postRequestTest() throws Exception
    {
        Map<String, String> reqBody = new HashMap<>();
        reqBody.put("title", "TestAPIKey");
        reqBody.put("key", sshKey);
        Response res = given().spec(reqSpec).body(reqBody).when().post();
        id=res.then().extract().path("id");
        res.then().statusCode(201).spec(resSpec);
        System.out.println(id);
        Reporter.log("Post Method : "+res.getBody().asString());
        System.out.println(res.getBody().asString());
        Assert.assertEquals(res.getStatusCode(), 201);
    }
    @Test(priority=2)
    public void getTest()
    {
        Response resGet = given().spec(reqSpec).pathParam("keyId", id)
                .when().get("/{keyId}");
        resGet.then().statusCode(200).spec(resSpec);
        Reporter.log("Get Method : "+resGet.getBody().asString());
        System.out.println(resGet.getBody().asString());
        Assert.assertEquals(resGet.getStatusCode(), 200);
    }
    @Test(priority=3)
    public void deleteTest()
    {
        Response resDel =given().spec(reqSpec).pathParam("keyId", id)
                .when().delete("/{keyId}");

        resDel.then().statusCode(204).time(lessThan(3000L));
        Reporter.log("Delete Method : "+resDel.getBody().asString());
        System.out.println(resDel.getBody().asString());
        Assert.assertEquals(resDel.getStatusCode(), 204);
    }

}
