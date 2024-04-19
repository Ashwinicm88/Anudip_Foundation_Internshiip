package Pattern;

/*
*  4 3 2 1
*  4 3 2
*  4 3
*  4
*/

public class Num_rev {
   public static void main(String[] args) {
       for(int i=4;i>=1;i--){
           for(int j=1;j<=i;j++){
               System.out.print(j+" ");
           }
           System.out.println();
       }
   }
}
