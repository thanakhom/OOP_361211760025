package lab3;

import java.util.Scanner;

public class Control3 {
    public static void main(String[] args) {

        //if-else-if -> คำสั่งที่มีการทดสอบหลายเงื่อนไข เงื่อนไขใดเป็นจริงจะทำอย่างที่คำสั่งนั้นคำสั่งเดียว
        //ในกรณีที่เงื่อนไขทั้งหมดเป็นเท็จ จะทำคำสั่ง else
        //if (เงื่อนไข 1){
        //  คำสั่งเมื่อเงื่อนไขที่ 1 เป็นจริง;
        // }else if (เงื่อนไข 2 ){
        //  คำสั่งเมื่อเงื่อนไขที่ 2 เป็นจริง;
        // }else ifเงื่อนไขที่ n ){
        //  คำสั่งเมื่อเงื่อนไขที่ n เป็นจริง;
        // }else{
        //  คำสั่งทุกเงื่อนไขเป็นเท็จทั้งหมด;
        // }

        //อายุมากกว่า 60 คือ แก่, อายุอยู่ระหว่าง 20-60 คือ วัยรุ่น , อายุต่ำกว่า 20 คือเด็ก

        Scanner sc = new Scanner(System.in);
        System.out.print("How old are you?:");
        int age = sc.nextInt();

        //test condtion
        if (age<20){
            System.out.println("You are young.");
        }else if (age<=60){
            System.out.println("You are teenager.");

        }else {
            System.out.println("You are old.");
        }

        }

}
