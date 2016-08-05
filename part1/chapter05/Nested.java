// Циклы могут быть вложенными
class Nested {
	public static void main(String args[]) {
		int nums[] = {6,8,3,7,5,6,1,4};
		int i,j;
		for(i=0;i<10;i++) {
			for(j=i;j<10;j++)
				System.out.print(".");
			System.out.println();
		}
	}
}