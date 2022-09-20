import java.util.Scanner;

class calculator {
    public static void main(String a[])
    {
        int n1, n2;
        char op;
        System.out.println("enter first number: ");
        Scanner sc1 = new Scanner(System.in);
        n1 = sc1.nextInt();
        System.out.println("enter second number: ");
        Scanner sc2 = new Scanner(System.in);
        n2 = sc2.nextInt();
        System.out.println("enter an operator: ");
        Scanner sc3 = new Scanner(System.in);
        op = sc3.next().charAt( 0);

        switch(op)
        {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-' :
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;

            default:
            System.out.println("invalid input");

        }
    }
}
