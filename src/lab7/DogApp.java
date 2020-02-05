package lab7;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class DogApp {

    public static void main(String[] args) {
        //create opject สร้างวัตถุ
        //1.ใช้ default constructor

        Dog dog1 = new Dog();

        dog1.setName("Dang");
        dog1.setAge(3);
        dog1.setHairColor("Brown");

        System.out.println(dog1.getName());
        System.out.println(dog1.getage());
        System.out.println(dog1.getHairColor());

        //2.ใช้ constructor ที่มีการรับพารามิเตอรื
        //เป็นการสร้างวัตถุ พร้อมกับกำหนดข้อมูลให้กับ;y956
        Dog dog2=new Dog("Dum",10,"Black");

        System.out.println(dog2.getName());
        System.out.println(dog2.getage());
        System.out.println(dog2.getHairColor());

      List<Dog> dogList= new ArrayList<Dog>();
        dogList.add(dog1);
        dogList.add(dog2);
        System.out.println(dogList);

        for (Dog d:dogList){
            System.out.println(d.getName());
        }

    } //main


}//class
