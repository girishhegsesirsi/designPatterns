package designPatterns.creational.singleton;

public class LazyLadingSingleTonThereadsafeEx {
	public static void main(String[] args) {
        System.out.println("Starting of ExamplePgm..");
        // access instance of SingletonCls using getInstance() method
        LazyLadingSingleTonThereadsafe instance = LazyLadingSingleTonThereadsafe.getInstance();
        instance.setMessage("This message is set in main of ExamplePgm");
        displayMsg();
    }
     
    public static void displayMsg(){
        // SingletonCls.getInstance() gets the instance that is already created during the call in main() method, for the first time.
    	LazyLadingSingleTonThereadsafe instance = LazyLadingSingleTonThereadsafe.getInstance();
        System.out.println(instance.getMessage());
    }
}

/**
* Singleton Class in Java with Lazy loading
*/
 class LazyLadingSingleTonThereadsafe {
    // singleton instance declaration
    private static volatile LazyLadingSingleTonThereadsafe singletonInst;
     
    // a variable of singleton class
    private String message = "";
     
    // making constructor private so that no other class could use the default constructor
    private LazyLadingSingleTonThereadsafe() {
        System.out.println("Singleton instance created.");
    }
     
    // the method which gives access to the only instance of SingletonCls, is thread safe
    public static synchronized LazyLadingSingleTonThereadsafe getInstance(){
        if(singletonInst==null){
            singletonInst = new LazyLadingSingleTonThereadsafe();
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