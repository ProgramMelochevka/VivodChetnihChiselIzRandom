package by.home.maxzzzit;
// Ќапиши класс, который генерирует и выводит на экран серию из 10 случайных двухзначных
// положительных чисел Ц и определ€ет, сколько значений в этой серии были четными.
// Ќапример в серии 13, 45, 32, 67, 88, 45, 37, 79, 47, 13 имеетс€ 2 случайных числа (32, 88)

public class VivodChetnihChiselIzRandom {
	static int rand, kolvo;
	public static void main(String[]args) {
		System.out.print("—ери€ случайных чисел: ");
		for (int i=0; i<10; i++) {
		rand = 10+(int)(Math.random()*90);
		System.out.print(rand+ " ");
		if (rand%2==0)
			kolvo ++;		
		}
		System.out.print("имеетс€ "+kolvo+" случайных числа");

	}
}
