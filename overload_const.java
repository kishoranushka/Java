
//wap in java to overload two constructor one is default and other is parametrized
import java.util.Scanner;

class overload_const {
    int a;
    int b;

    public

    overload_const() {
        System.out.println("enter the value of a : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("enter the value of b : ");
        b = sc.nextInt();
    }

    overload_const(int x, int y) {
        a = x;
        b = y;
        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);

    }

    public static void main(String args[])

    {
        overload_const o1 = new overload_const();
        overload_const o2 = new overload_const(5,6);
    }

}
