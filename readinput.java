 import java.util.Scanner;

 
 class readinput {
    public static void main(String a[])
    {
        int x;
        float f;
        double d;
        String name;

        Scanner sc= new Scanner(System.in);
        x= sc.nextInt();
        f= sc.nextFloat();
        d= sc.nextDouble();
        name= sc.next();

        System.out.println(x+" "+f+" "+d+" "+name);
    }
}
