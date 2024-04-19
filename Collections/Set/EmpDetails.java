package Collections.Set;
import java.util.*;
public class EmpDetails {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 5 employee Id and Name: ");
    int ID[]=new int[5];
    String empName[]=new String[5];

    Set<String> empDetails=new HashSet<String>();
    for(int i=0;i<5;i++){
        ID[i]=sc.nextInt();
       empName[i]=sc.next();
       String empData="EmpID: "+ID[i]+" Empname: "+empName[i];
       empDetails.add(empData);
    }
    for(String data:empDetails){
        System.out.println(data);
    }
   sc.close();
 }   
}
// End of the Program
