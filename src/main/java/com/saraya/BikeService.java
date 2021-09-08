package com.saraya;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BikeService {
	
	private static ArrayList<Bike> bikes = new ArrayList<Bike>();
	private static int count = 10;
	
	static {
		bikes.add(new Bike(1,2020,"Honda","Bridge","https://images.unsplash.com/photo-1610553556003-9b2ae8ef1b8e?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=282&q=80"));	
		bikes.add(new Bike(2, 2021,"Chennai","Tamil,Nadu","https://images.unsplash.com/photo-1611429532458-f8bf8f6121fe?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1527&q=80"));
		bikes.add(new Bike(3, 2022,"Royal Enfield" ,"motorbike","https://images.unsplash.com/photo-1601574013379-a98bfb813376?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1534&q=80"));
		bikes.add(new Bike(4, 2019, "Yamaha","R6","https://images.unsplash.com/photo-1620751473962-7e028d3db635?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fGJpa2VzfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
		bikes.add(new Bike(5, 2020, "Red Heavy","Bike","https://images.unsplash.com/photo-1599499284460-4a7932851d97?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1534&q=80"));
		bikes.add(new Bike(6, 2018,"Nature","Landscape","https://images.unsplash.com/photo-1616839261111-d7070563052c?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1575&q=80")); 
		bikes.add(new Bike(7, 2016,"Royal Enfield","Bullet","https://images.unsplash.com/photo-1622547918989-02ebc7a89eb0?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1500&q=80")); 
		bikes.add(new Bike(8, 2021,"Kerela","Lightroom","https://images.unsplash.com/photo-1609316696815-29de8998f96a?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1534&q=80")); 
		bikes.add(new Bike(4, 2022,"Continental","Gt 650","https://images.unsplash.com/photo-1623094884268-cc195d985bc3?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=375&q=80")); 
		bikes.add(new Bike(10,2019,"Stunts","Stuntriding","https://images.unsplash.com/photo-1608036783359-398049d9559e?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80"));
		
	}
	
	public List<Bike> getAllBikes(){
		return bikes;
	}  
	
	public void addBike(int year, String make, String model, String image) {
		bikes.add(new Bike(++count, year, make, model, image));
	}
	public void deleteById(int id) {
		 Iterator<Bike> iterator =bikes.iterator();
		 while(iterator.hasNext()) {
			 Bike bike = iterator.next();
			 if(bike.getId()==id) {
				 iterator.remove();
			 }
		 }
	}



}



