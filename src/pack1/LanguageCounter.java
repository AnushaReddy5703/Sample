package pack1;

import java.util.HashMap;

public class LanguageCounter {

	public static void main(String[] args) {
		String languages="eng chinese eng telugu chinese hindi chinese";
		String[] languageArray = languages.split(" ");
		
		HashMap<String,Integer> obj=new HashMap<String,Integer>();
		for(String str : languageArray)
		{
			if(obj.containsKey(str))
			{
				obj.put(str,obj.get(str)+1);
			}
			else 
			{
				obj.put(str,1);
			}
		
	    }
     for(String str : obj.keySet())
     {
    	 if(obj.get(str)>1) 
    	 {
    		 System.out.println(str +" "+obj.get(str));
    	 }
     }

	}
}
