// воспользоваться статическим импортом для доступа
// к встроенным в java методам sqrt() и pow()
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

// вычеслить гипотенузу прямоугольного треугольника
class Hyport {
	public static void main(String args[]) {
		double side1, side2;
		double hyport;

		side1=3.0;
		side2=4.0;

		// здесь методы sqrt() и pow() можно вызывать
		// непосредственно опуская имя их класса
		hyport = sqrt(pow(side1,2)+pow(side2,2));
		System.out.println("при заданной длинне сторон "+ side1+" и "+side2+
			" гипотенуза равна "+ hyport);
	}
}
