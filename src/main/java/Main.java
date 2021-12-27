public class Main {
    public static void main(String[] args) {
//        int num = countSpaces("Привет и пока!");
//        System.out.println(num);
        showPrimitiveNumbers(77);
    }

    public static int countSpaces(String input){
        int counter = 0;
        for (char character : input.toCharArray()){
            if (character == ' ') counter++;
        }
        return counter;
    }

    public static void showPrimitiveNumbers(int number) {
        int counter;
        for (int i = 0; i < number; i++){
            counter = 0;
            
        }
    }
}
