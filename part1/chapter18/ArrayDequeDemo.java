// Продемонстрировать применение класса ArrayDeque
import java.util.*;

class ArrayDequeDemo {
	public static void main(String args[]) {
		// Создать двухстороннюю очередь
		ArrayDeque<String> adq = new ArrayDeque<String>();

		// Использовать класс ArrayDeque для организации стека
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		System.out.println("Извлечение из стека: ");
		While(adq.peek() !=null);
			System.out.print(adq.pop()+" ");

		Syste.out.println();
	}
}