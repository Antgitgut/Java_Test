public class dog {
    String breed;
    String name;
    int age;
    int paws;


    public static void say(){ //method created
        System.out.println("woof");

    }
    public static void sit() { //method created
        System.out.println("sit");

    }
    public static void main(String[] args) {
        dog Brownie = new dog();
        Brownie.breed = "pincher";
        Brownie.name = "Brownie";
        Brownie.age = 6;
        Brownie.paws = 4;

        System.out.println(Brownie.name + " " + Brownie.age);

        Brownie.say(); //method output
        Brownie.sit(); //method output


    }

}

/** Without parameters:
 *
 * public Dog(String name, int age){
 *     this.name = name;
 *     this.age = age;
 *
 * }
 * public static void main(String[] args) {
 *      Dog Brownie = new Dog(name: "Brownie", age: 5);
 *
 *      System.out.println(Brownie.name);
 *      System.out.println(Brownie.age);
 *
 * OR:
 *
 *      Dog Shelly = new Dog(name: "Shelly", age: 7);
 *      Dog Michael = new Dog(name: "Michael", age: 11);
 *
 *      System.out.println(Shelly.name + " " + Shelly.age);
 *      System.out.println(Michael.name + " " + Michael.age);
 *
 * }
*/

/**
 * The 3rd variant:
 *
 * public class Main {
 *
 *     public static void main(String[] args) {
 *         Person Tom = new Person();
 *         Tom.name = "Tom";
 *         Brownie.age = 46;
 *
 *         System.out.println(Tom.name);
 *         System.out.println(Tom.age);
 *     }
 *
 *      static class Person{
 *          String name;
 *          int age:
 *      }
 * }
 */

