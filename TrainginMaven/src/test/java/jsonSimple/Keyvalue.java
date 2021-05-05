package jsonSimple;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Keyvalue {

public static void main(String[] args) throws Exception  {

 String key="type";

Object obj = new JSONParser().parse(new FileReader("D:/key.json"));

       JSONObject jo = (JSONObject) obj;
       Set<String> keys = jo.keySet();
       for (String temp : keys) {
           System.out.println(temp);
        }
       
       Iterator<Map.Entry> itr0 = jo.entrySet().iterator();
       while (itr0.hasNext()) {
           Map.Entry pair = itr0.next();
           if (key.equalsIgnoreCase((String) pair.getKey())) {
           System.out.println(pair.getKey() + " : " + pair.getValue());
           String val=(String) pair.getValue();
           JSONObject jo1 = new JSONObject();
           Map m = new LinkedHashMap();
           m.put(key, val);
           jo1.put("new", m);
           FileWriter file = new FileWriter("./KJSONExample.json");
           file.write(jo1.toJSONString());
           file.close();
           }
       }
       Map address = ((Map)jo.get("address"));
       
       Iterator<Map.Entry> itr1 = address.entrySet().iterator();
       while (itr1.hasNext()) {
           Map.Entry pair = itr1.next();
           if (key.equalsIgnoreCase((String) pair.getKey())) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
           String val=(String) pair.getValue();
           JSONObject jo1 = new JSONObject();
           Map m = new LinkedHashMap();
           m.put(key, val);
           jo1.put("address", m);
           FileWriter file = new FileWriter("./KJSONExample.json");
           file.write(jo1.toJSONString());
           file.close();
           
}

       }
       JSONArray ja = (JSONArray) jo.get("phoneNumbers");
       Iterator itr2 = ja.iterator();
         
       while (itr2.hasNext())
       {
           itr1 = ((Map) itr2.next()).entrySet().iterator();
           while (itr1.hasNext()) {
               Map.Entry pair = itr1.next();
              if (key.equalsIgnoreCase((String) pair.getKey())) {
                System.out.println( pair.getValue());
                String val=(String) pair.getValue();
               JSONObject jo1 = new JSONObject();
               Map m = new LinkedHashMap();
               m.put(key, val);
               jo1.put("new", m);
               FileWriter file = new FileWriter("./KJSONExample.json");
               file.write(jo1.toJSONString());
               file.close();
}
               
           }
       }
}




}