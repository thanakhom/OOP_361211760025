package lab7;

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


    } //main


}//class
