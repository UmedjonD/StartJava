public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1: Подсчет суммы четных и нечетных чисел");

        int sumEven = 0;
        int sumOdd = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + odd);

        System.out.println("\n2: Вывод чисел в интервале (min и max) в порядке убывания");

        int number1 = -1;
        int number2 = 5;
        int number3 = 10;
        int max = number2;
        int min = number1;

        if (number1 > number2) {
            max = number1;
        }

        if (number3 > max) {
            max = number3;
        }

        if (number2 < number1) {
            min = number2;
        }

        if (number3 < min) {
            min = number3;
        }

        for (int i = max - 1; i > min; --i) {
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
            System.out.printf("%5d", i);
            count++;
            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }
        for (int i = 0; i <= count; i++) {
            System.out.printf("%5s", 0);
        }

        System.out.println("\n5: Проверка количества единиц на четность");

        number = 31415191;
        int copyNumber = number;
        count = 0;
        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            if (digit == 1) {
                count++;
            }
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
        copyNumber = number;
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        if (copyNumber == reverse) {
            System.out.println("Число " + copyNumber + " является палиндромом");
        } else {
            System.out.println("Число " + copyNumber + " не является палиндромом");
        }

        System.out.println("\n9: Определение, является ли число счастливым\n");

        number = 123312;
        int sum1 = 0;
        int sum2 = 0;
        int digits1 = number / 1000;
        int digits2 = number % 1000;
        int copyDigits = digits1;

        while (copyDigits > 0) {
            int digit = copyDigits % 10;
            int digit2 = digits2 % 10;
            sum1 += digit;
            sum2 += digit2;
            copyDigits /= 10;
        }

        System.out.println("Сумма цифр " + digits1 + " = " + sum1);
        System.out.println("Сумма цифр " + digits2 + " = " + sum2);
        if (sum1 == sum2) {
            System.out.println("число является счастливым");
        } else {
            System.out.println("число не является счастливым");
        }

        System.out.println("\n10: Вывод таблицы умножения Пифагора\n");

        System.out.println("  |  2  3  4  5  6  7  8  9");
        System.out.println("___________________________");
        for(int i = 2; i <= 9; i++) {
            System.out.print(i + " |");
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%1$3d", i * j);
            }
            System.out.print("\n");
        }
    }
}