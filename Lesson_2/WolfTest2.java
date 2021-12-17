public class WolfTest2 {
    public static void main(String[] args) {

        Wolf2 wolfOne = new Wolf2();
        
        wolfOne.setName("Hugh Jackman");
        wolfOne.setSex(Sex.MALE);
        wolfOne.setWeight(100);
        wolfOne.setAge(5);
        wolfOne.setColor("grey");

        System.out.println("Wolf's name is " + wolfOne.getName());
        System.out.println("Wolf's sex is " + wolfOne.getSex());
        System.out.println("Wolf's weight is " + wolfOne.getWeight());
        System.out.println("Wolf's age is " + wolfOne.getAge());
        System.out.println("Wolf's color is " + wolfOne.getColor());

        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}
