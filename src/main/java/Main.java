import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        int num = countSpaces("Привет и пока!");
//        System.out.println(num);
//        showPrimitiveNumbers(73);
//        int number = 12345;
//        int number2 = 33333;
//        List<List<Integer>> listOfLists = new ArrayList<>();
//        listOfLists.add(List.of(12, 4, 234));
//        listOfLists.add(List.of(1, 0, 335));
//        listOfLists.add(List.of(1, 0, 335));
//        listOfLists.add(List.of(1, 0, 335));
//        listOfLists.add(List.of(1, 0, 335));
//        isEqualElements(number, listOfLists);
//        isEqualElements(number2, listOfLists);
//        int[] numbers = {1, 1, 3, 1, 1};
//        System.out.println(isHasSumNumbers(5, numbers));
//        int[] numbers2 = {1, 1, 3, 2, 1};
//        System.out.println(isHasSumNumbers(5, numbers2));
//        int[] numbers3 = {1, 1, 3, 2, 1, 10, 5, 6, 0};
//        System.out.println(isHasSumNumbers(1, numbers3));
//        Map<String, Double> students = new HashMap<>();
//        students.put("Иванов", 3.5);
//        students.put("Петрова", 3.6);
//        students.put("Сидоров", 3.5);
//        students.put("Кулаков", 4.1);
//        showBestStudent(students);
    }

    //задание 1
    //На вход в функцию подается строка. Посчитать количество пробелов в этой строке

    public static int countSpaces(String input){
        int counter = 0;
        for (char character : input.toCharArray()){
            if (character == ' ') counter++;
        }
        return counter;
    }

    //задание 2
    //На вход в функцию подается положительное число N. Вывести все простые числа от 1 до N

    public static void showPrimitiveNumbers(int number) {
        int counter;
        for (int i = 2; i <= number; i++){
            counter = 0;
            for (int j = 1; j<i; j++){
                if(i%j==0) counter++;
            }
            if(counter==1) System.out.print(i + " ");
        }
    }

    //задание 3
    /*На вход в функцию подается целое число и лист листов. Вернуть true, если в листе содержится столько элементов,
    сколько цифр в числе и каждый элемент листа содержит количество элементов равное цифре соответствующей цифре числа.
    Сами значения внутри листа роли не играют, важно количество.
    Например: число 35 и лист: { 0 ⇒ {1, 2, 3}, 1 ⇒ {1, 2, 3, 4, 5}} ⇒ trueчисло 2 и лист: { 0 ⇒ {1, 2, 3}} ⇒ false*/

    public static boolean isEqualElements(int number, List<List<Integer>> listList){
        char[] chars = ("" + number).toCharArray();
        int[] numbers = new int[chars.length];
        for(int i = 0; i< numbers.length; i++){
            numbers[i] = Character.getNumericValue(chars[i]);
            System.out.print("num[" + i +"]=" + numbers[i] + " ");
        }
        System.out.println();

        boolean flag = true;
        if (listList.size() == numbers.length){
            for(int i = 0; i< numbers.length; i++){
                if (!(listList.get(i).size() == numbers[i])) {flag = false; break;}
            }
        }
        return flag;
    }

    //задание 4
    //На вход в функцию подается массив и число N. Вернуть true, если в массиве есть любые 2 числа,
    // сумма которых дает N. В противном случае вернуть false [1, 2, 3], 5 ⇒ true[2, 3, 3], 4 ⇒ false
    public static boolean isHasSumNumbers(int number, int... numbers){
        boolean flag = false;
        for(int i = 0; i<numbers.length; i++){
            for (int j = 0; j<numbers.length; j++){
                int sumResult = numbers[i] + numbers[j];
                if((sumResult == number) && i!=j) {flag = true; break;}
            }
        }
        return flag;
    }

    //задание 5
    //Дана карта студентов (Фамилия ⇒ средний балл). Вывести на экран фамилию студента с наивысшим средним баллом.
    // Если таких несколько, то вывести встречающегося в карте первым
    public static void showBestStudent(Map<String, Double> students){
        Map.Entry<String, Double> bestStudent = students.entrySet().iterator().next();
        for(Map.Entry<String, Double> item : students.entrySet()){
            if(item.getValue() > bestStudent.getValue()) bestStudent = item;
        }
        System.out.println("Лучший студент - " + bestStudent.getKey() + " со средним баллом: " + bestStudent.getValue());
    }
}
