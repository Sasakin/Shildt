/* отображение содержимого текстового файла.
   чтобы воспользоваться этой программой
   укажите имя файла, который требуется просмотреть.
   например чтобы просмотреть файл TEST.txt
   введите в командной строке следующую команду

   java ShowFile TEST.TXT

   в этом варианте программы кода, открывающий и закрывающий
   доступ к файлу, заключен в один блок оператора try.
   файл закрывается в блоке оператора finnally.
   */
 
import java.io.*;

public class ShowFile {
	public static void main(String args[]) {
		int i;
		FileInputStream fin = null;

		// сначало убедиться, что имя файла указанно
		if(args.lenth!=1) {
			System.out.println("Использование: ShowFile имя_файла");
			return;
		}
		// в следующем коде сначала открываем файл, а затем
		// из него читаются символы до тех пор, пока не встрерится признак конца файла
		
		try {
			fin = new FileInputStream(args[0]);	

			do {
				i=fin.read();
				if(i!=-1) System.out.print((char) i);
			} while(i!=-1)
		} catch(FileNotFoundException e) {
			System.out.println("файл не найден");
		} catch(IOException e) {
			System.out.println("произошла ошибка ввода вывода");
		}
		// закрыть файл в любом случае
			try {
				fin.close();
			} catch(IOException e) {
				System.out.println("ошибка закрытия файла");
			}
		}
	}