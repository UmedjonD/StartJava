public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1: Создание переменных и вывод их значений на консоль");

        byte keybordCount = 1;
        short printerCount = 2;
        int ramCount = 8;
        long monitorCount = 3L;
        float cpuCount = 2.20F;
        double intelCore = 7.3632;
        char series = 'S';
        boolean isMouse = true;

        System.out.println("byte = " + keybordCount);
        System.out.println("short = " + printerCount);
        System.out.println("int = " + ramCount);
        System.out.println("long = " + monitorCount);
        System.out.println("float = " + cpuCount);
        System.out.println("double = " + intelCore);
        System.out.println("char = " + series);
        System.out.println("boolean = " + isMouse);

        System.out.println("\n2: Расчет стоимости товара со скидкой");

        short product1 = 100;
        short product2 = 200;
        double percent = 0.11;
        double discount = (product1 + product2) * percent;
        double discountPrice = (product1 + product2) - discount;
        System.out.println("сумма скидок = " + discount);
        System.out.println("общая стоимость со скидкой = " + discountPrice);

        System.out.println("\n3: Вывод на консоль слова JAVA");

        System.out.println("   J    a  v     v  a  ");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4: Отображение min и max значений числовых типов данных");

        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L;

        System.out.println("real = " + byteValue + " inc = " + (++byteValue) + " dec = " + (--byteValue));
        System.out.println("real = " + shortValue + " inc = " + (++shortValue) + " dec = " + (--shortValue));
        System.out.println("real = " + intValue + " inc = " + (++intValue) + " dec = " + (--intValue));
        System.out.println("real = " + longValue + " inc = " + (++longValue) + " dec = " + (--longValue));

        System.out.println("\n5: Перестановка значений переменных");

        double numb1 = 1.1;
        double numb2 = 2.2;
        System.out.println("первоначально " + "numb1 = " + numb1 + " numb2 = " + numb2);
        double tmp = numb1;
        numb1 = numb2;
        numb2 = tmp;
        System.out.println("1: с помощью третьей переменной: " + "numb1 = " + numb1 + " numb2 = " + numb2);
        numb1 += numb2;
        numb2 = numb1 - numb2;
        numb1 -= numb2;
        System.out.println("2: с помощью арифметических операций: " + " numb1 = " + numb1 + " numb2 = " + numb2);
        numb1 *= numb2;
        numb2 = numb1 / numb2;
        numb1 /= numb2;
        System.out.println("2.1: с помощью арифметических операций: " + " numb1 = " + numb1 + " numb2 = " + numb2);
        numb1 *= 10;
        numb2 *= 10;
        numb1 = (int) numb1 ^ (int) numb2;
        numb2 = (int) numb1 ^ (int) numb2;
        numb1 = (int) numb1 ^ (int) numb2;
        System.out.println("3: с помощью побитовой операции ^: " + " numb1 = " + numb1 / 10 + " numb2 = " + numb2 / 10);

        System.out.println("\n6: Вывод символов и их кодов");

        int codeChar1 = 35;
        int codeChar2 = 38;
        int codeChar3 = 64;
        int codeChar4 = 94;
        int codeChar5 = 95;
        System.out.println(codeChar1 + " = " + (char) codeChar1 + " обратно " + (int) ((char) codeChar1));
        System.out.println(codeChar2 + " = " + (char) codeChar2 + " обратно " + (int) ((char) codeChar2));
        System.out.println(codeChar3 + " = " + (char) codeChar3 + " обратно " + (int) ((char) codeChar3));
        System.out.println(codeChar4 + " = " + (char) codeChar4 + " обратно " + (int) ((char) codeChar4));
        System.out.println(codeChar5 + " = " + (char) codeChar5 + " обратно " + (int) ((char) codeChar5));

        System.out.println("\n7: Произведение и сумма цифр числа 345");
        int number = 345;
        int hundred = number / 100;
        int ten = (number / 10) % 10;
        int unit = number % 10;
        int sum = hundred + ten + unit;
        int multiplication = hundred * ten * unit;
        System.out.println("sum = " + sum);
        System.out.println("multiplication = " + multiplication);

        System.out.println("\n8: Вывод на консоль ASCII-арт Дюка");
        char ch1 = 95;
        char ch2 = 92;
        char ch3 = 47;
        char ch4 = 40;
        char ch5 = 41;
        char ch6 = 32;
        System.out.println(ch6 + "" + ch6 + "" + ch6 + "" + ch6 + "" + ch6 + "" + ch3 + "" + ch2);
        System.out.println(ch6 + "" + ch6 + "" + ch6 + "" + ch6 + "" + ch3 + "" + ch6 + "" + ch6 + "" + ch2);
        System.out.println(ch6 + "" + ch6 + "" + ch6 + "" + ch3 + "" + ch1 + "" + ch4 + "" + ch5 + "" + ch6 + "" + ch2);
        System.out.println(ch6 + "" + ch6 + "" + ch3 + "" + ch6 + "" + ch6 + "" + ch6 + "" + ch6 + "" + ch6 + "" + ch6 + "" + ch2);
        System.out.println(ch6 + "" + ch3 + "" + ch1 + "" + ch1 + "" + ch1 + "" + ch1 + "" + ch3 + "" + ch2 + "" + ch1 + "" + ch1 + "" + ch2);

        System.out.println("\n9: Отображение количества сотен, десятков и единиц числа");
        int n = 123;
        int hundreds = (n / 100);
        int tens = (n / 10) % 10;
        int units = n % 10;
        System.out.println("число " + n + '\n' + "сотен = " + hundreds + " десятков = " + tens + " единиц = " + units);

        System.out.println("\n10: Преобразование секунд");
        int second = 86399;
        System.out.println("ЧЧ : " + (second / 60 / 60) + " ММ : " + (second / 60 % 60) + " CC : " + (second % 60));
    }
}