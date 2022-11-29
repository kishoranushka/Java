// read and display values in an array

import java.util.Scanner;
class array1 {
    public static void main(String a[])
    {
        int i;
        int p[]=new int[5];
        System.out.println("enter the values of array: ");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            p[i] = sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            System.out.println(p[i]);
        }

    }
    
}
