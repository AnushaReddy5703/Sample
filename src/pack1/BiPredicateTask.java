package pack1;

import java.util.function.BiPredicate;

public class BiPredicateTask {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer> isSumGT20=(a,b)->(a+b)>20;
		System.out.println(isSumGT20.test(7, 5));
      	}
}
