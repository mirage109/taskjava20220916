public class Main {
    public static void main(String[] args) {
// Написать метод, возвращающий целое число равное двойной длине строки, принимаемой в качестве аргумента метода.  Пример: hello -> 10
        String text="Hello World";
        System.out.println(text);
        System.out.println(doubleLength(text));
    }
    public static int doubleLength(String s){
        return s.length()*2;
    }
}
