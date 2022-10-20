public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        CounterTest counterTest = new CounterTest();
        System.out.println(counter1.countSheeps(counterTest.array1));
        System.out.println(counter1.countSheeps(counterTest.array2));
        System.out.println(counter1.countSheeps(counterTest.array3));
    }
}