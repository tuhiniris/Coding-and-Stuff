import java.util.*;
public class KKHKKR {
	
	public static List<Integer> performOperations(List<Integer>arr, List<List<Integer>> operations){
		
	
	List<Integer> arr2 = new ArrayList<Integer>();
	for (int i = 0; i<operations.size(); i++){
		arr2 = operations.get(i);
		int temp;
		temp = arr.get(arr2.get(0));
		arr.set(arr2.get(0),arr.get(arr2.get(1)));
		arr.set((arr2.get(1)),temp);
		.get.get  .add.add		
	}
	return arr;
	}
	
	public static void main (String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		List<List<Integer>> operations = new ArrayList<>();
				List<Integer> list = new ArrayList<Integer>();
                 list.add(0);
                 list.add(2);
                 operations.add(list);
         List<Integer> list2 = new ArrayList<Integer>();
                 list2.add(1);
                 list2.add(2);
                 operations.add(list2);
				
			    List<Integer> list3 = new ArrayList<Integer>();
                 list3.add(0);
                 list3.add(2);
                 operations.add(list3);
			
			System.out.println(performOperations(arr, operations));
		
	}
}

