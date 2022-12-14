
//define a class base with data members string name, int age and member function getBaseData()
// and showBaseData() method
//define another class with data members string branch and int semester and member functions are getchildData() and showChildData()
//child is a derived class from base intialize object of the child class and access all its member methods as well as member methods of base class to show the existence of inheritence among them
//implement this scenario in JAVA
import java.util.Scanner;

class Base {
public
String name;
int age;
void getBaseData()
{
    System.out.println("enter name: ");
    Scanner sc = new Scanner(System.in);
    name = sc.next();
    System.out.println("enter age: ");
    age = sc.nextInt();

}
void showBaseData()
{
    System.out.println("name: " + name);
    System.out.println("age: " + age);
    
}
}

class student extends Base
{
    public
    String branch;
    int sem;

    void getchildData()
    {
        System.out.println("enter branch: ");
        Scanner sc = new Scanner(System.in);
        branch = sc.next();
        System.out.println("enter semester: ");
        sem = sc.nextInt();
    }

    void showChildData()
    {
        System.out.println("Branch: "+branch);
        System.out.println("semester: "+sem);
    }
public static void main(String args[])
{
    student s1 = new student();
    s1.getBaseData();
    s1.showBaseData();
    s1.getchildData();
    s1.showChildData();
}

}