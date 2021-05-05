package jsonSimple;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Arrays;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class key {
public static void main(String[] args) throws Exception  {
 String key="state";

Object obj = new JSONParser().parse(new FileReader("D:/KJSONExample.json"));

       JSONObject jo = (JSONObject) obj;
       Iterator<Map.Entry> itr0 = jo.entrySet().iterator();
       while (itr0.hasNext()) {
           Map.Entry pair = itr0.next();
 if( (pair.getValue() instanceof String)||(pair.getValue() instanceof Long)) {
   if (key.equalsIgnoreCase((String) pair.getKey())) {
	   
            System.out.println(pair.getKey() + " : " + pair.getValue());
            JSONObject jo1 = new JSONObject();
               Map m=new HashMap<>();
               m.put(pair.getKey(), pair.getValue());
              //System.out.println(pair.getKey() + " : " + pair.getValue());
               jo1.put("n", m);
               FileWriter file = new FileWriter("./JSONExample.json");
               file.write(jo1.toJSONString());
               file.close();
            
   }
   }
     else if (pair.getValue() instanceof ArrayList) {
            List list=  (ArrayList) pair.getValue();
            Iterator itr2 = list.iterator();
            while (itr2.hasNext())
           {
            Iterator itr1 = ((Map) itr2.next()).entrySet().iterator();
            while (itr1.hasNext()) {
            Map.Entry pair1 = (Entry) itr1.next();
            if (key.equalsIgnoreCase((String) pair1.getKey())) {
            System.out.println(pair1.getKey() + " : " + pair1.getValue());
            
            JSONObject jo1 = new JSONObject();
               Map m=new HashMap<>();
               m.put(pair1.getKey(), pair1.getValue());
               jo1.put("n", m);
               FileWriter file = new FileWriter("./JSONExample.json");
               file.write(jo1.toJSONString());
               file.close();
            }
            }
           }
            }
     else if (pair.getValue() instanceof HashMap<?, ?>){
           Iterator<Entry<String, String>> itr1 = ((HashMap) pair.getValue()).entrySet().iterator();
           while (itr1.hasNext()) {
               Map.Entry pair1 = itr1.next();
               if (key.equalsIgnoreCase((String) pair1.getKey())) {
                System.out.println(pair1.getKey() + " : " + pair1.getValue());
                
                JSONObject jo1 = new JSONObject();
               Map m=new HashMap<>();
               m.put(pair1.getKey(), pair1.getValue());
               jo1.put("n", m);
               FileWriter file = new FileWriter("./JSONExample.json");
               file.write(jo1.toJSONString());
               file.close();
            }} 
           
     
     }
}
       
   
}




}