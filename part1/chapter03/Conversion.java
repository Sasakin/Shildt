// продемонстрировать приведение типов
class Conversion {
	public static void main(String args[]) {
		byte b;			
		int i = 257;
		double d = 323.142;

		System.out.println("\nПреобразования типа int в тип byte.");
		b = (byte) i;
		System.out.println("i и b " + i + " " + b);

		System.out.println("\nПреобразования типа double в тип int.");
		i = (double) d;
		System.out.println("d и i " + d + " " + i);

		System.out.println("\nПреобразования типа double в тип byte.");
		b = (byte) d;
		System.out.println("d и b " + i + " " + b);
	}
}