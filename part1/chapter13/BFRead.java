//использовать класс BufferedReader дя чтения символов с консоли
import java.io.*;

class BFRead {
	public static void main(String args[]) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите символы, 'q' - для выхода.");
		// читать символы
		do {
			c = (char) br.read();
			System.out.println(c);
		} while(c!='q');
	}

}
