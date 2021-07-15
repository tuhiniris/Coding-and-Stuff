import java.util.*;
import java.io.*;  
class Time {
	
	static List<String> al = new ArrayList<>();
	private static void findsubsequences(String s,String ans)
    {
        if (s.length() == 0) {
			if(ans.equals("MOM")|| ans.equals("DAD"))
			{
            al.add(ans);
		}
            return;
        }
        findsubsequences(s.substring(1), ans + s.charAt(0)); 
        findsubsequences(s.substring(1), ans);
    }
	
	public static void main (String[] args)throws Exception
	{
		
		//Scanner sc= new Scanner(System.in);
		
		long startTime = System.nanoTime(); 
		InputStreamReader r=new InputStreamReader(System.in);    
		BufferedReader br=new BufferedReader(r);
		//String str= sc.next();
		String str = br.readLine();
		findsubsequences(str, "");
		
		System.out.println(al.size());
	
			long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("Millisecond : "+(duration)/1000000);
}
}
