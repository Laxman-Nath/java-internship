package Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassWork {
	public static void main(String[] args) {
		Map<String, List<Integer>> marks = new HashMap<>();
		List<Integer> sum=new ArrayList<>();
		float total=0.0f;
		float avg=0.0f;
		float percent=0.0f;
		marks.put("Nepali", List.of(70, 80, 87, 69));
		marks.put("Maths", List.of(88, 78, 90, 60));
		marks.put("Computer", List.of(99, 69, 79, 89));
		marks.put("English", List.of(90, 60, 70, 80));
		marks.put("Social", List.of(50, 70, 80, 55));
		
		for(String k:marks.keySet()) {
			total=(int)marks.get(k).stream().mapToLong(Integer::intValue).sum();
			avg=total/4;
			percent=(total*100)/400;
			System.out.println(k+" "+marks.get(k)+" ,"+total+","+avg+","+percent);
		}

	
	
	}
}
