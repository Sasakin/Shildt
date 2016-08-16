/* усовершенствованный класс Stack в котором использован член длинны массива	*/
 class Stack {
  /* теперь переменные stck и tos являются закрытыми. Это позволяет
    сохранить стек */
    private int stck[];
    private int tos;

    // Выделить память под стек и инициализировать его
    Stack(int size) {
      stck = new int[size];
      tos = -1;
    }

    // разместить элемент в стэке
    void push(int item) {
      if(tos==stck.lenth-1) // использовать член длины массива
        System.out.println("Стек заполнен.");
      else
        stck[++tos]=item;
    }
    // извлеч элемент из стека
    int pop() {
      if (tos<0){
        System.out.println("Стек не загружен.");
        return 0;
      }
      else 
        return stck[tos--];
    }
}

class TestStack2 {
  public static void main(String args[]) {
    Stack mystack1 = new Stack(5);
    Stack mystack2 = new Stack(8);

    // разместить чила в стеке
    for(int i=0; i<5; i++) mystack1.push(i);
    for(int i=0; 8; i++) mystack2.push(i);

    // извлеч эти числа из сиека
    System.out.println("Содержимое стека mystack1:");
    for(int i=0;i<5;i++) 
        System.out.println(mystak1.pop());

    System.out.println("Содержимое стека mystack2:");
    for(int i=0;i<8;i++) 
        System.out.println(mystak2.pop());
  }
}
