import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.LocalDate;


/* Name of the class has to be "Main" only if the class is public. */
public class B_Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		try {
		    
		    Scanner sc = new Scanner(System.in);
		    int t = sc.nextInt();
		    while(t-->0){
		        sc.nextLine();
		        String day="", m="", yr="", date="";
		        String s = sc.nextLine();
		        int year=0,d=0,mon=0;
		        for (int i=0;i<s.length(); i++){
		            
		            if(s.charAt(i) == 'd' || s.charAt(i) == 'D'){
		                if(Character.isDigit(s.charAt(i+1)) && Character.isDigit(s.charAt(i+2))){
		                    day = s.substring(i+1,i+3);
		                    d = Integer.parseInt(day);
		                } else{
		                    day = "00";
		                }
		                //System.out.println(day);
		            }
		            if(s.charAt(i) == 'm' || s.charAt(i) == 'M'){
		                if(Character.isDigit(s.charAt(i+1)) && Character.isDigit(s.charAt(i+2))){
		                    m = s.substring(i+1,i+3);
		                    mon = Integer.parseInt(m);
		                }else{
		                    m = "00";
		                }
		                //System.out.println(m);
		            }   
		            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
		                if(Character.isDigit(s.charAt(i+1)) && Character.isDigit(s.charAt(i+2)) && Character.isDigit(s.charAt(i+3)) && Character.isDigit(s.charAt(i+4))){
		                    yr = s.substring(i+1,i+5);
		                    year = Integer.parseInt(yr);
		                }else{
		                    yr = "0000";
		                }
		                //System.out.println(yr);
		            }
		        }
                
                // if(d>31 || mon>12){
                    
                //     break;
                // }
                //System.out.println(d);
                if((m=="01" || m=="03"|| m=="05" || m=="07" || m=="08" || m=="10" || m=="12") || (d>=1 && d<=31)){
                    String dname = findDay(mon,d,year);
                    System.out.println("MM-DD-YYYY "+m+"-"+day+"-"+yr+" valid "+dname+"\nMM-DD-YY "+m+"-"+day+"-"+yr.substring(2,4)+" valid "+dname+"\nDD-MM-YYYY "+day+"-"+m+"-"+yr+" valid "+dname+"\nDD-MM-YYYY "+day+"-"+m+"-"+yr.substring(2,4)+" valid "+dname);
                }
                else if((m=="04" || m=="06" || m=="09" || m =="11") || (d>=1 && d<=30)){
                    String dname = findDay(mon,d,year);
                    System.out.println("MM-DD-YYYY "+m+"-"+day+"-"+yr+" valid "+dname+"\nMM-DD-YY "+m+"-"+day+"-"+yr.substring(2,4)+" valid "+dname+"\nDD-MM-YYYY "+day+"-"+m+"-"+yr+" valid "+dname+"\nDD-MM-YYYY "+day+"-"+m+"-"+yr.substring(2,4)+" valid "+dname);
                }
                else if((m == "02" && (d>=1 || d<=28)) || (m == "02" && (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) && (d>=1 || d<=29))){
                    String dname = findDay(mon,d,year);
                    System.out.println("MM-DD-YYYY "+m+"-"+day+"-"+yr+" valid "+dname+"\nMM-DD-YY "+m+"-"+day+"-"+yr.substring(2,4)+" valid "+dname+"\nDD-MM-YYYY "+day+"-"+m+"-"+yr+" valid "+dname+"\nDD-MM-YYYY "+day+"-"+m+"-"+yr.substring(2,4)+" valid "+dname);
                } else {
                    System.out.println("MM-DD-YYYY "+m+"-"+day+"-"+yr+" Invalid. cannot be computed"+"\nMM-DD-YY "+m+"-"+day+"-"+yr.substring(2,4)+" Invalid. cannot be computed"+"\nDD-MM-YYYY "+day+"-"+m+"-"+yr+" Invalid. cannot be computed"+"\nDD-MM-YYYY "+day+"-"+m+"-"+yr.substring(2,4)+" Invalid. cannot be computed");
                }
                
		   }
		} catch(Exception e) {
		} finally {
		}
	}
	public static String findDay(int month, int day, int year) {

    LocalDate localDate = LocalDate.of(year, month, day);

    java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
    //System.out.println(dayOfWeek);

    String word = dayOfWeek.toString();
    return word.charAt(0) + word.substring(1).toLowerCase();
    }
	
}
