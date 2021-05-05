package jar;


import org.json.simple.JSONObject;
import org.jvnet.staxex.StAxSOAPBody.Payload;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import general.functions;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.util.HashMap;
import java.util.List;
public class App {
	
	public static void main( String[] args) throws Exception
    {
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");*/
		
		functions func=new functions();
		String url="https://reqres.in/api/users?page=2";
		         String url1="https://reqres.in/api/users";
		         /*RestAssured.given()
		         .param("page", "2")
		         .header("Content-Type", "application/json")
		         .contentType(ContentType.JSON)
		         .auth().none()
		         .when()
		         .get(url)
		         .then().contentType(ContentType.JSON)
		         .statusCode(200)
		        .body("page", equalTo(2))
		        ;                                                               
		         Response res=func.get_reponse_from_required_url(url);
		     
		         Object data=res.getBody().jsonPath().get("page");
		         System.out.println(res.asString());
		         System.out.println(res.getStatusCode());
		         System.out.println(data);
		       
		        HashMap<String,Object>body=new HashMap();
		         body.put("name","morpheous");
		         body.put("job","leader");
		         
		        // Response res2=func.get_reponse_from_required_url_map(url, body);
		         String content ="{\"name\":\"morpheous\",\"job\":\"leader\"}";
		         Response res2= func.get_reponse_from_required_url(url,content);
		         Object data1=res2.getBody().jsonPath().get("page");
		         System.out.println(res2.asString());
		         System.out.println(res2.getStatusCode());
		         System.out.println(data1);                                     
		       
		         List<HashMap<String, Object>>sec=res.jsonPath().getList("data");
		         for (int i = 0; i < sec.size(); i++) {
		        HashMap<String,Object>hash;
		        hash=sec.get(i);
		        for(String key:hash.keySet())
		        {
		        System.out.println(hash.get(key));
		        }
		}
		         
		         HashMap<Object, Object>result=(HashMap<Object, Object>) res.jsonPath().getMap("support");
		         for(Object key:result.keySet())
		    {
		    System.out.println(result.get(key));
		    }
		         
		         Response res3=func.get_reponse_from_required_url_map(url1, body);
		         Object data2=res3.getBody().jsonPath().get("page");
		         System.out.println(res3.asString());
		         System.out.println(res3.getStatusCode());
		         System.out.println(data2);

	//file
		         
		         Response postResponse= RestAssured.given()
		        		 .auth().none()
		        		 .header("Content-Type","application/Json")
		        		 .contentType(ContentType.JSON)
		        		 .when()
		        		 .body(new File("./Payload.Json")).log().all()
		        		 .post("https://reqres.in/api/users");
		         System.out.println("Post responce is "+postResponse.asString());
		         System.out.println("Post responce status code is "+postResponse.statusCode());
   
   */
    
	 
	         Response res4=func.get_reponse_from_required_url_File(url1,new File("./Payload.Json"));
	       //  System.out.println(res4);
		         System.out.println(res4.asString());
		         System.out.println(res4.getStatusCode());
    
    
    
    
    
    }  
	
    
    }    
    
    
    
    
    
    
    
    
    
    

    
    
    
	

