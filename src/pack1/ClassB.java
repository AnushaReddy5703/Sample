package pack1;

public class ClassB extends Marks1 {
	int sub1;
	int sub2;
	int sub3;
	int sub4;
	
	 ClassB(int sub1,int sub2,int sub3,int sub4){
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
	}
	
	double getPercentage() {
		return ((sub1+sub2+sub3+sub4)/4.0);
	}
	public static void main(String[] args) 
	{
		ClassA student1=new ClassA(80,70,95);
		System.out.println("Percentage of Student A : " +student1.getPercentage());
		
		ClassB student2=new ClassB(80,70,95,94);
		System.out.println("Percentage of Student A : " +student2.getPercentage());
	}
	

}
