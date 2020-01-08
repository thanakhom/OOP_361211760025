package lab4;

import java.util.Scanner;

public class Method_Overloading {

    //Method_Overloading คือ เมธอดที่มีชื่อเหมือนกัน
    //แต่มีการรับพารามิเตอร์และการคืนค่ากลับแตกต่างกัน

    public static void main(String[] args) {
    System.out.println(sum(20,40));
    System.out.println(sum(12.5,50.3));
    System.out.println(sum(50,60.5));

    }//main
    public static  int sum(int x,int y){
        return x + y;
    }//int
    public static  double sum(double x,double y){
        return x + y;
    }//doudle
}//class
