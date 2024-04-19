package Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        int arr[]={25,48,16,25,98,54};
        
        Set<Integer> set= new HashSet<Integer>();
        
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);

        TreeSet<Integer> sortedSet=new TreeSet<Integer>(set);
        System.out.println("The sorted set is: "+sortedSet);
        System.out.println("The first element is: "+sortedSet.first());
        System.out.println("The last element is: "+sortedSet.last());

    }
}
