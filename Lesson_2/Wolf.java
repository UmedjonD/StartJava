public class Wolf {

    private String gender;
    private String nickname;
    private int weight;
    private int age;
    private String color;

    public Wolf() {
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public String getGender() {
        return gender;
    }

    public String getNickname() {
        return nickname;
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

    public void go() {
        System.out.println("go go");
    }

    public void sit() {
        System.out.println("sit down");
    }

    public String run() {
        return "run";
    }

    public void howl() {
        System.out.println("howl");
    }

    public void hunt() {
        System.out.println("We'll hunt");
    }
}