import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapicollectionframeworl {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("shubh", "actor");
		map.put("priyo","actress");
		System.out.println(map);
		Set<String> keys = map.keySet();
		for(String key : keys) 
		System.out.println(map.get(key));
		
	}

}
