public class Program1 {
    public static void main(String[] args) {

        boolean characterInUppercase1 = Characterc.IsUpper('a');
        boolean characterInUppercase2 = Characterc.IsUpper('B');
        boolean characterInUppercase3 = Characterc.IsUpper('d');
        boolean characterInUppercase4 = Characterc.IsUpper('f');
        boolean characterInUppercase5 = Characterc.IsUpper('G');

        System.out.printf("%b\n", characterInUppercase1);
        System.out.printf("%b\n", characterInUppercase2);
        System.out.printf("%b\n", characterInUppercase3);
        System.out.printf("%b\n", characterInUppercase4);
        System.out.printf("%b\n", characterInUppercase5);
    }
}
