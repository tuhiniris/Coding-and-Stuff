import java.util.*;
class ThreeHalf {
	
	String type = "DAD";
	
	void hello(){
		System.out.println("I AM "+type);
	}
}
	
public class Three extends ThreeHalf{	
	
	String type = "SON";
	void hello(){
		System.out.println("I AM "+type);
	}
	
	public static void main (String[] args) {
		Three son = new Three();
		son.hello();
	}
}

