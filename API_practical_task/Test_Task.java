import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test_Task {
	
	// put request
	void test_req() {
		JSONObject req = new JSONObject();
		req.put("name", "Njabulo");
		req.put("job", "Automation");
		
		System.out.println(req.toJSONString());
		
		
		given().
			body(req.toJSONString()).
				when().
			put("https://reqres.in/api/users/2").
		  then().
		  	statusCode(200).
		  log().all();
		
	}
	
	// delete request
	void test_req2() {
	given().
	 delete("https://reqres.in/api/users/2").
  then().
  	statusCode(204).
  }
	
	
	// Post request
	void test_req3() {
	JSONObject req = new JSONObject();
	req.put("email", "nmkhon56@gmail.com");
	req.put("password", "targetj");
	
	System.out.println(req.toJSONString());
	
	given().
		body(req.toJSONString()).
			when().
		post("https://reqres.in/api/register").
	  then().
	  	statusCode(200).
	  log().all();	
	}
	
	
}