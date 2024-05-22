package pack1;
import java.util.function.Predicate;
import java.util.List;

public class PredicateTask {

	public static void main(String[] args) {
		PredicateTask obj=new PredicateTask();
		
		 Predicate<String> isLengthGT3 = str -> str.length() > 3;
		 System.out.println(isLengthGT3.test("Hello"));
		 
		 Predicate<String> containsA = str -> str.contains("a");
		 System.out.println(containsA.test("Java is Awesome"));
		 
		 
		 System.out.println(isLengthGT3.and(containsA).test("Anshu"));
		 System.out.println(isLengthGT3.or(containsA).test("Anshu"));
		 
		 System.out.println("---------------------------------");
		 
		 Predicate<Personn> Female = person -> "female".equalsIgnoreCase(person.getGender());
		 Predicate<Personn> SalaryGT2000 = person -> person.getSalary() > 2000;
		 
		 Predicate<Personn> FemaleAndSalaryGT2000 = Female.and(SalaryGT2000);
		 
		 List<Personn> personList = PersonRepository.getAllPersons();
		 
		 for(Personn person : personList) 
		 {
		   if(FemaleAndSalaryGT2000.test(person)) {
			   System.out.println(person);
		   }
		 }
	}

}
