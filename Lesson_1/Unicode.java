public class Unicode {
    public static void main(String[] args) {
        for (int i = 33; i <= 126; i++) {
            System.out.println(String.format("symbUnicode = %c", (char)i));
        }
    }
}