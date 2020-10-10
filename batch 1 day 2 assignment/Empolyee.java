 public class Employee{
	String name;
	int age;
	String city;


	void display(){
		System.out.println("The name of employee is  "+name);
		System.out.println("Age is  "+age);
		System.out.println("And the city is "+city);
		System.out.println("***********************************");
	}

      public static void main(String[] args) {
      	Employee e1=new Employee();
      	Employee e2=new Employee();
      	e1.name="saurav";
      	e1.age=24;
      	e1.city="chennai";
      	e2.name="rohit";
      	e2.age=21;
      	e2.city="bokaro";
      	e1.display();
      	e2.display();
		
	}
}
