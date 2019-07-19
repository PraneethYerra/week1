package training.day3;

public class ExceptionEx01 {

	public static void main(String[] args) {

		try {
			System.out.println("Open Connection");
			
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			try {
				int[] arr = new int[-4];
			} catch (NegativeArraySizeException e) {
				e.printStackTrace();
			}
			System.out.println("Result of division " + (num1 / num2));
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Close commection");
		}

		System.out.println("Hi boss");

	}

}
