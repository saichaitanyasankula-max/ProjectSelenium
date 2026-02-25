package tekPyramidPrograms;

import java.util.ArrayList;

public class WAJP_TO_FIND_ {

	public static void main(String[] args) {

		String str = "1234567";
		char ch[] = str.toCharArray();

		String str1 = "abcdefgh";
		char ch1[] = str1.toCharArray();

		char chh[] = new char[ch.length + ch1.length];

		int k = 0;

		int min = 0;
		
		System.out.println(ch.length);
		
		System.out.println(ch1.length);
		if (ch.length < ch1.length) {
			min = ch.length;
			System.out.println(min);
		} else {
			min = ch1.length;
			System.out.println(min);
		}
		
	//	System.out.println(min);

		// Interleave both arrays up to the minimum length
		for (int i = 0; i <= min - 1; i++) {
			chh[k] = ch[i];
			k++;
			chh[k] = ch1[i];
			k++;
		}
		
		//System.out.println("minimum integer"+min);

		// Add remaining characters from ch if any
//		for (int i = min; i <= ch.length - 1; i++) {
//			chh[k] = ch[i];
//			k++;
//		}
//
//		// Add remaining characters from ch1 if any
//		for (int i = min; i <= ch1.length - 1; i++) {
//			chh[k] = ch1[i];
//			k++;
//		}

		// Print the merged/interleaved array
		for (int i = 0; i <= chh.length - 1; i++) {
			System.out.print(chh[i]);
		}
	}
}