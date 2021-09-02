import java.util.*;
public class Main2 {
   static boolean isValid(String email) {
      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      return email.matches(regex);
   }
	
	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int x=0;x<n;x++){	
			String email = sc.nextLine();
			
			if(isValid(email)==(true)){
				System.out.println("True");
			}
			else{
				System.out.println("False");
			}
				

		}		
		
	}
}


