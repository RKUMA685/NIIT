package niit3;

import java.util.ArrayList;

public class Country {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> indiaStates = new ArrayList<>();
        indiaStates.add("Madhya Pradesh");
        indiaStates.add("Andhra Pradesh");
        indiaStates.add("Uttar Pradesh");
        indiaStates.add("Rajasthan");
        ArrayList<String> USStates = new ArrayList<>();
        USStates.add("Ohio");
        USStates.add("California");
        USStates.add("Texas");
        USStates.add("Florida");
        Countries countries = new Countries();
        countries.listingCountry("India", indiaStates);
        countries.listingCountry("USA", USStates);
        System.out.println(countries.getCountry("India"));
        countries.listCountryAfter("India");
    }

}
	
