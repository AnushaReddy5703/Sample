package pack1;

public class ClassA extends Marks1{
	int sub1;
	int sub2;
	int sub3;
	
	 ClassA(int sub1,int sub2,int sub3){
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		
	}
	double getPercentage() {
		return ((sub1+sub2+sub3)/3.0);
		
	}
	
}
