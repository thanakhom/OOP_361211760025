package lab3;

public class LoopFor {
    public static void main(String[] args) {

        //loopfor: ใช้ในกรณีที่ทราบจำนวนรอบการทำซ้ำที่ชัดเจน
        //โครงสร้าง for
        //for (ค่าเริ่มต้น; เงื่อนไข; ปรับปรุงค่าตัวนับ){
        // คำสั่งเมื่อเงื่อนไขเป็นเท็จ;
        // }
        for (int i = 1; i <= 20; i++) {
            System.out.println("Hello.");
            if (i%2 ==0)
                System.out.println("RUTS");
        }


    }//main

}//class
