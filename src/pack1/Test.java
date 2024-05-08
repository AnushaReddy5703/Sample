package pack1;

public class Test {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.name="Anusha";
        emp.age=23;
        emp.phonenumber="9876543210";
        emp.address="Hyderabad";
        emp.salary=25000;
        emp.specialization="Software Develepment";
        
        Manager man=new Manager();
        man.name="Asma";
        man.age=23;
        man.phonenumber="9876543253";
        man.address="Banglore";
        man.salary=50000;
        man.department="Human Resources";
        
        
        //printing details of employee
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone Number: " + emp.phonenumber);
        System.out.println("Address: " + emp.address);
        emp.printSalary();
        System.out.println("Specialization: " + emp.specialization);
        
        //printing details of manager
        System.out.println("\nManager Details:");
        System.out.println("Name: " + man.name);
        System.out.println("Age: " + man.age);
        System.out.println("Phone Number: " + man.phonenumber);
        System.out.println("Address: " + man.address);
        man.printSalary();
        System.out.println("Department: " + man.department);
        
        
	}

}
