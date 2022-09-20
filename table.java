import java.util.Scanner;

class table {
    public static void main(String a[]) {
        int n1, i, result;
        System.out.println("enter any number: ");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        
        for (i = 1; i <= 10; i++) {

            // System.out.println();
            result = n1 * i;
            System.out.println("\t"+n1+" * i = " + result);
        }
    }
}