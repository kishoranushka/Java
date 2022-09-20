import java.util.Scanner;

class typecasting
{
    public static void main(String a[])
    {
        int n1, n2, n3;
        System.out.println("enter the three numbers: ");
        Scanner sc = new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        float avg=(float)(n1+n2+n3)/3;
        System.out.println("the avg of the numbers is :"+avg);


    }
}

