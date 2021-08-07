import java.util.ArrayList;
public class ListToArray {
   public static void main(String args[]){
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(1);
      list.add(2);
      list.add(3);

      System.out.println("Contents of list ::"+list);
int[] myArray = list.stream().mapToInt(i->i).toArray();
      for(int i=0; i<myArray.length; i++){
         System.out.println("Element at the index "+i+" is ::"+myArray[i]);
      }
   }
}
