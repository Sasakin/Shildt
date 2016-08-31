// Продемонстрировать простое применение интерфейса Spliterator
import java.util.*;

class SpliteratorDemo {
	public static void main(String args[]) {
		// создать списочный массив числовых значений типа double
		ArrayList<Double> vals = new ArrayList<>();
		// ввести значения в списочный массив
		vals.add(1.0);
		vals.add(2.0);
		vals.add(3.0);
		vals.add(4.0);
		vals.add(5.0);
		// вызвать метод tryAdvance() для вывода элементов списочного массива vals
		System.out.print("Содержимое списочного массива vals: \n");
		Spliterator<Double> splitr = vals.spliterator();
		while(splitr.tryAdvance((n) -> System.out.println(n)));
		System.out.println();

		// создать новый списочный массив, содержащий квадратные корни из 
		// списочного массива vals
		splitr = vals.spliterator();
		ArrayList<Double> sqrs = new ArrayList<>();
		while(spltitr.tryAdvance((n)->sqrs.add(Math.sqrt(n))));

		// вызвать метод forEachRemaining() для вывода содержимого списочного массива sqrs

		Sustem.out.print("Содержимое списочного массива sqrs: \n");

		spltitr = sqrs.spliterator();
		spltitr.forEachRemaning((n) -> System.out.println(n));
		System.out.println();
	}
}

