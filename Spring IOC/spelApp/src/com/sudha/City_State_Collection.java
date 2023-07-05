package com.sudha;

import java.util.ArrayList;

public class City_State_Collection {

	private ArrayList<City_State> city_State = new ArrayList<City_State>();

	public ArrayList<City_State> getCity_State() {
		city_State.add(new City_State("Hyd", "Tel"));
		city_State.add(new City_State("Blr", "KA"));
		city_State.add(new City_State("Bagalkot", "KA"));
		city_State.add(new City_State("Chn", "TN"));
		city_State.add(new City_State("Vizag", "AP"));
		city_State.add(new City_State("Vij", "AP"));
		city_State.add(new City_State("Tpty", "AP"));
		return city_State;
	}
}
