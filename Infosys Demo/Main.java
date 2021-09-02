import java.util.*;
public class Main2 {
   static boolean isValid(String email) {
	  try{
      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      return email.matches(regex);
		}
		catch(Exception e){
			return false;
		}
   }
	
	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int x=0;x<n;x++){			
			
			String email = sc.nextLine();
			try{
			System.out.println("Is the above E-mail ID valid? " + isValid(email));
		}
		catch(Exception e){
			System.out.println("False");
		}			
			}
		}		
		
	}


