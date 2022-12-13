import java.util.Scanner;
class keyword_this {
    public
    int a,b;
    keyword_this(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("addition: "+(a+b));
    }

    public static void main(String args[])
    {
        int a, b;
        System.out.println("enter the value of a: ");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("enter the value of b: ");
        b=sc.nextInt();
        keyword_this t1=new keyword_this(a,b);

    }
    
}
