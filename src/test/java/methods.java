public class methods {
    public static void main(String[] args){
        hello();
        welcome();

    }
    static void hello(){ //methods have to be static
        System.out.println("Hello");
    }
    static void welcome(){
        System.out.println("Welcome to Java");
    }

    public int sum(int a, int b){ //mathematic calculation
        int result = a + b;
        return result;
        // int result = sum (5,5); - method
    }

}
