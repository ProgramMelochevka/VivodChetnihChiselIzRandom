package by.home.maxzzzit;
// Напиши класс, который генерирует и выводит на экран серию из 10 случайных двухзначных
// положительных чисел – и определяет, сколько значений в этой серии были четными.
// Например в серии 13, 45, 32, 67, 88, 45, 37, 79, 47, 13 имеется 2 случайных числа (32, 88)

public class VivodChetnihChiselIzRandom {
	static int rand, kolvo;
	public static void main(String[]args) {
		System.out.print("Серия случайных чисел: ");
		for (int i=0; i<10; i++) {
		rand = 10+(int)(Math.random()*90);
		System.out.print(rand+ " ");
		if (rand%2==0)
			kolvo ++;		
		}
		System.out.print("имеется "+kolvo+" случайных числа");

	}
}
