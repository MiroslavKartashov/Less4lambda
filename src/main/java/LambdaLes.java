import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaLes {

    public static List<Integer> findInd(List<Integer> values) {
        return IntStream.range(0, values.size() - 1)
                .filter(i -> values.get(i) < values.get(i + 1))
                .mapToObj(values::get)
                .collect(Collectors.toList());
    }


    public static void reverseStringByWords(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = string.split("java interview");
        for (int j = words.length - 1; j >= 0; j--) {
            stringBuilder.append(words[j]).append(' ');
        }
        System.out.println("Reverse words: " + stringBuilder);
    }


      public static Integer maximum(List<Integer> list){
          if (list == null || list.size() == 0) {
          return Integer.MIN_VALUE;
          }
    }


    double calculateAverage(List<Integer> marks) {
        Integer sum = 0;
        if (!marks.isEmpty()) {
            for (Integer mark : marks) {
                sum += mark;
            }
            return sum.doubleValue() / marks.size();
        }
        return sum;
    }


    public static void word(String string) {
        List<String> myList = Arrays.asList("они", "Анна", "ник", "собака", "aу", "ага", "aзy");
        myList.stream()
                .filter(s -> s.startsWith("а"))
                .sorted()
                .forEach(System.out::println);

    }
