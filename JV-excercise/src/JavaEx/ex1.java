package JavaEx;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float sum = 0;
		float number;
		do {
			System.out.println("Enter your number:");
			number = scanner.nextFloat();
			sum+= number;
			if(sum<100) {
				System.out.println("Your total number " + sum);
			}
			if(sum>=100) break;
			
		} while (number>0);
		System.out.println("Your sum is " + sum);
		System.out.println();
		
		int giaithua=1;
		for(int i = 1; i<=10;i++) {
			giaithua*=i;
		}
		System.out.println("Your value " + giaithua);
	}

}
