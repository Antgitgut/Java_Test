public class cyc {
    public static void main(String[] args) {
        // boolean
        int a = 1;
        int b = 2;
        boolean c = a != b;
        System.out.println(c);

        // int v = a || b; not working
        boolean a1 = (5 > 6) || (4 < 6);
        System.out.println(a1);

        int d = 130;
        int e = 100;
        int f = d = e;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        //conditions if, else, else, if
        if (d > e) {
            System.out.println("That is true!");
        } else if (d < e) {
            System.out.println("That is false!");
        } else {
            System.out.println("That is not ok!");
        }
        int x = 20, y = 10;
        String res = x > y ? "x > y" : "x < y";
        System.out.println(res);

        //cycles
        // cycle #1: while
        int i = 1;
        while (i < 9) {
            System.out.println(i + " ");
            i++;
        }
        // cycle #2: do, while
        int i1 = 4;
        do {
            i1++;
            System.out.println(i1 + " ");
        } while (i1 < 0);
        //cycle #3: for
        for (int j = 1; j < i1; j++) {
            System.out.println(j);
        }
        //cycle #4: while, if, break
        int count = 2;
        while (true) {
            System.out.println(count);
            if (count > 13){
                break;
            }
            count++;
        }
        //cycle #5: for, if, continue
        for (int p = 1; p <= 7; p++) {
            System.out.println(p + ": before continue!");
            if (p > 3)
                continue;
            System.out.println(" "+ p + ": continue 3 times!");
        }
        //switch & case construction like if & else. Default
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("End of the Weekdays");
        }
    }
}