package Lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaTest {
//    public static class  RunnableExample implements Runnable {
//        public void run() {
//            System.out.println();
//        }
//    }
//
public static void main(String[] args) {
    Runnable runnExample = () -> System.out.println("Hello world");
    Thread thread = new Thread(runnExample);
    thread.start();

    ArrayList<String[]> arrays = new ArrayList<>();
    String[] str1 = {"TEts", "SAD"};
    String[] str2 = {"SAD"};
    arrays.add(str1);
    arrays.add(str2);
    arrays.sort((o1, o2) -> {
        return o1.length - o2.length;
    });


    for (int i=0;i<arrays.size();i++) {
        System.out.println(Arrays.toString(arrays.get(i)));
    }
    MathInterface<Integer>m = (first, second) -> {
        if (first > second)
            return first;
        return second;
    };
    System.out.println(m.getMax(1, 4));
}

public static interface MathInterface<T>{
    T getMax(T first, T next);
}

}
