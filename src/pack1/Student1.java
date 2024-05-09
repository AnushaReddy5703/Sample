package pack1;

public class Student1 {
	String name;
    int age;
    String address;
    
    Student1()
    {
    	this.name="unknown";
    	this.age=0;
    	this.address="not available";
    }
    void setInfo(String name,int age)
    {
    	this.name=name;
    	this.age=age;
    }
    void setInfo(String name,int age,String address)
    {
    	this.name=name;
    	this.age=age;
    	this.address=address;
    }
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println();
    }
	public static void main(String[] args) {
		Student1[] students = new Student1[10];
		for (int i = 0; i < 10; i++) {
            students[i] = new Student1();
        }

        // Set information for each student
        students[0].setInfo("Anusha", 20, "Warangal");
        students[1].setInfo("Asma",23, "Warangal");
        students[2].setInfo("Meghana", 22, "Warangal");
        // Set information using the setInfo method with two parameters
        students[3].setInfo("Srinivas Reddy", 50);
        students[4].setInfo("Ammulu", 24);
        students[5].setInfo("Anu", 25);
        // Set information using the setInfo method with three parameters
        students[6].setInfo("Monu", 26, "Janagam");
        students[7].setInfo("Sonu", 27, "Hanamkonda");
        students[8].setInfo("Janu", 28, "Begumpet");
        students[9].setInfo("Vanaja", 29, "Hyderabad");

        // Print information of all students
        for (int i = 0; i < 10; i++) {
            students[i].printInfo();
        }
	}

}
