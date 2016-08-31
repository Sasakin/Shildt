// Простой пример обработки списка почтовых адресов
import java.util.*;

class Address {
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	Address(String n,String s,String c,String st,String cd) {
		name = n;
		street = s;
		city = c;
		state = st;
		code = cd;
	}

	public String toString() {
		return name +\n + street+\n +city+" "+state+" "+code;
	}
}

class MailList {
	public static void main(String args[]) {
		// создать связный список
		LinkedList<Address> ml = new LinkedList<Address>();

		// ввести элементы в связанный список
		ml.add(new Address("west","oak","urbana","il","61801"));
		m1.add(new Address("baker","lane","mahomet","il","61853"));
		m1.add(new Address("carlton","elm","champaign","il","61820"));

		// вывести список почтовых адресов
		for(Address element:ml) {
			System.out.println(element +"\n");
		System.out.println();
		}
	}
}