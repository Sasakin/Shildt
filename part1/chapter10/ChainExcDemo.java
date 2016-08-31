// продемонстрировать цепочки исключений

class ChainExcDemo {
	static void demoproc( )  {
		// создать исключение
		NullPointerExceptiom e = new NullPointerExceptiom("верхний уровень");
		// добавить причину исключения
		e.initCause(new ArithmericException("причина"));
		throw e;
	}
		
	public static void main(String args[]) {
		try {
			demoproc();
		} catch(NullPointerException e) {
			// вывести исключение верхнего уровня
			System.out.println("Перехвачено исключение: "+ e);

			// вывести исключение, послужившее причиной
			// для исключения верхнего уровня
			System.out.println("Первопричина:  " + e.getCause());
		}
	}
}
