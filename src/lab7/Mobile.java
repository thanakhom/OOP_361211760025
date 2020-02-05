package lab7;

public class Mobile {

    private int MobileID;
    private String Brand;
    private String Generation;
    private int Price;
    private String system;


    public Mobile(){}

    public Mobile(int MobileID,String Brand,String Generation,int Price,String system) {

        this.MobileID = MobileID;
        this.Brand = Brand;
        this.Generation = Generation;
        this.Price = Price;
        this.system = system;
    }
        public void gameing() { System.out.println("Mobile gameing "); }
        public void call() { System.out.println("Mobile call"); }
        public void message() { System.out.println("Mobile message");}
        public void internet() {  System.out.println("Mobile internet"); }

        public int getMobileID(){ return this.MobileID;}
        public void setMobileID(int MobileID){this.MobileID = MobileID;}

        public String getBrand(){ return this.Brand;}
        public void setBrand(String Brand){this.Brand = Brand;}

        public String getGeneration(){ return this.Generation;}
        public void setGeneration(String Generation){this.Generation = Generation;}

        public int getPrice(){ return this.Price;}
        public void setPrice(int Price){this.Price = Price;}

        public String getsystem(){ return this.system;}
        public void setsystem(String system){this.system = system;}

}//class
