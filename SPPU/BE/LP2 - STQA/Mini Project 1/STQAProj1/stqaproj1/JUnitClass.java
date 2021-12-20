package stqaproj1;

public class JUnitClass {
	
	public int add(int a, int b)
	{
		return a+b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int pythagoras(int a, int b) {
		int c = (a*a)+(b*b);
		int temp;
		int sr = c / 2;
		do {
			temp = sr;
			sr = (temp + (c / temp)) / 2;
		} while ((temp - sr) != 0);

		return sr;
	}
	
	public int areasqr(int c) {
		return c*c;
	}
	
}
