public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1: Перевод псевдокода на язык Java");

        int age = 20;
        boolean gender = true;
        double height = 1.50;
        String name = "Marina";

        if (age > 20) {
            System.out.println("old");
        } else {
            System.out.println("тинейджер ");
        }

        if (!gender) {
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

        System.out.println("\n2: Поиск max и min числа");

        int min = 5;
        int max = 2;

        if (max > min) {
            System.out.println("max = " + max);
        } 

        if (min > max) {
            System.out.println("max = " + min);
        }

        if (min < max) {
            System.out.println("min = " + min);
        }

        if (max < min) {
            System.out.println("min = " + max);
        }

        System.out.println("\n3: Работа с числом");

        int number = 634;

        if (number != 0) {
            if (number % 2 == 0) {
                System.out.println("четное");
            }

            if (number % 2 != 0) {
                System.out.println("нечетное");
            }

            if (number < 0) {
                System.out.println("отрицательное");
            }

            if (number > 0) {
                System.out.println("положительное");
            }
        } else {
            System.out.println("равно 0");
        }

        System.out.println("\n4: Поиск одинаковых цифр в числах");
        int number2 = 231;
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
            System.out.println("одинаковое число это " + hundred);
            System.out.println("номер разряда " + count1);
        }

        if (ten == ten2) {
            System.out.println("одинаковое число это = " + ten);
            System.out.println("номер разряда " + (++count1));
        }

        if (ones == ones2) {
            System.out.println("одинаковое число это = " + ones);
            System.out.println("номер разряда " + (count1 + 2));
        }

        System.out.println("\n5: Определение буквы, числа или символа по их коду");
        
        char someChar = '\u0057';
        int code = someChar;

        if (code > 64 && code <= 90) {
            System.out.println(code + " Это большая буква " + someChar);
        } else if (code > 96 && code <= 122) {
            System.out.println(code + " Это маленькая буква " + someChar);
        } else if (code > 48 && code < 58) {
            System.out.println(code + " Это число ");
        } else {
            System.out.println(code + " не число и не буква");
        }
        
        System.out.println("\n6: Определение суммы вклада и начисленных банком %");

        double percent = 0;
        int money = 3000000;
        int profit = 0;

        if (money < 100000) {
            percent = 0.05;
        } else if (money >= 100000 && money <= 300000) {
            percent = 0.07;
        } else {
            percent = 0.1;
        }

        profit = (int) (money * percent);
        System.out.println("сумму вклада = " + money);
        System.out.println("начисленный % = " + percent);
        System.out.println("итоговую сумму с % = " + (money + profit));

        System.out.println("\n7: Определение оценки по предметам");

        int ratingByProgramming = 91;
        int ratingByHistory = 59;

        if (ratingByHistory <= 60) {
            System.out.println("2 - " + "History");
        } else if (ratingByHistory > 60 && ratingByHistory <= 73) {
            System.out.println("3 - " + "History");
        } else if (ratingByHistory > 73 && ratingByHistory <= 91) {
            System.out.println("4 - " + "History");
        } else {
            System.out.println("5 - " + "History");
        }

        if (ratingByProgramming <= 60) {
            System.out.println("2 - " + "Programming");
        } else if (ratingByProgramming > 60 && ratingByProgramming <= 73) {
            System.out.println("3 - " + "Programming");
        } else if (ratingByProgramming > 73 && ratingByProgramming <= 91) {
            System.out.println("4 - " + "Programming");
        } else {
            System.out.println("5 - " + "Programming");
        }

        System.out.println((ratingByProgramming + ratingByHistory) / 2 + " - Average score");

        System.out.println("\n8: Расчет прибыли");

        int rentRoomInYear = 60000;
        int saleProducrInYear = 156000;
        int costPriceInYear = 108000;
        int profitInYear = saleProducrInYear - (rentRoomInYear + costPriceInYear);
        
        if (profitInYear > 0) {
            System.out.println("прибыль за год: " + "+" + profitInYear);
        } else {
            System.out.println("прибыль за год: " + profitInYear);
        }

        System.out.println("\n9: Подсчет количества банкнот");

        int banknote = 1;
        int banknote2 = 10;
        int banknote3 = 100;
        int quantity = 0;
        int quantity2 = 0;
        int quantity3 = 0;
        int cash = 567;
        boolean flag = true;

        while (flag) {
            if (cash > banknote3) {
                cash -= banknote3;
                quantity3++;
            }
            if (cash > banknote2 && quantity2 < 5) {
                cash -= banknote2;
                quantity2++;
            }
            if (cash >= banknote) {
                cash -= banknote;
                quantity++;
            } else {
                flag = false;
            }
        }
        System.out.println("банкнот номиналом 100 = " + quantity3);
        System.out.println("банкнот номиналом 10 = " + quantity2);
        System.out.println("банкнот номиналом 1 = " + quantity);
        System.out.println("количество банкнот = " + (quantity3 + quantity2 + quantity));
    }
}