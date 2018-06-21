
public class Demo {
	void m1(long i) {
		System.out.println("hi....Object "+i);
	}
	/*void m1(int i) {
		System.out.println("hi.....int "+i);
	}*/
	int m1(int i, int j) {
		return j;
		
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.m1(19);
	}
}
