package exceptions;

// unchecked exception(runtime exception)
public class ExceptionDemo2 {
    public static void show() {
        sayHello(null);
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
    }

}
