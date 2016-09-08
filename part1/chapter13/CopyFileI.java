/* версия программы CopyFile, использующая оператор try с ресурсами.
	Она демонстрирует управление двумя ресурсами (в данном случае - файлами)
	в одном операторе try
   */
 
import java.io.*;

public class CopyFileI {
	public static void main(String args[]) throws IOException {
		int i;
	
		// сначало убедиться, что заданы оба файла
		if(args.lenth!=2) {
			System.out.println("Использование: CopyFile откуда куда");
			return;
		}
		// открыть два файла и управлять ими в операторе try
		
		try(FileInputStream fin = new FileInputStream(args[0]); FileOutputStrem fout = new FileOutputStrem(args[1])) {
			do {
				i=fin.read();
				if(i!=-1) fout.write(i);
			} while(i!=-1)
		} catch(IOException e) {
			System.out.println("ошибка ввода-вывода" + e);
		}
	}
}