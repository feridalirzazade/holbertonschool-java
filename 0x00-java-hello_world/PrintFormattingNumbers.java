public class PrintFormattingNumbers {
    public static void main(String[] args) {
        /*
        float tax = 0.2456f;
        float value = 7654.321f;
        char s = '%';
        System.out.printf("Value: $%,.2f",value);
        System.out.println();
        System.out.printf("Tax: %,.2f%c",tax , s);
        System.out.println();
         */
        int num = 0;

        while (num < 10) {
            if (num < 5) {
                System.out.print(num + 1 + " ");
            } else {
                System.out.print(num + " ");
            }

            num++;
        }
    }
}
