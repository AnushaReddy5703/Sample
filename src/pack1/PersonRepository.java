package pack1;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
	public static List<Personn> getAllPersons() {
		Personn p1 = new Personn("John", 165, 2000, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
		Personn p2 = new Personn("Angel", 158, 5000, "Female", 2, Arrays.asList("Driving", "Music", "Football"));
		Personn p3 = new Personn("Dean", 140, 5700, "Male", 2, Arrays.asList("Cricket", "Driving", "Tennis"));
		Personn p4 = new Personn("Nancy", 130, 4900, "Female", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
		Personn p5 = new Personn("Harper", 125, 9000, "Female", 2, Arrays.asList("Football", "Swimming", "Tennis"));
		Personn p6 = new Personn("Alan", 110, 9500, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
		Personn p7 = new Personn("Campell", 165, 1548, "Male", 1, Arrays.asList("Swimming", "Tennis"));

		return Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
	}

	public static Personn getPerson() {
		return new Personn("John", 165, 2000, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
	}

	public static Optional<Personn> getPersonOptional() {
		Personn per = getPerson();
		per.setAddress(Optional.of(new Address("7 th Block", "Ashburn", "Virginia", "USA", 20047)));
		return Optional.of(per);
	}

}
