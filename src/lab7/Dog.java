package lab7;

import java.util.jar.Attributes;

public class Dog {
    //Attributes
    private String name;
    private int age;
    private String hairColor;
    //constructer คือ เมธตอดที่มีชื่อเดียวกันกับชื่อคลาส เมื่อมีการสร้างวัตถุ จะเป็นการเรียกใช้งาน constructer เสมอ
    //1. default constructer
    public Dog(){}
    //2.constructer สร้างขึ้นมาใหม่
    public Dog(String name,int age,String hairColor){

      this.name=name;
      this.age=age;
      this.hairColor=hairColor;


    }
    //Behavior คือ พฤติกรรมของวัตถุ
    public void barking() {
        System.out.println("Dog barking");
    }

    public void eating() {
        System.out.println("Dog eating");
    }

    public void sleeping() {
        System.out.println("Dog sleeping");
    }
    //getter and seter methods ใช้สำหรับการอ่านและปรับปรุงข้อมูล Attributes ของคลาส
    //getter  ใช้อ่านข้อมูล
    //setter ใช้ปรับปรุงหรือเปลี่ยนแปลงข้อมูล
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
   }
    public int getage(){
        return this.age;
   }
    public void setAge(int age){
       this.age = age;
    }
    public String getHairColor(){
        return this.hairColor;
    }
    public void setHairColor(String hairColor){
        this.hairColor =hairColor;
    }
}//class
