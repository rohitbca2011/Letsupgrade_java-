
import java.util.Scanner;

public class Avenger{
    String name,power,weapon,planet;
    int age;
    Scanner sc= new Scanner(System.in);

    public void getDetail(){
        System.out.println("Enter the name");
        name=sc.nextLine();

        System.out.println("Enter the power");
        power=sc.nextLine();

        System.out.println("Enter the weapon");
        weapon=sc.nextLine();

        System.out.println("Enter the planet");
        planet=sc.nextLine();

        System.out.println("Enter the age");
        age=sc.nextInt();

    }

    public void displayDetails() {
       System.out.println("the name is "+name);
       System.out.println("Age is "+age);
       System.out.println("Power: "+power);
       System.out.println("Weapon is "+weapon);
       System.out.println("planet is: "+planet);
       System.out.println("************************************************************************");
   }


   public static void main(String args[]){
    Avenger[] avengers=new  Avenger[5];

        //  creat object

        for (int i = 0; i <5; i++) {
            avengers[i]=new  Avenger();
            
        }

        // get detail
         for (int i = 0; i < 5; i++) {
             avengers[i].getDetail();
             
         }

        //  display detail
        for (int i = 0; i < 5; i++) {
            avengers[i].displayDetails();
            
        }
        
    }
}

