import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computerNumb = 55;
        boolean flag = true;
        while (flag) { 
            System.out.print("Угадайте число: ");
            int playerNumb = sc.nextInt();

            if (playerNumb == computerNumb) {
                System.out.println("You win");
                flag = false;
            }

            if (playerNumb > computerNumb) {
                System.out.println("число " + playerNumb + " больше число компьютера");
            }

            if (playerNumb < computerNumb) {
                System.out.println("число " + playerNumb + " меньше число компьютера");
            }
        }

    }
}