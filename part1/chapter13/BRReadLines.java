// чтение символьных строк с консоли средствами класса BufferedReader
import java.io.*;

class BRReadLines {
	public static void main(String args[]) throws IOException {
		// создать поток ввода типа BufferedReader
		// используя стандартный поток ввода System.in

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Введите символы");
		System.out.println("Введите 'стоп' - для завершения.");
		do {
			str = br.readLine();
			System.out.println(str);
		} while(!str.equals('стоп'));
	}
}
