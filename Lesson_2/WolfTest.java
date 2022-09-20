public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("MAN");
        wolf.setNickname("Choko");
        wolf.setWeight(20);
        wolf.setAge(5);
        wolf.setColor("Black");

        System.out.println("Gender " + wolf.getGender());
        System.out.println("Name " + wolf.getNickname());
        System.out.println("Вес " + wolf.getWeight());
        System.out.println("Возраст " + wolf.getAge());
        System.out.println("Окрас " + wolf.getColor());

        wolf.go();
        wolf.howl();
        wolf.run();
        wolf.sit();
        wolf.hunt();
    }
}