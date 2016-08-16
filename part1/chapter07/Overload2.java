// Применить автоматическое преобразование типов к перегрузке
 class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
      }
    // Перегружаемы метод проверяющий наличие
    // двух целочисленных параметров
    void test(int a, int b) {
      System.out.println("a и b: "+a+" "+ b);
     }
    // Перегружаемы метод проверяющий наличие
    // параметра типа double
    void test(double a){
      System.out.println("Внутреннее преобразование при вызове test(double) a: "+a);
     }
}

class Overload2 {
  public static void main(String args[]) {
    OverloadDemo ob = new OverloadDemo();
    int i = 88;
    // вызвать все варианты метода test()
    ob.test();
    ob.test(10,20);

    ob.test(i);               // здесь вызывается вариант метода test(double)
    result = ob.test(123.2);  // а здесь вызывается вариант метода test(double)
    System.out.println("Рузультат вызова ob.test(123.25):" + result);
  }
}
