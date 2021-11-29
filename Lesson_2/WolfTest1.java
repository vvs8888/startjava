public class WolfTest1 {
    public static void main(String[] args) {

        Wolf1 wolfOne = new Wolf1();
        wolfOne.name = "Hugh Jackman";
        wolfOne.sex = 'M';
        wolfOne.weight = 100;
        wolfOne.age = 250;
        wolfOne.color = "grey";

        System.out.println("Wolf's name is " + wolfOne.name);
        System.out.println("Wolf's sex is " + ((wolfOne.sex == 'M') ? "male" : "female"));
        System.out.println("Wolf's weight is " + wolfOne.weight);
        System.out.println("Wolf's age is " + wolfOne.age);
        System.out.println("Wolf's color is " + wolfOne.color);

        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();

    }
}