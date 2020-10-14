import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class EmployeeDetail {
    private static Scanner sc;
    public static void main(final String[] args) {


        String name;
         int date, month, year,age;
        double monthlySalary, anualSalary;
		 final double tax;
         sc = new Scanner(System.in);
         
        System.out.println("**********Employee details:-************");
         System.out.println("Enter empolyee name");
         name= sc.nextLine();

        System.out.println("Enter empolyee date of birth");
         date= sc.nextInt();

         System.out.println("Enter empolyee month of birth");
         month= sc.nextInt();

         System.out.println("Enter empolyee year of birth");
         year= sc.nextInt();


        System.out.println("Enter empolyee monthly salary");
        monthlySalary = sc.nextInt();

        anualSalary= (monthlySalary*12);

        LocalDate today =LocalDate.now();
         LocalDate birthDate = LocalDate.of(year, month, date);
         age=Period.between(birthDate, today).getYears();



        System.out.println("Name Of Employee : " +name);
        System.out.println("Age of Employee: " +age);
        System.out.println("Anual salary Of Employee : " +anualSalary);
        
        if (anualSalary>=50000){
            tax= anualSalary*0.2;
            System.out.println("tax amount: "+tax);
        } 
        else  if (anualSalary>=40000){
            tax= anualSalary*0.15;
            System.out.println("tax amount: "+tax);
        } 
        else  if (anualSalary>=300000){
            tax= anualSalary*0.1;
            System.out.println("tax amount: "+tax);
        } 
        else  if (anualSalary>=200000){
            tax= anualSalary*0.05;
            System.out.println("tax amount: "+tax);
        } 
        else{
            System.out.println("no taxes");
        }

    }
    
}
