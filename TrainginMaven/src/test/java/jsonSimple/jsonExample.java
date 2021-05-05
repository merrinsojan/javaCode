package jsonSimple;

import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class jsonExample {
	public static void main(String args[]) {
		JSONObject simpleObj=new JSONObject();
		simpleObj.put("name", "user");
		simpleObj.put("age", "20");
		simpleObj.put("job", "leader");
		System.out.println(simpleObj);                 
		System.out.println(simpleObj.getClass());
		
		JSONArray arr=new JSONArray();
		arr.add("Training");
		arr.add("Class");
		simpleObj.put("arr", arr);
		System.out.println(simpleObj); 
		//System.out.println(simpleObj.remove("job"));
		//simpleObj.clear();
		//System.out.println(simpleObj.isEmpty());
		//System.out.println(simpleObj); 
       // System.out.println(simpleObj.replace("age","45")); 
    	
	//	System.out.println(simpleObj.containsValue("user"));
		 
	//	System.out.println(simpleObj.entrySet());
	//	System.out.println(simpleObj);
		
		
        HashMap ob=new HashMap();
        ob.put("name", "Sona");
        ob.put("Designation", "leader");
        ob.put("age", "30");
        ob.put("salary", new Double(250000));
        System.out.println(ob.getClass()); 
        String jsonText=JSONValue.toJSONString(ob);
        System.out.println(jsonText);  
        System.out.println(jsonText.getClass()); 
		
		
        
        
        
		
		

		
		
	}

}
