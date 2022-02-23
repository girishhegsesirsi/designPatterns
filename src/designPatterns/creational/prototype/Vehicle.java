package designPatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable {
		  private List<String> vehicleList;
		  
		  public Vehicle() {
		    this.vehicleList = new ArrayList<String>();
		  }
		  
		  public Vehicle(List<String> list) {
		    this.vehicleList = list;
		  }
		  
		  public void loadData() {
		    vehicleList.add("Honda amaze");
		    vehicleList.add("Audi A4");
		    vehicleList.add("Hyundai Creta");
		    vehicleList.add("Maruti Baleno");
		    vehicleList.add("Renault Duster");
		  }
		  
		  public List<String> getVehicleList() {
		    return this.vehicleList;
		  }
		  
		  @Override
		  public Object clone() throws CloneNotSupportedException {
		    List<String> tempList = new ArrayList<String>();
		    
		    for(String s : this.getVehicleList()) {
		      tempList.add(s);
		    }
		    
		    return new Vehicle(tempList);
		  }
		
}
