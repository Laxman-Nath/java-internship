package Collections.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetDemo {
public static void main(String [] args) {
//	Set<Integer> set=new HashSet<>();
//	Set<Integer> set=new LinkedHashSet<>();
	Set<Integer> set=new TreeSet<>();
	
	set.add(23);
	set.add(24);
	set.add(25);
	set.add(12);
	set.add(13);
	set.add(6);
	set.add(1);
	Iterator<Integer> iterator=set.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}

}
