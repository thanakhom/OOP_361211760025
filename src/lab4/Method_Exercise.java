package lab4;

import java.util.Scanner;

public class Method_Exercise {
    //1. เขียนโปรแกรมเพืิ่อรับค่าจำนวนจริง 2 จำนวน จากนั้นสร้างเมธอดสำหรับ
    //บวก ลบ คูณ หาร แสดงผลทางจอภาพ

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double x =sc.nextDouble();
        System.out.print("Enter number 2: ");
        double y =sc.nextDouble();

        //dissplay
        System.out.println("The summation of "+x+"and"+y+": "+sum(x,y));
        System.out.println("The sub of "+x+"and"+y+": "+sub(x,y));
        System.out.println("The mul of "+x+"and"+y+": "+mul(x,y));
        System.out.println("The div of "+x+"and"+y+": "+div(x,y));

    }

    //บวก
    public static double sum (double x,double y){
        return x + y;
    }

    //ลบ
    public static double sub (double x,double y){
        return x-y;
    }

    //คูณ
    public static double mul (double x,double y){
        return x*y;
    }

    //หาร
    public static double div (double x,double y){
        return x/y;
    }

}//class
