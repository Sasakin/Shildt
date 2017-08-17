// Простой обобщенный класс.
// Здесь T - это параметр типа,
// который будет заменен реальным типом.
// при создании объекта класса Gen.
class Gen<T> {
	T ob; // объявление объекта типа T
	
	// Передать конструктору ссылку
	// на объект типа T.
	Gen(T o) {
		ob = o;
	}
	
	// Вернуть ob.
	T getob() {
		return ob;
	}
	
	// показать тип T.
	void showType() {
		System.out.println("Типом T является " + ob.getClass().getName());
	}
}

class GenDemo {
	public static void main(String args[]) {
		// Создато Gen-ссылку для Integers.
		Gen<Integer> iOb;
		
		// Создать объект Gen<Integer> и присвоить 
		// ссылку на iOb. Отметьте применение автоупаковки.
		// для инкапсуляции значения 88 в объект Integer.
		iOb = new Gen<Integer>(88);
		
		// Показать тип данных, используя iOb.
		iOb.showType();
		
		// Получить значение iOb. Обратите внимание,
		// что никакого приведения не нужно.
		int v = iOb.getob();
		System.out.println("значение: "+v);
		System.out.println();
		
		// Создать объект Gen для String.
		Gen<String> strOb = new Gen<String> ("Обобщенный тест");

		
		// Показать тип данный, используемый strOb.
		strOb.showType();
		
		// Получить значение strOb. Опять же
		// приведение не требуется.
		String str = strOb.getob();
		System.out.println("Значение: "+str);
	}
}