import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] input = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        List<Integer> intList = new ArrayList<>();
        Arrays.sort(input);
        for (int x : input) {
            if (x > 0 && x % 2 == 0) {

                intList.add(x);
            }

        }
        System.out.println(intList);
    }
}





//    Реализуйте два класса Main и StreamMain, в каждом из которых в функции main() составьте ArrayList из приведенных выше чисел и произведите над ними указанные операции, причем:
//
//        в первом классе выполнените работу без Stream API, используйте коллекции
//        во втором классе используйте стримы из библиотеки Stream API.
//        Получить ArrayList из чисел можно следующим образом:
//
//        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
//        Для получения потока из массива целых чисел используйте:
//
//        Stream<Integer> stream = intList.stream();
//        К потоку примените ряд промежуточных операций:
//
//        filter(x -> x > 0)
//        filter(x -> x % 2 == 0)
//        sorted(Comparator.naturalOrder())
//        Потребуется и терминальная операция. Например:
//
//        forEach(System.out::println)
//        И с помощью стримов, и без них Вы должны получить одинаковый ответ: 2 4 8 16 32