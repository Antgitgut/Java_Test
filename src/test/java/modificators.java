public class modificators {
    public static void  main(String[] args) {

        person Sam = new person("Sam", 20, "Highway str., 45", "+1 35322 54 80");
        Sam.viewName(); //public
        Sam.viewAge(); //private
        Sam.viewAddress(); //public
        Sam.viewPhone(); //private

        System.out.println(Sam.name); //public
        System.out.println(Sam.age); //private
        System.out.println(Sam.address); //public
        System.out.println(Sam.phone); //private

    }
}

class person {
    String name;
    protected int age;
    public String address;
    private String phone;

    public person(String name, int age, String address, String phone){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void viewName() {
        System.out.println(name);
    }

    void viewAge() {
        System.out.println(age);
    }

    private void viewAddress(){
        System.out.println(address);
    }
    protected void viewPhone(){
        System.out.println(phone);
    }
}
