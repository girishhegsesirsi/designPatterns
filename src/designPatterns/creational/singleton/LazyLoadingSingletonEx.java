package designPatterns.creational.singleton;

public class LazyLoadingSingletonEx {
	public static void main(String[] args) {
        System.out.println("Starting of ExamplePgm..");
        // access instance of SingletonCls using getInstance() method
        LazyLoadingSingleton instance = LazyLoadingSingleton.getInstance();
        instance.setMessage("This message is set in main of ExamplePgm");
        displayMsg();
    }
     
    public static void displayMsg(){
        // SingletonCls.getInstance() gets the instance that is already created during the call in main() method, for the first time.
    	LazyLoadingSingleton instance = LazyLoadingSingleton.getInstance();
        System.out.println(instance.getMessage());
    }
}


/**
* Singleton Class in Java with Lazy loading
*/
 class LazyLoadingSingleton {
    // singleton instance declaration
    private static LazyLoadingSingleton singletonInst;
     
    // a variable of singleton class
    private String message = "";
     
    // making constructor private so that no other class could use the default constructor
    private LazyLoadingSingleton() {
        System.out.println("Singleton instance created.");
    }
     
    // the method which gives access to the only instance of SingletonCls
    public static LazyLoadingSingleton getInstance(){
        if(singletonInst==null){
            singletonInst = new LazyLoadingSingleton();
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