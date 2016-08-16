// Ещё один пример рекурсии
 class RectTest {
  int values[];
  RectTest(int i) {
    values = new int[i];
  }

  // вывести рекурсивно элементы массива
  void printArray(int i) {
    if(i==0) return;
    else printArray(i-1);
    System.out.println("["+(i-1)+"]"+values[i-1]);
  }
}

class Recursion2 {
	public static void main(String args[]) {
		RectTest ob = new RectTest(10);
    int i;

    for(i=0; i<10; i++) ob.balues[i]=i;

    ob.printArray(10);
	}
}