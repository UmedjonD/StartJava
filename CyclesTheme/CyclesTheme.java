public class CyclesTheme {
	public static void main(String[] args) {
		System.out.println("\n1: Подсчет суммы четных и нечетных чисел");

		int sum = 0;
		int sum2 = 0;
		int index = -10;
		do {
			if (index % 2 == 0) {
				sum += index;
			}

			if (index % 2 != 0) {
				sum2 += index;
			}

			index++;
		} while (index <= 21);
		System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sum + ", а нечетных = " + sum2);

		System.out.println("\n2: Вывод чисел в интервале (min и max) в порядке убывания");

		int max = 0;
		int min = 0;

		for (int i = 9; i >= 0; --i) {
			System.out.print(i + " ");

			if (i > max) {
				max = i;
			}

			if (i < min) {
				min = i;
			}
		}
		System.out.println("\nmax = " + max);
		System.out.println("min = " + min);

		System.out.println("\n3: Вывод реверсивного числа и суммы его цифр");

		int number = 1234;
		int length = (int) (Math.log10(number) + 1);
		index = 0;
		sum = 0;
		while (index < length) {
			int ones = number % 10;
			number /= 10;
			sum += ones;
			index++;
			System.out.print(ones);
		}
		System.out.println("\nsum = " + sum);

		System.out.println("\n4: Вывод чисел на консоль в несколько строк");

		int count = 0;
		for (int i = 1; i < 24; i = i + 2) {
			System.out.print(i + "\t");
			count++;
			if (count == 5) {
				System.out.println();
				count = 0;
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("0" + "\t");
		}

		System.out.println("\n5: Проверка количества единиц на четность");

		number = 3141591;
		count = 0;
		char[] chars = ("" + number).toCharArray();
		index = 0;
		while (index < chars.length) {
			if (chars[index] == '1') {
				count++;
			}
			index++;
		}

		if (count % 2 == 0) {
			System.out.println("число X содержит " + count + " четное количество единиц");
		} else {
			System.out.println("число X содержит " + count + " нечетное количество единиц");
		}

		System.out.println("\n6: Проверка количества единиц на четность\n");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		int j = 5;
		index = 5;
		while (index > 0) {
			while (j > 0) {
				System.out.print("#");
				j--;
			}
			index--;
			j = index;
			System.out.println();
		}

		index = 5;
		j = 0;
		do {
			do {
				System.out.print("$");
			} while (j < 0);

			index--;

		} while(index > 0);
	}
}