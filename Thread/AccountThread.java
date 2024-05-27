package Thread;

public class AccountThread extends Thread {
    static int balance =1000;
    public void run(){
        synchronized(AccountThread.class){
            if(balance>=800){
                System.out.println(Thread.currentThread().getName()+
                "Your balance is "+balance+ 
                " so you can withdraw the amount");
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                balance=200;
                System.out.println(Thread.currentThread().getName()+
                "After withdrawal your balance is "+balance);
            }
            else{
                System.out.println(Thread.currentThread().getName()+" your balance is "+balance+ "so u  can't withdraw amount");
            }
        }
    }
    
}

 class Account{
    public static void main(String[] args) {
        AccountThread obj=new AccountThread();
        obj.setName("Ashwini");
        AccountThread obj1=new AccountThread();
        obj1.setName("niki");
    }
}