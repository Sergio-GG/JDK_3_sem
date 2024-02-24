public class Main {
    public static void main(String[] args) {

        // 1 задание.
        Calculator.sum(3, 6.2);
        Calculator.sub(13,6);
        Calculator.mult(3,6.4);
        Calculator.div(36,2);
        System.out.println("-----------------------------------------");

        // 2 задание.

//        int[] arr1 = new int[10];
//        String[] arr2 = new String[10];
//        boolean res = Array.compareArrays(arr1, arr2);
//        System.out.println(res);
//        System.out.println("-----------------------------------------");


        // 3 задание.
        Pair<String,Integer> pair = new Pair<>("Age", 20);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);

    }
}