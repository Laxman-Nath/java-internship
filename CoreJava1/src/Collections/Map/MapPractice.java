package Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {
  public static void main(String [] args) {
//	  Map<String ,String > names=new HashMap<>();
//	  Map<String ,String > names=new LinkedHashMap<>();
	  Map<String ,String > names=new TreeMap<>();
	  names.put("laxman","mnr");
	  names.put("roshan","daijee");
	  names.put("pradeep","aithpur");
	  names.put("rohit","chaumala");
	  names.put("abishek", "olani");
	  
	  
	  for(String key:names.keySet()) {
		  System.out.println(key+","+names.get(key));
	  }
  }
}
