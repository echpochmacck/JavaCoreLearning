package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i= 0;i<18;i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(action(list).execute(list));
    }

    public static interface Operation<V, T> {
        V  execute(T t);
    }

    private static Operation action(List<Integer> list){
        if (list.size() > 20) {
            Operation<Integer, List<Integer>> op1 = (a) -> {
                    int sum = 0;
                    for (int i : a) {
                        sum+=i;
                    }
                    return sum;
            };
            return op1;
        } else if(list.size() > 10) {
            Operation<String, List<Integer>> op1 = (a) -> {
                StringBuilder s = new StringBuilder();
                for (int i : a) {
                    s.append("-");
                    s.append(i);
                }
                return s.toString();
            };
            return op1;

        } else {
            Operation<Integer, List<Integer>> op1 = (a) -> {
                int sum =  1;
                for (int i : a) {
                   sum = sum * i;
                }
                return sum;
            };
            return op1;
        }

    }
}
