package designPatterns.creational.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Phone phone = new Phone ("Android",2,"Qualcomm",5.5, 3100);
		
	Phone phone= new PhoneBuilder().setOs("Android")
			.setRam(2)
			.setProcessor("Qualcomm").setScreenSize(5.5)
			.setBattery(3100)
			.getPhone();
	
	System.out.println(phone);

	}

}
