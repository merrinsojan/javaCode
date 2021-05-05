package jar;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.JsonArray;

import general.functions;
import io.restassured.response.Response;
import jsonSimple.Add;

public class SApp {
	public static void main( String[] args) throws Exception
    {
		functions func=new functions();
		
		JSONObject obj=new JSONObject();        
		obj.put("name","morpheus");    
		obj.put("job","leader"); 
		
		JSONArray ar=new JSONArray();      
		ar.add("JAVA");   
		ar.add("c");   
		obj.put("skills", ar);     
		
		JSONObject ob=new JSONObject();      
		ob.put("companyName", "XYZ");      
		ob.put("emailID", "morpheus@xyz.com");      
		obj.put("details",ob);      
		String content=obj.toJSONString();      
		Response res=func.get_reponse_from_required_url("https://reqres.in/api/users", content);       
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		Add a=new Add("morpheus","leader",new String[]{"JAVA","c"},"XYZ","morpheus@xyz.com");  
		
		res=func.get_reponse_from_required_url_class("https://reqres.in/api/users", a); 
		//res.body().as(Add.class);
		 System.out.println(res.asString());
			System.out.println(res.getStatusCode());
			  
}
}