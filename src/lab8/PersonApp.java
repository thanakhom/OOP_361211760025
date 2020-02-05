package lab8;

public class PersonApp {
    public static void main(String[] args) {

        Student std1=new Student("361211760025",
                "thanakhom  thongmee",
                "MIT221",
                "Information Technology");

        Person p1=new Person("123456789",
                "Thanakhom  Thongmee");
        System.out.println(std1.getName());
        System.out.println(p1.getName());

    }//main

}//class
