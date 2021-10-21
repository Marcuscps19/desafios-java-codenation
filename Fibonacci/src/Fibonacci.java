import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args){
        System.out.println("Lista Fibonaci 0 a 377: " + fibonacci());
        System.out.println("377 é um número fibonacci?: " + isFibonacci(377));
        System.out.println("35 é um número fibonacci?: " + isFibonacci(35));
    }

    public static List<Integer> fibonacci() {
        List<Integer> fibonacciList = new ArrayList<>();
        int maxFibonacciNumber = 377;
        int next = 1;
        int previous = 0;

        while(previous <= maxFibonacciNumber) {
            fibonacciList.add(previous);
            int  product = next + previous;
            previous = next;
            next = product;
        };
        return fibonacciList;
    }

    public static Boolean isFibonacci(Integer a) {
        List<Integer> fibonacciNumbers = fibonacci();
        int number = fibonacciNumbers.indexOf(a);
        return (number != -1);
    }
}
