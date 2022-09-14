public class SingletonPatternDemo {
    public  static void main(String[] args){
        //illegal construct
        //compile time error

        //get the only object availabe
        Singleton object = Singleton.getInstance();

        object.showMessage();
    }


}
