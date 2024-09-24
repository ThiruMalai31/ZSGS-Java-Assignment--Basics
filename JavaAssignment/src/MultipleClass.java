class Android{
    void name(){
        System.out.println("Android");
    }
}
class Iphone{
   void name(){
        System.out.println("Iphone");
    }
}

class MacBook{
        void name(){
            System.out.println("MacBook");
        }
}
public class MultipleClass {
    public static void main(String[] args) {
        Android android=new Android();
        Iphone iphone=new Iphone();
        MacBook macBook=new MacBook();
        System.out.println("Show Different Devices");
        android.name();
        iphone.name();
        macBook.name();
        //  all the classes creates a class files when compiled.
    }
}
