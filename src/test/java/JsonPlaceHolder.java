import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class JsonPlaceHolder {
    @Test
    //Test api endpoint https://jsonplaceholder.typicode.com/posts/15
    public void verify_posts_getById()
    {
        Response response = given()
                .baseUri("https://jsonplaceholder.typicode.com/")
                .basePath("posts")
                .when()
                .get( "15");
        //verify that status code is success
        Assert.assertEquals(200,response.statusCode());
        System.out.println(response.statusCode());
        //print body text
        System.out.println(response.body().asString());
        JsonPath responseJson = response.getBody().jsonPath();
        //verify title using value  "userId": 2
        Assert.assertEquals(2,responseJson.getInt("userId"));
        System.out.println(responseJson.getInt("userId"));
        //verify userid using value "title": "eveniet quod temporibus"
        Assert.assertEquals("eveniet quod temporibus",responseJson.getString("title"));
        System.out.println(responseJson.getString("title"));
    }
    @Test
    //Test api endpoint https://jsonplaceholder.typicode.com/users/5
    public void Verify_users_getByAddress()
    {
        Response response = given()
                .baseUri("https://jsonplaceholder.typicode.com/")
                .basePath("users")
                .when()
                .get( "5");
        //verify that status code is success
        Assert.assertEquals(200,response.statusCode());
        System.out.println(response.statusCode());
        //print body text
        System.out.println(response.body().asString());
        JsonPath responseJson = response.getBody().jsonPath();
        //verify that name": "Chelsey Dietrich"
        Assert.assertEquals("Chelsey Dietrich",responseJson.getString("name"));
        System.out.println(responseJson.getString("name"));
        //verify that "street": "Skiles Walks"
        Assert.assertEquals("Skiles Walks",responseJson.getString("address.street"));
        System.out.println(responseJson.getString("address.street"));
        //verify that lat": "-31.8129"
        Assert.assertEquals("-31.8129",responseJson.getString("address.geo.lat"));
        System.out.println(responseJson.getString("address.geo.lat"));
        //verify that "catchPhrase": "User-centric fault-tolerant solution"
        Assert.assertEquals("User-centric fault-tolerant solution",responseJson.getString("company.catchPhrase"));
        System.out.println(responseJson.getString("company.catchPhrase"));

    }
    @Test
    //Test endpoint https://jsonplaceholder.typicode.com/todos/29
    public void verify_todos_getBy()
    {
        Response response = given()
                .baseUri("https://jsonplaceholder.typicode.com/")
                .basePath("todos")
                .when()
                .get( "29");
        //verify that it returns status code 200
        Assert.assertEquals(200,response.statusCode());
        System.out.println(response.statusCode());
        //print body text
        System.out.println(response.body().asString());
        JsonPath responseJson = response.getBody().jsonPath();
        //verify that title is "title": "laborum aut in quam"
        Assert.assertEquals("laborum aut in quam",responseJson.getString("title"));
        System.out.println(responseJson.getString("title"));
        //verify that completed is false using  "completed": false
        Assert.assertEquals("false",responseJson.getString("completed"));
        System.out.println(responseJson.getString("completed"));
    }
}
