public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("1: Перевод псевдокода на язык Java");

        int age = 20;
        boolean sex = true;
        double height = 1.50;
        String name = "Marina";

        if (age > 20) {
            System.out.println("old");
        } else {
            System.out.println("тинейджер ");
        }

        if (!sex) {
            System.out.println("woman");
        } else {
            System.out.println("man");
        }

        if (height < 1.80) {
            System.out.println("короткий");
        } else {
            System.out.println("высокий");
        }

        char firstLetterName = name.charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Marina");
        } else if (firstLetterName == 'N') {
            System.out.println("Natasha");
        } else {
            System.out.println("Kurban");
        }

        System.out.println("");
        System.out.println("2: Поиск max и min числа");

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        if (max > min) {
            System.out.println("max = " + max);
        }
        if (min < max) {
            System.out.println("min = " + min);
        }

        System.out.println("");
        System.out.println("3: Работа с числом");

        int numb = 13;

        if (numb == 0) {
            System.out.println("равно 0");
        }
        if (numb % 2 == 0) {
            System.out.println("четный");
        }
        if (numb % 2 != 0) {
            System.out.println("нечетный");
        }
        if (numb < 0) {
            System.out.println("отрицательный");
        }

        System.out.println("");
        System.out.println("4: Поиск одинаковых цифр в числах");
        int number = 634;
        int number2 = 253;
        int count1 = 1;
        int count2 = 1;
        int hundred = number / 100;
        int ten = (number / 10) % 10;
        int ones = number % 10;
        int hundred2 = number2 / 100;
        int ten2 = (number2 / 10) % 10;
        int ones2 = number2 % 10;

        System.out.println(number);
        System.out.println(number2);

        if (hundred == hundred2) {
            System.out.println("одинаковых цифр = " + hundred);
            System.out.println("номер разяда первого " + count1);
            System.out.println("номер разяда второго " + count2);
        }

        if (hundred == ten2) {
            System.out.println("одинаковых цифр = " + hundred);
            System.out.println("номер разяда первого " + count1);
            System.out.println("номер разяда второго " + (++count2));
        }

        if (hundred == ones2) {
            System.out.println("одинаковых цифр = " + hundred);
            System.out.println("номер разяда первого " + count1);
            System.out.println("номер разяда второго " + (count2 + 2));
        }

        if (ten == hundred2) {
            System.out.println("одинаковых цифр = " + ten);
            System.out.println("номер разяда первого " + (++count1));
            System.out.println("номер разяда второго " + count2);
        }

        if (ten == ten2) {
            System.out.println("одинаковых цифр = " + ten);
            System.out.println("номер разяда первого " + (++count1));
            System.out.println("номер разяда второго " + (++count2));
        }

        if (ten == ones2) {
            System.out.println("одинаковых цифр = " + ten);
            System.out.println("номер разяда первого " + (++count1));
            System.out.println("номер разяда второго " + (count2 + 2));
        }

        if (ones == hundred2) {
            System.out.println("одинаковых цифр = " + ones);
            System.out.println("номер разяда первого " + (count1 + 2));
            System.out.println("номер разяда второго " + count2);
        }

        if (ones == ten2) {
            System.out.println("одинаковых цифр = " + ones);
            System.out.println("номер разяда первого " + (count1 + 2));
            System.out.println("номер разяда второго " + (++count2));
        }

        if (ones == ones2) {
            System.out.println("одинаковых цифр = " + ones);
            System.out.println("номер разяда первого " + (count1 + 2));
            System.out.println("номер разяда второго " + (count2 + 2));
        }

        System.out.println("");
        System.out.println("5: Определение буквы, числа или символа по их коду");
        char define = '\u0057';
        int code = define;

        if (code > 64 && code <= 90 || code > 96 && code <= 122) {
            System.out.println("Это буква " + define);
        } else if (code > 48 && code < 58) {
            System.out.println("Это число ");
        } else {
            System.out.println("не число не буква");
        }
        
        System.out.println("");
        System.out.println("6: Определение суммы вклада и начисленных банком %");

        double percent = 0.07;
        int money = 300000;
        int profit = 0;

        if (money < 100000) {
            profit = (int) (money * 0.05);
        }

        if (money >= 100000 && money <= 300000) {
            profit = (int) (money * percent);
        }

        if (money > 300000) {
            profit = (int) (money * 0.1);
        }

        System.out.println("сумму вклада = " + money);
        System.out.println("начисленный % = " + percent);
        System.out.println("итоговую сумму с % = " + (money + profit));

        System.out.println("");
        System.out.println("7: Определение оценки по предметам");

        int ratingByProgramming = 91;
        int ratingByHistory = 59;
        int ratingTwo = 2;
        int ratingThree = 3;
        int ratingFour = 4;
        int ratingFive = 5;
        String history = "History";
        String programming = "Programming";

        if (ratingByHistory <= 60) {
            System.out.println(ratingTwo + " - " + history);
        }

        if (ratingByHistory > 60 && ratingByHistory <= 73) {
            System.out.println(ratingThree + " - " + history);
        }

        if (ratingByHistory > 73 && ratingByHistory <= 91) {
            System.out.println(ratingFour + " - " + history);
        }

        if (ratingByHistory > 91) {
            System.out.println(ratingFive + " - " + history);
        }

        if (ratingByProgramming <= 60) {
            System.out.println(ratingTwo + " - " + programming);
        }

        if (ratingByProgramming > 60 && ratingByProgramming <= 73) {
            System.out.println(ratingThree + " - " + programming);
        }

        if (ratingByProgramming > 73 && ratingByProgramming <= 91) {
            System.out.println(ratingFour + " - " + programming);
        }

        if (ratingByProgramming > 91) {
            System.out.println(ratingFive + " - " + programming);
        }

        System.out.println((ratingTwo + ratingThree + ratingFour + ratingFive) / 4 + " - Average rating");
        System.out.println((ratingByProgramming + ratingByHistory) / 2 + " - Average score");

        System.out.println("");
        System.out.println("8: Расчет прибыли");

        int rentRoom = 5000;
        int saleProducr = 13000;
        int costPrice = 9000;
        int rentRoomInYear = rentRoom * 12;
        int saleProducrInYear = saleProducr * 12;
        int costPriceInYear = costPrice * 12;
        System.out.println(saleProducrInYear - (rentRoomInYear + costPriceInYear));

    }
}