package lab3;

import java.util.Scanner;

public class ExerciseLab3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter an number 1 :");
       double num1 =sc.nextInt();
        System.out.print(" Enter an number 2 :");
        double num2 =sc.nextInt();
        // test condition

        if (num1 > num2){
            System.out.println(num1+"more than"+num2);
        }else {
            System.out.println(num1+"less than"+num2);
        }
    }
}
