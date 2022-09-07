package Default;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		
		
		HashMap<String, Integer>map=new HashMap<String, Integer>();
		
		map.put("sanket", 1);
		map.put("kaustubh", 2);
		map.put("devayani", 3);
		
		//Print the size of map
		System.out.println("Size of the map is :"+ map.size());
		//Print the elements of map
		System.out.println(map);
		
		//print particular record
		if(map.containsKey("sanket"))
		{
			Integer a= map.get("sanket");
			
			System.out.println("values for key sanket is"+a);
		}
		hashmap.newmap();
		hashmap h=new hashmap();
		h.replace();
	}
	
	public static void newmap()
	{
		HashMap<String, Integer>map2= new HashMap<String, Integer>();
		map2.put("hari", 1);
		map2.put("virus", 2);
		map2.put("Nilsen",3);
		map2.put(null, null); //It allows us to store null values
		map2.put("hari", 4);
		
		map2.remove("virus");
		System.out.println(map2);
		
	}
	
	public static void replace()
	{
		HashMap<Integer, String>map3=new HashMap<Integer, String>();
		map3.put(1, "Dua lipa");
		map3.put(2, "taylor");
		
		map3.replace(2, "alison");
		
		System.out.println(map3);
		
		
	}

}
