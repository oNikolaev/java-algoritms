package part_01.part_01_01;

public class SamplePrintF {
    public static void main(String[] args) {
        System.out.printf("Hello %s!%n", "World");

        // Line separator
        System.out.printf("baeldung%nline%nterminator%n");

        // Boolean formatting
        System.out.printf("%b%n", "null");
        System.out.printf("%B%n", false);

        // String formatting
        System.out.printf("'%s' %n", "baeldung");
        System.out.printf("'%S' %n", "baeldung");
        System.out.printf("%2.2s", "Hi, there!");

    }
}
