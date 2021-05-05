package jsonSimple;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWriteExample
{
 public static void main(String[] args) throws IOException 
 {

     JSONObject jo = new JSONObject();
       
    
     jo.put("firstName", "John");
     jo.put("lastName", "Smith");
     jo.put("age", 25);
       
     Map m = new LinkedHashMap(4);
     m.put("streetAddress", "21 2nd Street");
     m.put("city", "New York");
     m.put("state", "NY");
     m.put("postalCode", 10021);   
     
     jo.put("address",m);
       
     JSONArray ja = new JSONArray();
       
     m = new LinkedHashMap(2);
     m.put("type", "home");
     m.put("number", "212 555-1234");   
     ja.add(m);
       
     m = new LinkedHashMap(2);
     m.put("type", "fax");
     m.put("number", "212 555-1234");
     ja.add(m);
     jo.put("phoneNumbers",ja);
      
       
     FileWriter file = new FileWriter("D:/WriteJsonFile.json");
     file.write(jo.toJSONString());
     file.close();

 }
}
