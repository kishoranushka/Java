// WAP in java to check if a number of three number is armstrong or not

import java.util.Scanner;

class armstrong {
    void armstrong1()
    {
        int n1, temp;
        

        int res, armst = 0, i;
        System.out.println("enter any number:");
        Scanner sc1 = new Scanner(System.in);
        n1 = sc1.nextInt();
        int a = n1;                                                          

        while (n1 > 0) {
            temp = n1 % 10;
            armst = armst + (temp * temp * temp);
            n1 = n1 / 10;

        }
        
        if (a == armst)
        {
            System.out.println("yes!the number is armstrong.");

        }
        else {
                
            System.out.println("No!the number is not armstrong.");
            }




    }
    
    
    public static void main(String a[])
    {
        armstrong ob = new armstrong();
        ob.armstrong1();
    }
}
