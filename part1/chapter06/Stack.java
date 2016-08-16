/* В этом классе определяется целочисленный стек, в котором
можно хранить до 10 целочисленных значений	*/
 class Stack {
    int stck[] = new int[10];
    int tos;

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
