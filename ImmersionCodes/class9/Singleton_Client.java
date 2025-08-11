package class9;

import java.lang.reflect.*;

// reflection API

public class Singleton_Client {
    public static void main(String[] args) throws NoSuchMethodError, SecurityException,IllegalAccessError,IllegalArgumentException,InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Singleton s1 = Singleton.getSingleton();
        // Singleton s2 = Singleton.getSingleton();

        // System.out.println(s1.hashCode());
        // System.out.println(s2.hashCode());
        Constructor <Singleton> singleton = Singleton.class.getDeclaredConstructor();
        Singleton s = singleton.newInstance();
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
    }
}
