

//  class box {
//     public static void main(String a[])
//     {
//         int l=10;   //here we have initialize the l,b & h in the main function.
//         int b=20;
//         int h=20;
//         int vol;
//         vol=l*b*h;

//         System.out.println("volume of box = "+vol);
//     }
// }


//here we have used class and object
//initialize the l,b & h in the class and declared object in the main function

class box {
    int l = 10;
    int b = 20;
    int h = 20;
    int vol;
    
    public static void main(String a[])
    {
    box b= new box();
    b.vol=b.l*b.b*b.h;
    System.out.println(b.vol);
    }
}