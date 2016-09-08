/* копирование файла.
	чтобы воспользоваться этой программой, укажите
	имена исходного и целевого файлов.
	Например, чтобы скопировать файл FIRST.TXT в файл SECOND.TXT,
	введите в командной строке следующуу команду:


   java CopyFile FIRST.TXT в файл SECOND.TXT .
   */
 
import java.io.*;

public class ShowFile {
	public static void main(String args[]) {
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;

		// сначало убедиться, что указаны имена обоих файлов
		if(args.lenth!=2) {
			System.out.println("Использование: CopyFile откуда куда");
			return;
		}
		// копировать файл
		
		try {
			// попытаться открыть файлы
			fin = new FileInputStream(args[0]);	
			fout = new FileOutputStream(args[1]);

			do {
				i=fin.read();
				if(i!=-1) fout.write(i);
			} while(i!=-1)
		} catch(IOException e) {
			System.out.println("произошла ошибка ввода вывода");
		} finally {
		// закрыть файл в любом случае
			try {
				if(fin!=null) fin.close();
			} catch(IOException e2) {
				System.out.println("ошибка закрытия файла ввода");
			}
			try {
				if(fout!=null) fout.close();
			} catch(IOException e2) {
				System.out.println("ошибка закрытия файла вывода");
			}
		}
	}
}