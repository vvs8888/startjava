public class Wolf2 {
    
    private String name;
    private char sex;
    private int weight;
    private int age;
    private String color;

    public String getName() {
        return name;
    }
    public char getSex() {
        return sex;
    }
    public int getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void go() {
        System.out.println("going");
    }

    public void sit() {
        System.out.println("siting");
    }

    public void run() {
        System.out.println("runing");
    }

    public void howl() {
        System.out.println("howling");
    }

    public void hunt() {
        System.out.println("hunting");
    }

}