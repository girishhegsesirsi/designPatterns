package designPatterns.creational.singleton;

public class DoubleCheckedSingletonEx {
	public static void main(String[] args) {
        System.out.println("Starting of ExamplePgm..");
        // access instance of SingletonCls using getInstance() method
        DoubleCheckedSingleton instance = DoubleCheckedSingleton.getInstance();
        instance.setMessage("This message is set in main of ExamplePgm");
        displayMsg();
    }
     
    public static void displayMsg(){
        // SingletonCls.getInstance() gets the instance that is already created during the call in main() method, for the first time.
    	DoubleCheckedSingleton instance = DoubleCheckedSingleton.getInstance();
        System.out.println(instance.getMessage());
    }
}

/**
* Singleton Class in Java with Lazy loading
*/
 class DoubleCheckedSingleton {
    // singleton instance declaration
    private static DoubleCheckedSingleton singletonInst;
     
    // a variable of singleton class
    private String message = "";
     
    // making constructor private so that no other class could use the default constructor
    private DoubleCheckedSingleton() {
        System.out.println("Singleton instance created.");
    }
     
    // the method which gives access to the only instance of DoubleCheckedSingleton, is thread safe
    public static  DoubleCheckedSingleton getInstance(){
        if(singletonInst==null){
        	synchronized(DoubleCheckedSingleton.class) {
        		if(singletonInst==null){
        		singletonInst = new DoubleCheckedSingleton();
        		}
        	}
            
            System.out.println("SingletonCls instance created for the first time.");
        }
        return singletonInst;
    }
 
    // getter for the variable message
    public String getMessage() {
        return message;
    }
 
    // setter for the variable message
    public void setMessage(String message) {
        this.message = message;
    }
}