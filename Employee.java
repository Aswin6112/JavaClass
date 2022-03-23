package newPackage;

public class Employee {
	
	String Name;
	int Year;
	int Salary;
	String Address;
	
	public static void main(String[] args) {
	Employee person1 = new Employee();
	Employee person2 = new Employee();
	Employee person3 = new Employee();
	System.out.println("Name"+" "+"Year of Joining"+"  "+"Salary"+"\t"+" Address");
	System.out.println();
    person1.PrintDetails("Robert", 2010, 50000, "64C-WallsStreet");
    person2.PrintDetails("Sam", 2020, 40000, "68D-WallsStreet");
    person3.PrintDetails("John", 2014, 55000, "26B-WallsStreet");
	
	}
	public static void PrintDetails(String Name,int Year ,int Salary,String Address) {
		System.out.println(Name+"\t "+Year+"\t\t"+Salary+"\t"+Address);
		System.out.println();
	}
	
	
}
