/* В данном примере конструкторы определяются в классе Box()
 для инициализации размеров параллелепипеда тремя разными способами
	*/
 class Box {
  	double whidth;
  	double height;
  	double depth;
  	// Это конструктор используемый при указании всех размеров
  	Box(double w,double h,double d) {
  		whidth=w;
  		height=h;
  		depth=d;
  	}
    // Это конструктор используется когда ни один из размеров не указан
    Box() {
      whidth=-1;
      height=-1;
      depth=-1;
    }
    // Это конструктор используемый при создании куба
    Box(double len) {
       whidth=height=depth=len;
    }
  	
  	// рассчитать и возвратить объем
  	double volume(){
  		return whidth*height*depth;
  	}
  }

// В этом классе объявляется объект типа Box
class OverloadCons {
	public static void main(String args[]) {
		// создать параллелепипеды используя разные конструкторы
		Box mybox1 = new Box(10,20,15);
		Box mybox2 = new Box();
    Box mycube = new Box(7);

		double vol;

		// расчитать объем первого параллелепипеда
		vol = mybox1.volume;	
		System.out.println("Объем равен "+ vol);

		// расчитать объем второго параллелепипеда
		vol = mybox2.volume;	
		System.out.println("Объем равен "+ vol);

    // расчитать объем rкуба
    vol = mycube.volume;  
    System.out.println("Объем равен "+ vol);
	}
}