package Inheritance;

public class EmpDetails {
    private static int empId;
    private static String empName,companyName;
    public static void setData( int id,String name,String cName){
        empId=id;
        empName=name;
        companyName=cName;
    }
    public static void getData(){
        System.out.println(" **Employee Details** ");
        System.out.println("Employee Id: "+empId);
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Company Name: "+companyName);
    }
    public static void main(String[] args) {
        EmpDetails.setData(1,"Ashwini","Anudip Foundation");
        EmpDetails.getData();
    }
}
