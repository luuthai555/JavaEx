package JavaEx;

import java.util.Arrays;
import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		
		//add
		int n=9;
		int[] arr = {90,90,20,27,35,22,10,8,8};
		int value = 100;
		int pos = 3;
		arr = addValue(arr,n,pos,value);
		System.out.println("New arr : " + Arrays.toString(arr));
		
		//remove
		remove(arr);
		
		
//		 house();
		 }
	public static int[] addValue(int[]arr, int n, int pos, int value) {
		int[] newArr = new int[n+1];
		for(int i=0;i<n+1;i++) {
			if(i<pos-1) {
				newArr[i] = arr[i];
			}else if(i == pos - 1 ) {
				newArr[i] = value;
			}else {
				newArr[i] = arr[i-1];
			}
		}
		return newArr;
	}
	
	public static void remove(int[] arr) {		
		int arrLength = arr.length;
		for(int i=0; i<arrLength;i++) {
			for(int j=i+1;j<arrLength;j++) {
				if(arr[i] == arr[j]) {
					arr[j] = arr[arrLength - 1];
					arrLength --;
				}
			}
		}
		int[] newArr = Arrays.copyOf(arr, arrLength);
		System.out.println(Arrays.toString(newArr));
	}
	
	
	public static void house() {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		int sum=0;
		for(int i=0;i<10;i++) {
			System.out.println("Nhập phần tử của mảng : ");
			arr[i] = scanner.nextInt();
		}
		System.out.println("Mảng vừa được nhập là" + Arrays.toString(arr));
		
		for(int i=0;i<10;i++) {
			if(arr[i]>0 && arr[i]<50) {
				arr[i]*=1549;
			}else if(arr[i]>51 && arr[i]<100) {
				arr[i]*=1600;
			}else if(arr[i]>101 && arr[i]<200) {
				arr[i]*=1857;
			}else if(arr[i]>201 && arr[i]<300) {
				arr[i]*=2340;
			}else if(arr[i]>301 && arr[i]<400) {
				arr[i]*=2615;
			}else if(arr[i]>400) {
				arr[i]*=2701;
			}
			
			sum+=arr[i];
		}
		System.out.println("Số tiền các hộ lần lượt là: " + Arrays.toString(arr));
		System.out.println("Tổng số tiền các hộ là " +sum);
		}
}
