// Применение оператора break в качестве цивилизованной
// формы оператора goto
class Break {
	public static void main(String args[]) {
		boolean t = true;

		first: {
			second: {
				third: {
					System.out.println("Предшевствует оператору break.");
					if(t) break second; //выходим из блока second
					System.out.println("Этот оператор не будет выполняться");
				}
				System.out.println("Этот оператор не будет выполняться");
			}
			System.out.println("Этот оператор следует за блоком second");
		}
	}
}