// wap in java to find the sum of three numbers using array


import java.util.Scanner;

class sum {
    public static void main(String a[])
    {
        int x[] = new int[3];
        int i,sum=0;
        System.out.println("Enter the numbers: ");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++){

            x[i]=sc.nextInt();
            sum=sum+x[i];
        }
        System.out.println(sum);
    }
    
}
