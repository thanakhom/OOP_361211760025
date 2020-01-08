package lab4;

public class MethodsEx {

    //1.No return No parameter : คือ เมธอดที่ไม่มีการรับค่าพารามิเตอร์
    // และไม่คืนค่าใดกลับหลังจาก Process แล้ว
    //2.No return 1 or more parameter : คือ เมธอดที่มีการรับค่าพารามิเตอร์ตั้งแต่ 1 หรือมากกว่า
    // และไม่คืนค่าใดกลับหลังจาก Process แล้ว
    //3.Return 1 value , 1 or more parameter : คือ เมธอดที่มีการรับค่าพารามิเตอร์ตั้งแต่ 1 หรือมากกว่า
    // และมีการคืนค่ากลับไปยีงส่วนที่เรียกใช้งาน (เรียกใช้จากที่ไหน คืนค่าไปที่นั้น)
    public static void main(String[] args) {
        System.out.println("Hello from Main().");
        //callin method A() การเรียกใช้เมธอด A
        A();
        A();
        A();
        //calling method B()
        B("MIT","RUTS");
        //1.ประกาศตัวแปรชนิดเดียวกันมาเก็บค่าที่เมธอดส่งกลับมาให้
        int summation = C (10,20);
        System.out.println("The summation of x and y: "+summation);
        //2.เรียกใช้เมธอดโดยไม่ประกาศตัวแปรใดๆ มาเก็บค่าที่ส่งกลับมา


    }//main

    public static void A() {
        System.out.println("Hello From A().");

    }//A

    public static void B(String msg,String msg2) {
        System.out.println("Hello From B().");
        System.out.println("Message:"+msg);
        System.out.println("Message2:"+msg2);
    }//B

    public static int C (int X, int Y){
        System.out.println("Hello from C().");
        int sum = X + Y;

        return sum;

    }//C
}//class
