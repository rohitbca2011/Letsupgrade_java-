import java.util.Scanner;

public class Grade {
	private static Scanner sc;
	public static void main(String[] args) 
	{
        int i;
        int marks[] = new int[5]; 
	    float total = 0, Percentage;
        sc = new Scanner(System.in);
        
        for ( i = 0; i <5; i++) {
          System.out.println("Enter marks of subject  "+ (i+1) );
          marks[i] =  sc.nextInt();
          total = total+marks[i];
               
        }
		
	    Percentage = (total / 500) * 100;
	    
        System.out.println("Percentage =  " + Percentage);
        if(Percentage>=90){
            System.out.println("GRADE A");
        }
        else if(Percentage<90 && Percentage>=70){
            System.out.println("GRADE B");
        }
        else if(Percentage<70 && Percentage>=50){
            System.out.println("GRADE C");
        }
        else if(Percentage<50 && Percentage>=33){
            System.out.println("GRADE D");
        }
        else{
            System.out.println("fail");
        }

     }
}
