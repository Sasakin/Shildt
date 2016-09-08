/* отображение содержимого текстового файла.
   чтобы воспользоваться этой программой
   укажите имя файла, который требуется просмотреть.
   например чтобы просмотреть файл TEST.txt
   введите в командной строке следующую команду

   java ShowFile TEST.TXT
   */
 
import java.io.*;

public class ShowFile {
	public static void main(String args[]) {
		int i;
		FileInputStream fin;

		// сначало убедиться, что имя файла указанно
		if(args.lenth!=1) {
			System.out.println("Использование: ShowFile имя_файла");
			return;
		}

		// попытка открыть файл
		try {
			fin = new FileInputStream(args[0]);	
		} catch(FileNotFoundException e) {
			System.out.println("невозможно открыть файл");
			return;
		}
		// теперь файл открыт и готов к чтению
		// далее из него читаются символы 
		// до тех пор, пока не встретится признак конца файла

		try {
			do {
				i=fin.read();
				if(i!=-1) System.out.print((char) i);
			} while(i!=-1)
		} catch(IOException e) {
			System.out.println("ошибка чтения из файла");
		}
		// закрыть файл
		try {
			fin.close();
		} catch(IOException e) {
			System.out.println("ошибка закрытия файла");
		}
		}
	}