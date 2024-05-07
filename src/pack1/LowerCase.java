package pack1;

public class LowerCase {

	public static void main(String[] args) {
		String firstNameCaps  = "ALEX";
        String s=firstNameCaps.substring(0, 1).toUpperCase() + firstNameCaps.substring(1).toLowerCase();
        System.out.println(s);
	}

}
