import java.util.*;
import java.util.stream.Collectors;

public class Collections {
    public static void main(String[] args) {
        String[] words = {"Кот", "собака", "КОТ", "попугай", "Собака", "хомяк"};
        System.out.println(removePovs(words));
    }

    public static Collection removePovs(String[] arr) {

//        ПРоходимся и меняем регистр
        List<String> res= Arrays.asList(arr).stream()
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
//        Получаем отсортированный сет уникальный
    return res;
    }



//    Уникальные слова. Дан массив строк (предложение, разбитое по словам, с повторами и, возможно,
//                                        разным регистром — "Кот", "кот", "СОБАКА"). Собери все
//    уникальные слова в нижнем регистре, отсортированные по алфавиту.
//        Подумай, какая коллекция сама по себе не даст дубликатам — сэкономишь себе шаг.
}
