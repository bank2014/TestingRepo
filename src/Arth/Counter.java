package Arth;

public class Counter {
    private static int count = 0;

    public Counter() {
        Counter.count++;
        System.out.println(count);
    }
}
