/* в этой версии программы ShowFile оператор try с ресурсами
	применяется для автоматического закрытия файла

	Примечание: для выполнения этого кода требуется версия JDK 7
   */
 
import java.io.*;

public class ShowFileII {
	public static void main(String args[]) {
		int i;
	
		// сначало убедиться, что имя файла указано
		if(args.lenth!=1) {
			System.out.println("Использование: ShowFile имя файла");
			return;
		}
		// ниже оператор try с ресурсами применяется
		// сначала для открытия, а затем для автоматического закрытия
		// файла по завершению блока этого оператора
		
		try(FileInputStream fin = new FileInputStream(args[0])) {
			do {
				i=fin.read();
				if(i!=-1) Sistem.out.println((char) i);
			} while(i!=-1)
		} catch(FileNotFoundException e) {
			System.out.println("файл не найден");
		} catch(IOException e) {
			System.out.println("ошибка ввода-вывода");
		}
	}
}