package general;

import java.io.File;
import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import jsonSimple.Add;

public class functions {
	Response res;
	public Response get_reponse_from_required_url(String url) {
		res=RestAssured.given().when().get(url).then().contentType(ContentType.JSON).extract().response();
		return res;
	
	

	}
	 public static Response get_reponse_from_required_url(String url,String body)throws Exception{
		    RestAssured.baseURI  = url;
		    Response res;
		    try{
		        res=RestAssured.given().header("Content-Type", "application/json; charset=utf-8").body(body).when().post("").then().contentType(ContentType.JSON).extract().response();
		    }
		    catch(Throwable t){
		        res=RestAssured.given().header("Content-Type", "application/json; charset=utf-8").body(body).when().post("").then().contentType("application/json\r\n").extract().response();
		    }
		   
		    return res;  
		}


		public static Response get_reponse_from_required_url_map(String url,HashMap body)throws Exception{
		    RestAssured.baseURI  = url;
		    Response res;
		    try{
		        res=RestAssured.given().header("Content-Type", "application/json; charset=utf-8").body(body).when().post("").then().contentType(ContentType.JSON).extract().response();
		    }
		    catch(Throwable t){
		        res=RestAssured.given().header("Content-Type", "application/json; charset=utf-8").body(body).when().post("").then().contentType("application/json\r\n").extract().response();
		       // res=RestAssured.given().header("Content-Type", "application/json; charset=utf-8").body(body).when().post("").then().contentType(ContentType.JSON).extract().response();
		    }
		   
		    return res;
		   
		}
		
		public Response get_reponse_from_required_url_File(String url1, File body) {
			RestAssured.baseURI  = url1;
		    Response res;
		    try{
		        res=RestAssured.given().header("Content-Type", "application/json; charset=utf-8").body(body).when().post("").then().contentType(ContentType.JSON).extract().response();
		    }
		    catch(Throwable t){
		        res=RestAssured.given().header("Content-Type", "application/json; charset=utf-8").body(body).when().post("").then().contentType("application/json\r\n").extract().response();
		    }
		   
		    return res;	
		}

		public Response get_reponse_from_required_url_class(String url1, Object body) {
			RestAssured.baseURI  = url1;
		    Response res;
		    try{
		        res=RestAssured.given().header("Content-Type", "application/json;").body(body).when().post(url1).then().contentType(ContentType.JSON).extract().response();
		    }
		    catch(Throwable t){
		    	 res=RestAssured.given().header("Content-Type", "application/json; charset=utf-8").body(body).when().post(url1).then().contentType("application/json\r\n").extract().response();
		    }
		   
		    return res;	
		}
		public Response get_reponse_from_required_url_mapper(String url, Add a) {
			RestAssured.baseURI  = url;
		    Response res;
		    try{
		        res=RestAssured.given().header("Content-Type", "application/json;").body(a).when().post(url).then().contentType(ContentType.JSON).extract().response();
		    }
		    catch(Throwable t){
		    	 res=RestAssured.given().header("Content-Type", "application/json; charset=utf-8").body(a).when().post(url).then().contentType("application/json\r\n").extract().response();
		    }
			return res;
		}

}











//.log().all()
