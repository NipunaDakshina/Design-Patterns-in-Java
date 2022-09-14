public class Singleton {
    //create an object of singleObject
    private static Singleton instance = new Singleton();

    //make the constructor private so that this class cannot be instantiated
    private Singleton(){}

    //get the only object available
    public  static Singleton getInstance(){
        return  instance;
    }
    public  void showMessage(){
        System.out.println("Hello World!!");
    }
}

