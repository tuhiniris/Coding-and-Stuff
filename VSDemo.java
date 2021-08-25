import java.util.*;
public class VSDemo{
    
    static int[] combo = new int[100];
    static HashMap<Integer,String>memo = new HashMap<>();
    static LinkedHashSet<String>filter = new LinkedHashSet<>();
    static int minans = 0;
    
    public static void ways(int n,int[] amounts,int[] combo,int startIndex, int sum, int index){
        if(sum==n){
            printArray(combo,index);
        }
        if(sum>n){
            return;
        }
        for(int i=0;i<amounts.length;i++){
            sum=sum+amounts[i];
            combo[index]=amounts[i];
            ways(n,amounts,combo,startIndex,sum,index+1);
            sum=sum-amounts[i];
        }
    }
    
    public static void printArray(int[] combo,int index){
        int pcount = 0;
        int gcount = 0;
        int rcount = 0;
        int orcount = 0;
        for(int i=0;i<index;i++){
            //System.out.println(combo[i]+" ");
            if(memo.containsKey(combo[i])){
                if(memo.get(combo[i]).equals("PINK")){
                    pcount++;
                }
            
            else if(memo.get(combo[i]).equals("GREEN")){
                gcount++;
            }
            
            else if(memo.get(combo[i]).equals("RED")){
                rcount++;
            }
            else if(memo.get(combo[i]).equals("ORANGE")){
                orcount++;
            }
        }
    }
        int nval[] = {pcount,gcount,rcount,orcount};
        for(int i=0;i<nval.length;i++){
            if (nval[i]==0){
                nval[i]=9999999;
            }
        }
        minans = Arrays.stream(nval).min().getAsInt();
        filter.add("# of PINK is "+pcount+" # of GREEN is "+gcount+" # of RED is "+rcount+" # of ORANGE is "+orcount);
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pink = sc.nextInt();
        int green = sc.nextInt();
        int red = sc.nextInt();
        int orange = sc.nextInt();
        int n = sc.nextInt();
        int amounts[] = {pink,green,red,orange};
        memo.put(pink,"PINK");
        memo.put(green,"GREEN");
        memo.put(red,"RED");
        memo.put(orange,"ORANGE");
        ways(n,amounts,combo,0,0,0);
        LinkedList<String> filterB = new LinkedList<>(filter);
        Iterator<String>i = filterB.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("Total combinations is "+filter.size());
        System.out.println("Minimum number of tickets to print is "+minans);
    }
}
