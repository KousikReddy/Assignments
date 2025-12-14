package assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment4_CollectionsAndArrays {

	public static void main(String[] args) {
		
		//1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		
		List<String> cities = new ArrayList<String>();
		cities.add("Hyderabad");
		cities.add("Mumbai");
		cities.add("Banglore");
		cities.add("Chennai");
		cities.add("Pune");
		
		List<Double> areas = new ArrayList<Double>();
		areas.add(1568.75);
		areas.add(1853.22);
		areas.add(1270.53);
		areas.add(629.67);
		areas.add(1455.48);
		
		System.out.println("The total area of "+cities.get(2)+" and "+cities.get(3)+" : "+(areas.get(2)+areas.get(3))); //1900.1999
		System.out.printf("The total area of %s and %s : %.2f",cities.get(2),cities.get(3),areas.get(2)+areas.get(3)); //1900.20
		
		//2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		
		System.out.println();
		
		Set<String> touristAttractions = new LinkedHashSet<String>();
		touristAttractions.add("Taj Mahal");
		touristAttractions.add("Bali");
		touristAttractions.add("Great Wall of China");
		touristAttractions.add("Eiffel Tower");
		touristAttractions.add("Amazon Forest");
		touristAttractions.add("Statue of Liberty");
		touristAttractions.add("London Ferry wheel");
		touristAttractions.add("Goa");
		touristAttractions.add("Burj Khalifa");
		touristAttractions.add("Thailand");
		
		System.out.println("The Size of Tourist Attractions is: "+touristAttractions.size());   //10
		
		for(String touristPlace : touristAttractions) {
			System.out.println(touristPlace);   //Prints the All Tourist Sites
		}
		
		//3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
		
		int[] numbers = new int[10];
		numbers[0] = 10;
		numbers[1] = 15;
		numbers[2] = 20;
		numbers[3] = 25;
		numbers[4] = 30;
		numbers[5] = 60;
		numbers[6] = 40;
		numbers[7] = 45;
		numbers[8] = 50;
		numbers[9] = 55;
		
		System.out.println("The Average of 5th and 6th Value is: "+((numbers[4]+numbers[5])/2)); //45
		
		int[] randomNumbers = {10,20,30,40,50,60,70,80,90,100};
		System.out.println("The Average of 5th and 6th Value is: "+((randomNumbers[4]+randomNumbers[5])/2)); //55
		
		//4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		
		Map<String,String> highestGrossingMovies = new LinkedHashMap<String,String>();
		highestGrossingMovies.put("Bahubali","1500cr");
		highestGrossingMovies.put("Dangal","1200cr");
		highestGrossingMovies.put("RRR","2000cr");
		highestGrossingMovies.put("KGF","1200cr");
		highestGrossingMovies.put("Salar","1400cr");
		
		System.out.println("The Third Movie on the List is: "+highestGrossingMovies.get("RRR"));  // 2000cr
		
	}

}
