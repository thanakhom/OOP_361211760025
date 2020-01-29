package lab6;

import java.util.StringTokenizer;

public class exStringBuffer {

    public static void main(String[] args) {

        //StringBuffer เป็นคลาสที่มีเมธตอดต่างๆ
        //ที่สามารถปรับปรุงแก้ไขข้อมูลที่เป็น String ได้มากกว่าคลาส String ทั่วไป

        StringBuffer StrBuf = new StringBuffer("Hello");

        //append ()ใช้สำหรับต่อ String
        StrBuf.append("Saiyai");
        System.out.println(StrBuf);
        System.out.println(StrBuf.reverse()); // เป็นการสลับข้อความจากหน้าไปหลังจากหลังไปหน้า
        StrBuf.delete(0,6);
        System.out.println(StrBuf);

        //StringTokenizer
        String s = "In your head, in your head\n" +
                "Zombie, zombie, zombie-ie-ie\n" +
                "What's in your head, in your head\n" +
                "Zombie, zombie, zombie-ie-ie, oh";

        StringTokenizer tokenizer = new StringTokenizer(s);
        int countWord = tokenizer.countTokens();
        System.out.println("Word count from message:"+countWord);

        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }

    }//main


}//class
