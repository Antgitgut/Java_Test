public class oopExample {

    public static void  main(String[] args) {

        Person Alex = new Person("Alex");
        Alex.display();

        employee John = new employee("John", "Aklight");
        John.work();


    }
}

class Person {

    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {

        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);

    }


}

class employee extends Person { // class inheritance through extend

    private String company;

    public employee (String name, String company) {

        super(name);
        this.company = company;
    }

    public void work() {

        System.out.println(getName() + " " + company);
    }
}