public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1: Подсчет суммы четных и нечетных чисел");

        int sumEven = 0;
        int sumUneven = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumUneven += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumUneven);

        System.out.println("\n2: Вывод чисел в интервале (min и max) в порядке убывания");

        int max = 0;
        int min = 0;
        int number1 = -1;
        int number2 = 5;
        int number3 = 10;

        if (number1 >= number2 && number1 >= number3) {
            max = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            max = number2;
        } else {
            max = number3;
        }

        if (number1 <= number2 && number1 <= number3) {
            min = number1;
        } else if (number2 <= number1 && number2 <= number3) {
            min = number2;
        } else {
            min = number3;
        }

        for (int i = number3 - 1; i > number1; --i) {
            System.out.print(i + " ");
        }
        System.out.println("\nmax = " + max);
        System.out.println("min = " + min);

        System.out.println("\n3: Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sumDigits = 0;
        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            sumDigits += digit;
            System.out.print(digit);
        }
        System.out.println("\nsum = " + sumDigits);

        System.out.println("\n4: Вывод чисел на консоль в несколько строк");

        int count = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%-5d", i);
            count++;
            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }
        for (int i = 0; i <= count; i++) {
            System.out.printf("%-5s", "0");
        }

        System.out.println("\n5: Проверка количества единиц на четность");

        number = 31415191;
        int copyNumber = number;
        count = 0;
        int index = 0;
        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            if (digit == 1) {
                count++;
            }
            index++;
        }

        if (count % 2 == 0) {
            System.out.println("число " + copyNumber + " содержит " + count + " четное количество единиц");
        } else {
            System.out.println("число " + copyNumber + " содержит " + count + " нечетное количество единиц");
        }

        System.out.println("\n6: Отображение фигур в консоли");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int countChar = 5;
        int countRow = 5;
        while (countRow > 0) {
            while (countChar > 0) {
                System.out.print("#");
                countChar--;
            }
            countRow--;
            countChar = countRow;
            System.out.println();
        }

        countRow = 0;
        countChar = 0;
        do {
            if (countRow <= 1 || countRow == 2) {
                do {
                    System.out.print("$");
                    countChar++;
                } while (countChar <= countRow);
            }

            countChar = 0;
            if (countRow > 2 || countRow == 4) {
                countChar = 5;
                do {
                    System.out.print("$");
                    countChar--;
                } while (countChar > countRow);
            }
            System.out.println();
            countRow++;
        } while (countRow < 5);

        System.out.println("\n7: Отображение ASCII-символов\n");

        System.out.printf("%5s%10s\n", "DEC", "CHAR");
        for (int i = 0; i <= 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%5d%10s\n", i, (char) i);
            }
        }

        for (int i = 97; i < 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%5d%10s\n", i, (char) i);
            }
        }

        System.out.println("\n8: Проверка, является ли число палиндромом\n");

        number = 1234321;
        number2 = number;
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        if (number2 == reverse) {
            System.out.println("Число " + number2 + " является палиндромом");
        } else {
            System.out.println("Число " + number2 + " не является палиндромом");
        }

        System.out.println("\n9: Определение, является ли число счастливым\n");

        number = 123312;
        int sum1 = 0;
        int sum2 = 0;
        count = 0;
        int digits1 = 0;
        int digits2 = 0;
        while (number > 0) {
            int digit = number % 10;
            if (count >= 0 && count < 3) {
                digits1 = digits1 * 10 + digit;
                sum1 += digit;
            }

            if (count >= 3 && count <= 6) {
                digits2 = digits2 * 10 + digit;
                sum2 += digit;
            }
            number /= 10;
            count++;
        }

        System.out.println("Сумма цифр " + digits1 + " = " + sum1);
        System.out.println("Сумма цифр " + digits2 + " = " + sum2);
        if (sum1 == sum2) {
            System.out.println("число является счастливым");
        } else {
            System.out.println("число не является счастливым");
        }

        System.out.println("\n10: Вывод таблицы умножения Пифагора\n");

        for (int i = 2; i < 10; i++) {
            System.out.printf("%3d", i);
        }

        System.out.println();

        for (int i = 2; i < 10; i++) {
            System.out.printf("%d%s", i, "|");
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}