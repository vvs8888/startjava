public class Person {

    char sex = 'M';
    String name = "Vladimir";
    int heignt = 167;
    int weight = 57;
    int age = 33;

    void move() {
        System.out.println("moving");
    }

    void sit() {
        System.out.println("siting");
    }

    String talk() {
        return "My name is " + name;
    }

    void learnJava() {
        System.out.println("lerning");
    }
}
