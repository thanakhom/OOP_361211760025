package lab7;

public class MobileStore {
    public static void main(String[] args) {

        Mobile mobile1 = new Mobile();


        mobile1.setMobileID(1001);
        mobile1.setBrand("Wiko");
        mobile1.setGeneration("Sunny 4 Plus");
        mobile1.setPrice(2090);
        mobile1.setsystem("Android 9 Go");


        System.out.println(mobile1.getMobileID());
        System.out.println(mobile1.getBrand());
        System.out.println(mobile1.getGeneration());
        System.out.println(mobile1.getPrice());
        System.out.println(mobile1.getsystem());


        Mobile mobile2=new Mobile (2002,"Apple","iphone 11 pro",35900,"ios13");
        System.out.println(mobile2.getMobileID());
        System.out.println(mobile2.getBrand());
        System.out.println(mobile2.getGeneration());
        System.out.println(mobile2.getPrice());
        System.out.println(mobile2.getsystem());


        Mobile mobile3=new Mobile (3003,"Samsung","Galxy E7",11500,"Android 4.4");
        System.out.println(mobile3.getMobileID());
        System.out.println(mobile3.getBrand());
        System.out.println(mobile3.getGeneration());
        System.out.println(mobile3.getPrice());
        System.out.println(mobile3.getsystem());

    }//main
}//class
