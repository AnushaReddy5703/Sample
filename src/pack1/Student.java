package pack1;

public class Student {
	String name;
	
    Student()
    {
    	this.name="Unknown";
    	System.out.println(name);
    }
    Student(String name)
    {
    	this.name=name;
    	System.out.println(name);
    }
	public static void main(String[] args) {
		
       Student std=new Student();
       Student std1=new Student("Asma");
	}

}
