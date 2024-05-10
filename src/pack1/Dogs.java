package pack1;

public class Dogs extends Animals {

	void dogs() {
		System.out.println("Dogs Bark");
	}
	void cats() {
		
	}
	public static void main(String[] args) {
		Dogs dog=new Dogs();
		dog.dogs();
		Cats cat=new Cats();
		cat.cats();
	}

}
