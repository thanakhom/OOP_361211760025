package lab6;

public class exString {
    //Sring  เป็นข้อมูลชนิกข้อความ แต่ในภาภษาจาวา Sring เป็นคลาส
    //ดังนั้นการประกาศตัวแปรชนิด Sring (เป็นการประกาศ opject ของคลาส)
    //จึงสามารถเรียกใช้เมธตอดต่างๆ ที่อยู่ในคลาส Sring ได้

    public static void main(String[] args) {

        String msg = "Hello,Saiyai !!!";

        // length ()  ใช้ในการนับจำนวนตัวอักษรในข้อความ ส่งค่ากลับเป็นจำนวนเต็ม (int)
        int len = msg.length();
        System.out.println(len);

        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
        System.out.println(msg.charAt(5)); //แสดงตัวอักษรตำแหน่งที่ 5 ของข้อความ

        //concatenating String  คือ การต่อข้อความ
        //1.ใช้เครื่องหมาย +

        String msg2 = "RUTS";
        String msgCon = msg + msg2;

        System.out.println(msgCon);

        //2.ใช้ concet()

        String msgCon2 = msg.concat(msg2);
        System.out.println(msgCon2);

        //compare String คือ การเปรียบข้อความ 2 ข้อความ
        String m1 = "Saiyai RUTS";
        String m2 = "Saiyai ";

        //1.ใช้เครื่องหมาย == เหมือนกันเป็น true ต่างกันเป็น false
        if (m1 == msg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(m1 == m2 ? "Yes" : "No");

//2. equal()การทำงานจะเหมือนกับเครื่องหมาย ชช
        System.out.println(m1.equals(m2) ? "Yes" : "No");

        if (m1.equals(m2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


//3.conpareTo() ถ้าข้อความเหมือนเป็น 0 , ข้อความทางซ้ายมากกว่าเป็น 1 , ข้อความทางวามากกว่าเป็น -1

        int x = m1.compareTo(m2);
        System.out.println(x);

    }//main

}//class
