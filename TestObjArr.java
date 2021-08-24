import java.util.*;

public class TestObjArr {
	
	int id;
	String name;
	
	public TestObjArr(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	String nami(){
		return name;
	}
	
	void display(){
		System.out.println("My Name is "+name+" and ID is "+id);
	}
	
	public static void main (String[] args) {
		TestObjArr emp1 = new TestObjArr(10,"Vipra");
		TestObjArr emp2 = new TestObjArr(11,"Banu");
		TestObjArr emp3 = new TestObjArr(12,"Payel");
		List<TestObjArr>arr = new ArrayList<>();
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

