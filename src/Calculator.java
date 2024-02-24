public class Calculator {

    public static <T extends Number> void sum(T first, T second){
        System.out.println(first.doubleValue() + second.doubleValue());
    }
    public static <T extends Number> void sub(T first, T second){
        System.out.println(first.doubleValue() - second.doubleValue());
    }
    public static <T extends Number> void mult(T first, T second){
        System.out.println(first.floatValue() * second.floatValue());
    }
    public static <T extends Number> void div(T first, T second){
        if (second.floatValue() != 0) {
            System.out.println(first.floatValue() / second.floatValue());
        }
        else{
            System.out.println("Деление на ноль");
        }
    }
}
