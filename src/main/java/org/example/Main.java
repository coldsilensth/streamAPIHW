package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //STREAM API

        //1. Найти среднее значение чисел в списке:
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        double average = numbers.stream()
//                .mapToInt(Integer::intValue)
//                .average()
//                .orElse(Double.NaN);
//        System.out.println(average);
//

//        2. Получить список квадратов чисел в списке:
//        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> squares = numberList.stream()
//                .map(n -> n * n)
//                .collect(Collectors.toList());
//        System.out.println(squares);
//
//
//        3. Отфильтровать элементы списка, оставив только четные числа:
//        List<Integer> numbersLists = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> evenNumbers = numbersLists.stream()
//                .filter(n -> n % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println(evenNumbers);


        //4. Проверить, содержит ли список число 3:
//        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
//        boolean containsThree = numbersList.stream()
//                .anyMatch(n -> n == 3);
//        System.out.println(containsThree);

//
        //5. Соединить элементы списка в одну строку через запятую:
//        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
//        String joinedString = strings.stream()
//                .collect(Collectors.joining(", "));
//        System.out.println(joinedString);
//

        //6. Получить первые три элемента списка:
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> firstThree = numbers.stream()
//                .limit(3)
//                .collect(Collectors.toList());
//        System.out.println(firstThree);


        //7. Извлечь из списка все уникальные элементы:
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 3, 4, 6);
//        List<Integer> uniqueNumbers = numbers.stream()
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(uniqueNumbers);


        //8. Найти максимальное значение в списке:
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        Optional<Integer> max = numbers.stream()
//                .max(Integer::compare);
//        System.out.println(max);


        //9. Отсортировать список в обратном порядке:
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> reversed = numbers.stream()
//                .sorted(Collections.reverseOrder())
//                .collect(Collectors.toList());
//        System.out.println(reversed);



        //Лямбда-выражение:


        //1. Напишите лямбда-выражение, которое умножает каждый элемент списка на 2.
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        numbers.replaceAll(x -> x * 2);
//        System.out.println(numbers);


        //2. Напишите лямбда-выражение, которое находит сумму двух чисел.
//        BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
//        System.out.println(sum.apply(2, 3));
//

        //3. Напишите лямбда-выражение, которое возвращает True, если переданное число больше 10.
//        Predicate<Integer> moreOrLess = x -> x > 10;
//        System.out.println(moreOrLess.test(15));


        //4.Напишите лямбда-выражение, которое возвращает True, если переданная строка содержит более 5 символов.
//        Predicate<String> More5Chars = s -> s.length() > 5;
//        System.out.println(More5Chars.test("Hello World"));


        //5. Напишите лямбда-выражение, которое возвращает длину переданной строки.
//        Function<String, Integer> stringLength = s -> s.length();
//        System.out.println(stringLength.apply("Java"));


        //6. Напишите лямбда-выражение, которое возвращает квадрат переданного числа.
//        Function<Integer, Integer> square = x -> x * x;
//        System.out.println(square.apply(3));
//

        //7. Напишите лямбда-выражение, которое возвращает сумму элементов списка.
//        Function<List<Integer>, Integer> sum = list -> list.stream().
//        mapToInt(Integer::intValue)
//        .sum();
//        System.out.println(sum.apply(Arrays.asList(1, 2, 3, 4)));
//

        //8. Напишите лямбда-выражение, которое возвращает True, если переданная строка начинается с буквы "A".
//        Predicate<String> startsWithA = s -> s.startsWith("A");
//        System.out.println(startsWithA.test("Adelina"));
//

        //9. Напишите лямбда-выражение, которое возвращает список квадратов элементов исходного списка.
//        Function<List<Integer>, List<Integer>> squaresList = list -> list.stream()
//        .map(x -> x * x)
//        .collect(Collectors.toList());
//        System.out.println(squaresList.apply(Arrays.asList(2, 5)));
    }
}