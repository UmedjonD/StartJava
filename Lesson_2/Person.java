public class Person {
    
    String gender = "M";
    String name = "Rustam";
    int height = 180;
    int weight = 80;
    int age = 27;

    void walk() {
        System.out.println("walking");
    }

    void sit() {
        System.out.println("sit");
    }

    String run() {
        return "run, Forest, run";
    }

    String talk() {
        return "my name is " + name + "!";
    }

    void teach() {
        System.out.println("Learning java");
    }


}