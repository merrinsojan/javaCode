package jsonSimple;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class recurkey {

public static void main(String[] args) throws Exception  {
Object obj = new JSONParser().parse(new FileReader("D:/KJSONExample.json"));
JSONObject jo = (JSONObject) obj;
     fu(jo);
     Object obj9 = new JSONParser().parse(new FileReader("./JSONExample.json"));
     JSONObject jo8 = (JSONObject) obj9;
     System.out.println(jo8);
    
}

public static void fu(JSONObject jc) throws FileNotFoundException, IOException, ParseException {
String key="age";
        Iterator<Map.Entry> itr0 = jc.entrySet().iterator();
        while (itr0.hasNext()) {
            Map.Entry pair = itr0.next();
            if(( (pair.getValue() instanceof String))||(pair.getValue() instanceof Long)) {
            if (key.equalsIgnoreCase((String) pair.getKey())) {
           // System.out.println(pair.getKey() + " : " + pair.getValue());
         
            JSONObject jo1 = new JSONObject();
           
                 jo1.put(pair.getKey(), pair.getValue());
                 
                 FileWriter file = new FileWriter("./JSONExample.json");
                 file.write(jo1.toJSONString());
                 file.close();
                // break;
            }}
            else if (pair.getValue() instanceof HashMap<?, ?>){
           Iterator<Entry<String, String>> itr1 = ((HashMap) pair.getValue()).entrySet().iterator();
           JSONObject jo6 = new JSONObject();
           while (itr1.hasNext()) {
               Map.Entry pair1 = itr1.next();
              jo6.put(pair1.getKey(), pair1.getValue());
              fu(jo6);
            // System.out.println(jo6);
              
               }
           }
          else if (pair.getValue() instanceof ArrayList) {
           
            List list=  (ArrayList) pair.getValue();
           // System.out.println(list);
            Iterator itr10 = list.iterator();
            JSONObject jo7;
            //System.out.println(jo7);
            JSONArray ja;
            int i=1;
            while (itr10.hasNext())
           {
            i++;
            jo7 = new JSONObject();
                      jo7.put(i, itr10.next());
                       fu(jo7);
                       //System.out.println(jo7);
                     
            }
       }
/*else if (pair.getValue() instanceof Long){
if (key.equalsIgnoreCase((String) pair.getKey())) {
           // System.out.println(pair.getKey() + " : " + pair.getValue());
            JSONObject jo1 = new JSONObject();
                 Map m=new HashMap<>();
                 m.put(pair.getKey(), pair.getValue());
                 jo1.put("new", m);
                 FileWriter file = new FileWriter("./JSONExample.json");
                 file.write(jo1.toJSONString());
                 file.close();
}
            }*/
}
}
}
