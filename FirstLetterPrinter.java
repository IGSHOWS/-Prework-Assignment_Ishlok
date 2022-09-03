import java.util.Scanner;

class FirstLetterPrinter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.println("Enter a string : ");
		String input = in.nextLine(); // reads string
		System.out.println(firstLetterPrinter(input));
	}

	static String firstLetterPrinter(String str) {
		String output = " ";
		boolean flag = true;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				flag = true;
			else if (str.charAt(i) != ' ' && flag == true) {
				output = output + (str.charAt(i));
				flag = false;
			}
		}
		return output;
	}
}