import java.util.*;
public class TESARRL {
	
	public static void main (String[] args) {
		//ArrayList[][] table = new ArrayList[10][10];
		//table[0][0] = new ArrayList(); // add another ArrayList object to [0,0]
		//table[0][0].add(); // add object to that ArrayList
		
		//ArrayList<String> list = new ArrayList<String>(10);
		ArrayList<String>[][] list = new ArrayList[10][10];
		list[0][0] = new ArrayList<>();

         list[0][1]= new ArrayList<>();
		/*
		list[0][0] = new ArrayList<>()
		
		
		list[0][1].add();
		*/
		list[0][0].add("test");
		list[0][1].add("sdsd");
		System.out.println(list[0][0]); //[test]
		System.out.println(list[0][1]);
		
	}
}

