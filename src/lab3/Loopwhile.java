package lab3;

import java.util.Scanner;

public class Loopwhile {
    public static void main(String[] args) {
        //loopwhile: ใช้สำหรับการทำงานซ้ำในกรณีที่ไม่ทราบจำนวนรอบที่แน่่นอน
        //โครงสร้าง while

        //while (เงื่อนไข){
        //  คำสั่งเงื่อนไขเป็นจริง
        //  }
        Scanner sc = new Scanner(System.in);
        int x = 1;
        while (x!= 0) {
            System.out.print("Enter an number:");
            x = sc.nextInt();
        }
        System.out.println("Good bye.");
    }
}
