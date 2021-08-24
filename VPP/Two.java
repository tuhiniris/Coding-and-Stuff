import java.util.*;
public class Two extends TestObjArr {
	
	public Two(int id,String name) {
    super(id, name);
	}
	
	public static void main (String[] args) {
		
		Two emp1 = new Two(10,"Vipra");
		Two emp2 = new Two(11,"Banu");
		Two emp3 = new Two(12,"Payel");
		List<Two>arr = new ArrayList<>();
		arr.add(emp1);
		arr.add(emp2);
		arr.add(emp3);
		System.out.println(arr);
		String selectedname = arr.get(0).nami();
		System.out.println(selectedname);	
		String selectedname2 = arr.get(1).nami();
		System.out.println(selectedname2);	
		String selectedname3 = arr.get(2).nami();
		System.out.println(selectedname3);
	}
}
