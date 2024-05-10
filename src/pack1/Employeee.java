package pack1;

public class Employeee extends Person {
	
	public void enter() {
        System.out.println("Employee enters, guard greets");
    }
	public static void main(String[] args) {
		Employeee obj1=new Employeee();
		Boss obj2=new Boss();
		obj1.enter();
		obj2.enter();

	}

}
