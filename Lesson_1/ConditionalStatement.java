public class ConditionalStatement {
    public static void main(String[] args) {
        short age = 33;
        boolean isMaleSex = true;
        int height = 167;
        char firstNameSymbol = 'V';

        if (age > 20) {
            System.out.println("Возраст " + age + " больше 20.");
        }

        if (isMaleSex) {
            System.out.println("Указан мужской пол.");
        }

        if (!isMaleSex) {
            System.out.println("Указан не мужской пол.");
        }

        if (height < 180) {
            System.out.println("Карлик.");
        } else {
            System.out.println("Великан.");
        }

        if (firstNameSymbol == 'M') {
            System.out.println("Первая буква имени M.");
        } else if (firstNameSymbol == 'I') {
            System.out.println("Первая буква имени I.");
        } else System.out.println("Первая буква имени " + firstNameSymbol + ".");
    }
}