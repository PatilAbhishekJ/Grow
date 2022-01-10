package apiTests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.util.Asserts;

public class E2E_Tests {

    public static void main(String [] args){
        String userID="9b5f49ab-eea9-45f4-9d66-bcf56a531b85" ;
        String userName="TOOLSQA-Test";
        String password="Test@@123";
        String baseUrl="https://bookstore.toolsqa.com";

        RestAssured.baseURI=baseUrl;
        RequestSpecification request=RestAssured.given();

        //Step 1-: Test will start from generating token for authorization.

        request.header("Content-Type","application/json");
        Response response =request.body("{\"userName\":\""+userName+"\",\"password\":\""+password+"\"}").post("/Account/v1/GenerateToken");

        Assert.assertEquals(response.getStatusCode(), 200);

        String jsonString=response.asString();
        Assert.asserTrue(jsonString).get("token");

        String token= JsonPath.from(jsonString).get("token");


        //Step 2: Get books- No AUth is required for this

        response=request.get("/BookStore/v1/Books");
        Assert.assertEquals(response.getStatusCode(),200);
        jsonString=response.asString();

        List<Map<String,String>> books=JsonPath.from(jsonString).get("books");





    }
}
