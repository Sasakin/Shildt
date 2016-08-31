// Продемонстрировать применение итераторов
import java.util.*;

class IteratorDemo {
	public static void main(String args[]) {
		// создать списочный массив
		ArrayList<String> al = new ArrayList<String>();

		//ввести элементы в списочный массив
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");

		// использовать итераторы для вывода содержимого списочного массива
		System.out.print("исходное содержимое списочного массива :");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

		// Видоизменить перебираемые объекты
		ListIterator<String> litr = al.listIterator();
		while(litr.hasNext()) {
			String element = litr.next();
			litr.set(element + "+");
		}
		System.out.print("измененное содержимое списочного массива al: ");
		itr = al.iterator();
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

		// а теперь отобразить список в обратном порядке
		System.out.print("измененный в обратном порядке список");
		while(litr.hasPrevious()) {
			String element = litr.previous();
			System.out.print(element + " ");
		}
		System.out.println();
	}
}