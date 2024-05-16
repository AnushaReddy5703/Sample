package pack1;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> foodItems=new ArrayList();
        System.out.println(foodItems.size());
        foodItems.add("Idly");
        foodItems.add("Dosa");
        foodItems.add("Biryani");
        foodItems.add("Pizza");
        foodItems.add("Chicken");
        foodItems.add("Chicken Lollipops");
        foodItems.add(4,"IceCream");
        System.out.println(foodItems);
        foodItems.remove(0);
        System.out.println(foodItems.contains("Pizza"));
        
        
        System.out.println("Getting elemnts of arrayList using for each loop");
        for(String str: foodItems) {
        	System.out.println(str);
        	
        }
        foodItems.add(4,"IceCream");
	}

}
