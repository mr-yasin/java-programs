package calculatoroperation;

public class Operation {
	
	public void add(int a, int b, int c) {
		System.out.printf("Addition       :%d\n", a + b+c);

	}

	public void sub(int a, int b) {
		System.out.printf("Subtraction    :%d\n", a - b);

	}

	public void multiply(int a, int b) {
		System.out.printf("Multiplication :%d\n", a * b);

	}

	public void div(int a, int b) {
		System.out.printf("Divison        :%,.2f", (float) a / b);

	}

}
