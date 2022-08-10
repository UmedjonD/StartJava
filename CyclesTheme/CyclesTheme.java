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
		
	}
}