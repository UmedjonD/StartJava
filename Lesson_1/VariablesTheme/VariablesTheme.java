public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1: Создание переменных и вывод их значений на консоль");

        byte countKeybord = 1;
        short countPrinter = 2;
        int countRam = 8;
        long countMonitor = 3L;
        float countCpu = 2.20F;
        double countIntelCore = 7.3632;
        char series = 'S';
        boolean isMouse = true;

        System.out.println("количество клавиатур = " + countKeybord);
        System.out.println("количество принтеров = " + countPrinter);
        System.out.println("количество оперативки = " + countRam);
        System.out.println("количество мониторов = " + countMonitor);
        System.out.println("центральный процессор = " + countCpu);
        System.out.println("Intel core = " + countIntelCore);
        System.out.println("серия = " + series);
        System.out.println("мышка = " + isMouse);

        System.out.println("\n2: Расчет стоимости товара со скидкой");

        short priceGoodsX = 100;
        short priceGoodsY = 200;
        double percent = 0.11;
        double discount = (priceGoodsX + priceGoodsY) * percent;
        double discountPrice = (priceGoodsX + priceGoodsY) - discount;
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

        char codeChar1 = 35;
        char codeChar2 = 38;
        char codeChar3 = 64;
        char codeChar4 = 94;
        char codeChar5 = 95;
        System.out.println(codeChar1 + " = " + (int) codeChar1);
        System.out.println(codeChar2 + " = " + (int) codeChar2);
        System.out.println(codeChar3 + " = " + (int) codeChar3);
        System.out.println(codeChar4 + " = " + (int) codeChar4);
        System.out.println(codeChar5 + " = " + (int) codeChar5);

        System.out.println("\n7: Произведение и сумма цифр числа");
        int srcNumber = 345;
        System.out.println("число = " + srcNumber);
        int hundred = srcNumber / 100;
        int ten = (srcNumber / 10) % 10;
        int ones = srcNumber % 10;
        int sum = hundred + ten + ones;
        int mult = hundred * ten * ones;
        System.out.println("sum = " + sum);
        System.out.println("multiplication = " + mult);

        System.out.println("\n8: Вывод на консоль ASCII-арт Дюка");
        char underscore = '_';
        char backSlash = '\\';
        char slash = '/';
        char parenthesesLeft = '(';
        char parenthesesRight = ')';
        char space = ' ';
        System.out.println("" + space + space + space + space + space + slash + backSlash);
        System.out.println("" + space + space + space + space + slash + space + space + backSlash);
        System.out.println("" + space + space + space + slash + underscore + parenthesesLeft + parenthesesRight + space + backSlash);
        System.out.println("" + space + space + slash + space + space + space + space + space + space + backSlash);
        System.out.println("" + space + slash + underscore + underscore + underscore + underscore + slash + backSlash + underscore + underscore + backSlash);

        System.out.println("\n9: Отображение количества сотен, десятков и единиц числа");
        int hundreds = (srcNumber / 100);
        int tens = (srcNumber / 10) % 10;
        int units = srcNumber % 10;
        System.out.println("число " + srcNumber + '\n' + "сотен = " + hundreds + " десятков = " + tens + " единиц = " + units);

        System.out.println("\n10: Преобразование секунд");
        int second = 86399;
        System.out.println("ЧЧ : " + (second / 3600) + " ММ : " + (second / 60 % 60) + " CC : " + (second % 60));
    }
}