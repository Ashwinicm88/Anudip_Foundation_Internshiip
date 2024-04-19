package OOPS;

import java.util.Scanner;
public class Volume_Cylinder {
    public static void main(String[] args) {
        DisplayVolume obj=new DisplayVolume();
        obj.getInfo();
        obj.calculate();
        obj.Display();
    }
}

class VolumeData{
    Scanner sc=new Scanner(System.in);
    int radius,height;
    public void getInfo(){
        System.out.println("Enter radius and Height of Cylinder: ");
        radius=sc.nextInt();
        height=sc.nextInt();
    }
}
class Calculate_volume extends VolumeData{
   double volume;
    void calculate(){
        volume=3.14*(radius*radius)*(height);
    }
}
class DisplayVolume extends Calculate_volume{
    void Display(){
        System.out.println("Volume of Cylinder is: "+volume);
    }
}

