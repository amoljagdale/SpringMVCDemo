package nice;

public class NumToWord {
	public static void main(String[] args) {
		int n = 2985;
		if(n<=0) {
			System.out.println("invalid number");
		}
		else {
			NumToWord a= new NumToWord();
			a.scan((n/1000)%100, " thousand");
			a.scan((n/100)%10, " hundred");
			a.scan((n%100), "");
		}
	}
	public void scan(int n, String ch) {
		String one[]={ " ", " one", " two", " three", " four", " five", " six", " seven", " eight", " Nine", " ten",
				" eleven", " twelve", " thirteen", " fourteen", "fifteen", " sixteen", " seventeen", " eighteen",
				" nineteen" };
		String ten[]= { " ", " ", " twenty", " thirty", " forty", " fifty", " sixty", "seventy", " eighty",
		" ninety" };
		
		if(n>19) {
			System.out.print(ten[n/10]+ " "+one[n%10]);
		}
		else {
			System.out.print(one[n]);
		}
		if(n>0)
		{
			System.out.print(ch);
		}
		
		
		
		
		
	}
}
