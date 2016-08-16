/* В данном примере программы для инициализации размеров
	прарллелепипеда в классе Box применяется конструктор
	*/
 class Box {
  	double whidth;
  	double height;
  	double depth;
  	// Это конструктор класса Box
  	Box() {
  		System.out.println("Конструктор объекта Box");
  		whidth=10;
  		height=10;
  		depth=10;
  	}
  	
  	// рассчитать и возвратить объем
  	double volume(){
  		return whidth*height*depth;
  	}
  }

// В этом классе объявляется объект типа Box
class BoxDemo6 {
	public static void main(String args[]) {
		// объявить, выделить память и инициализировать объекты типа Box
		Box mybox1 = new Box();
		Box mybox2 = new Box();

		double vol;

		// расчитать объем первого параллелепипеда
		vol = mybox1.volume;	
		System.out.println("Объем равен "+ vol);

		// расчитать объем второго параллелепипеда
		vol = mybox2.volume;	
		System.out.println("Объем равен "+ vol);
	}
}