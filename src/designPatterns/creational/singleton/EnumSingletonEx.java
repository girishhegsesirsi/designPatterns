package designPatterns.creational.singleton;

public class EnumSingletonEx {
	public static void main(String[] args) {
        System.out.println("Starting of ExamplePgm..");
        // access instance of SingletonCls using getInstance() method
        SingletonEnumEx.INSTANCE.setMessage("This message is set in main of ExamplePgm");
        displayMsg();
    }
     
    public static void displayMsg(){
        System.out.println(SingletonEnumEx.INSTANCE.getMessage());
    }
}


/**
 * Singleton Design implementation using enum
 */
 enum SingletonEnumEx {
    // the variable INSTANCE shall be compiled to a public static final field of type SingletonEnumEx
    INSTANCE;
    private String message;
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    } 
}