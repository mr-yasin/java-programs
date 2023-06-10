import calculatoroperation.Operation;
import java.util.Scanner;
public class Caluculator {

	public static void main(String[] args) {
	
		Operation a= new Operation();
		a.add(10,20, 30);
		a.sub(20,10);
		a.multiply(10, 20);
		a.div(20,10);
	}
}
