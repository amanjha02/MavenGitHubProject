package List;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

public class ArrayListEx {

/*ArrayList al=new ArrayList(); 
ArrayList<String> al1=new ArrayList<String>(); 
ArrayList a3=new ArrayList(10); 
ArrayList a4=new ArrayList(al); 
*/
	//@Test
	public void ArrayListExample() {
		
		ArrayList al=new ArrayList();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		al.add(1);
		al.add(2);
		System.out.println(al.size());
		System.out.println(al.get(6));
		for (Object ob:al) {
			System.out.println(ob);			
		}
				
String str=	(String)al.get(0);
System.out.println(str);

	}
	
	
	@Test
	public void GenericEx() {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		al.add("f");
		al.add(3);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
