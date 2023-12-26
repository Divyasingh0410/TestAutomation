package week2.day1;


public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindOddNumbers oddNumber= new FindOddNumbers();
		oddNumber.oddNumber(1,10);
	}

	public void oddNumber(int intinalization, int maxRange) {
		System.out.println("Print the odd number from "+intinalization+" to "+maxRange);
		for(int i=intinalization; i<=maxRange; i++) {
			if ((i%2)==1) {
				System.out.println(i);
			}
		}
		
	}
}
