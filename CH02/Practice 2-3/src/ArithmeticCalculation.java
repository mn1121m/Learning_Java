import java.util.Scanner;

public class ArithmeticCalculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("x ���� �Է��ϼ���>>");
		int x = scanner.nextInt();
		int y = x*x - 3*x + 7;
		System.out.println("x=" + x + ", y=" + y);
		scanner.close();
	}

}
