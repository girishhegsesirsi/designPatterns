package designPatterns.creational.prototype;

import java.util.List;

public class PrototypeDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
	    Vehicle a = new Vehicle();
	    a.loadData();
	    
	    Vehicle b = (Vehicle) a.clone();
	    List<String> list = b.getVehicleList();
	    list.add("Honda new Amaze");
	    
	    System.out.println(a.getVehicleList());
	    System.out.println(list);
	    
	    b.getVehicleList().remove("Audi A4");
	    System.out.println(list);
	    System.out.println(a.getVehicleList());
	  }
}
