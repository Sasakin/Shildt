// В этой программе наследование применяется для расширения класса Box

 class Box {
  	double whidth;
  	double height;
  	double depth;
  	// Сконструировать клон объекта
    Box(Box ob) {
      whidth=ob.whidth;
      height=ob.height;
      depth=ob.depth;
    }
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

// расширить класс Box включив в него поле веса
  class BoxWeight extends Box {
  	double weight; // вес параллелепипеда
  	// конструктор BoxWeight
  	BoxWeight(double w,double h,double d, double m) {
  		whidth=w;
  		height=h;
  		depth=d;
  		weight=m;
  	}
  }
class DemoBoxWeight {
	public static void main(String args[]) {
		// создать параллелепипеды используя разные конструкторы
		DemoBoxWeight mybox1 = new DemoBoxWeight(10,20,15,34.3);
		DemoBoxWeight mybox2 = new DemoBoxWeight(2,3,4,0.076);
		double vol;

		// расчитать объем первого параллелепипеда
		vol = mybox1.volume();	
		System.out.println("Объем mybox1 равен "+ vol);
		System.out.println("Вес mybox1 равен "+ mybox1.weight);
		System.out.println();

		// расчитать объем второго параллелепипеда
		vol = mybox2.volume();	
		System.out.println("Объем mybox2 равен "+ vol);
		System.out.println("Вес mybox2 равен "+ mybox1.weight);
		System.out.println();
	}
}