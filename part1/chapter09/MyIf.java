public interface MyIf {
	// это объявление обычного метола в интерфейсе
	// он не предоставляет реалезаци по умолчанию
	int getNumber();

	// А это объявление метода по умолчанию. Обратите внимание
	// на его реалезацию по умолчанию
	default String getString() {
		return "Объект типа String по умолчанию";
	}
}