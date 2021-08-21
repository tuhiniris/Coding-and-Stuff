import java.util.*;
public class panji {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer>arr = new ArrayList<>();
		for(int i=0;i<n;i++){
			arr.add(sc.nextInt());			
		}
		
		Collections.sort(arr);
		for(int i=0;i<arr.size();i++){
			if (i%2==0){
				System.out.print((arr.get(i))+" ");
			}
		}
		
	}
}

