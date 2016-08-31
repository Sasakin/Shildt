// Продемонстрировать применение класса HashSet
import java.util.*;

class HashSetDemo {
	public static void main(String args[]) {
		// создать хеш-множество
		HashSet<String> hs = new HashSet<String>();

		// ввести элементы в хэш множество
		hs.add("Бета");
		hs.add("Альфа");
		hs.add("Эта");
		hs.add("Гамма");
		hs.add("Эпсилон");
		hs.add("Омега");

		System.out.println(hs);
	}
}


