// package JAVA.LOOP;
public class One_hundred {
    public static void main(String[] args) {
        System.out.print("Even numbers are: ");
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");;
            }
        }
        System.out.println("\nOdd numbers are: ");
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
