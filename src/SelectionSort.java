import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 5 integers:");
		int[] s = new int[5];
		for(int i=0; i<s.length; i++) {
			s[i] = input.nextInt();
		}
		System.out.println("The array is "+Arrays.toString(s));	
		SortAlgrithm(s);
	}

	public static void SortAlgrithm(int[] a) {
		int temp;
		int smallestInd;
		for(int i=0; i<a.length-2; i++) {
			smallestInd = i;
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j]<a[smallestInd]) {
					smallestInd = j;
				}
					temp = a[j];
					a[j] = a[smallestInd];
					a[smallestInd] = temp;
			}
		}
		System.out.println("The sorted array is "+Arrays.toString(a));
	}
}