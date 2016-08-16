/* В этом классе определяется целочисленный стек, в котором
можно хранить до 10 целочисленных значений	*/
 class Stack {
  /* теперь переменные stck и tos являются закрытыми. Это позволяет
    сохранить стек */
    private int stck[] = new int[10];
    private int tos;

    // инициализировать вершину стэка
    Stack() {
      tos = -1;
    }

    // разместить элемент в стэке
    void push(int item) {
      if(tos==9)
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

class TestStack {
  public static void main(String args[]) {
    Stack mystack1 = new Stack();
    Stack mystack2 = new Stack();

    // разместить чила в стеке
    for(int i=0; i<10; i++) mystack1.push(i);
    for(int i=10; 20; i++) mystack2.push(i);

    // извлеч эти числа из сиека
    System.out.println("Содержимое стека mystack1:");
    for(int i=0;i<10;i++) 
        System.out.println(mystak1.pop());

    System.out.println("Содержимое стека mystack2:");
    for(int i=0;i<10;i++) 
        System.out.println(mystak2.pop());
      // эти операторы недоступны
    // mystack1.tos=-2; 
    // mystack2.stck[3]=100;  
  }
}
