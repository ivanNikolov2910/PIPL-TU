package lab_exercises.lab_2.processor;

public class Main {
    public static void main(String[] args) {
        MultiProcessor multiProcessor = new MultiProcessor(128, 128*4, 3.4);
        System.out.println(multiProcessor.processTime(600)); // 0.016348s
    }
}
