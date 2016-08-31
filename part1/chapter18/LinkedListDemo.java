// Продемонстрировать применение класса LinkedList
import java.util.*;

class LinkedListDemo {
	public static void main(String args[]) {
		// создать связный список
		LinkedList<String> ll = new LinkedList<String>();

		// ввести элементы в связанный список
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1,"A2");

		
		System.out.println("ходное содержимое связвного списка ll: "+ ll);


		// удалить элементы из связаного списка
		ll.remove("F");
		ll.remove(2);
		System.out.println("Содержимое связаного списка ll после удаления элементов "+ll);
		// удалить первый и последний элемент из связаного списка
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Содержимое связаного списка ll после удаления первого и последнего элементов "+ll);
		// получить и присвоить значение
		String val=ll.get(2);
		ll.set(2,val+"изменено");
		System.out.println("Содержимое связаного списка ll после изменения "+ll);
	}
}