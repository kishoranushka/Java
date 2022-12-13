import java.util.Scanner;

import java.util.Scanner;

class para_const {

    public para_const(int x, int y) {
        System.out.println("addition of two numbers is : "+(x+y));

    }

    public static void main(String args[]) {
        int a, b;
        System.out.println("enter the value of a:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("enter the value of b:");
        b = sc.nextInt();

        para_const p1 = new para_const(a, b);
    }

}
