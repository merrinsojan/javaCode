package jar;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import general.functions;
import io.restassured.response.Response;
import jsonSimple.Add;
import jsonSimple.Add1;
public class apps {
	public static void main( String[] args) throws Exception
    {
		ObjectMapper Mapper=new ObjectMapper();
		/*Add1 add=new Add1();
		add.setName("Merrin");
		add.setJob("tester");
		add.setSkills(new String[] {"JAVA","C"});
		
		Mapper.writeValue(new File("D:/student.json"), add);*/
		
		JSONObject obj=new JSONObject();        
	    obj.put("name","lill");    
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
	Add1 mg=Mapper.readValue(content,Add1.class);
	System.out.println( mg.getName());
	//studentDataMap = Mapper.readValue(new File("student.json"), Map.class);
}
}