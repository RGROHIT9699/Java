package class9;

public class Singleton {

    // Eager Initialisation
    // private static Singleton s = new Singleton();
    // private Singleton () {
    // }
    // public static Singleton getSingleton() {
    //     return s;
    // }

    // -----------------------------------------------
    // Lazy
    // private static Singleton s;
    // private Singleton() {
    // }
    // public static Singleton getSingleton() {
    //     if(s == null) {
    //         s= new Singleton();
    //     }
    //     return s;
    // }

    // --------------------------------------
    // private static Singleton s;
    // synchronized public static Singleton getSingleton() {
    //     if(s == null) {
    //         s = new Singleton();
    //     }
    //     return s;
    // }


    // ----------------------------------
    private static Singleton s;
    private Singleton() {
        if(s!= null) {
            throw new UnsupportedOperationException("GALAT Hai");
        }
    }
    public static Singleton getSingleton() {
        if(s == null) {
            synchronized (Singleton.class) {
                if( s== null) {
                    s = new Singleton();
                }
            }
        }
        return s;
    }
}
