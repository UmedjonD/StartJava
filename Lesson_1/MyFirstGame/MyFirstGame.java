import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int computerNumb = 55;
        int playerNumb = 0;
        while (playerNumb != computerNumb) { 
            System.out.print("Угадайте число: ");
            playerNumb = console.nextInt();
            
            if (playerNumb > computerNumb) {
                System.out.println("число " + playerNumb + " больше число компьютера");
            } else {
                System.out.println("число " + playerNumb + " меньше число компьютера");
            }
        }

        System.out.println("You win");
    }
}