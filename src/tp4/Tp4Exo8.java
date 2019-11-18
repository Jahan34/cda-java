package tp4;

import java.util.Arrays;

public class Tp4Exo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fibo = new int[20];
		System.out.println(Arrays.toString(fibo));
		fibo[0] = 1;
		fibo[1] = 2;
		float nbOr;
		for (int i = 2; i < fibo.length; i++) {
			System.out.println(i);
			fibo[i] = fibo[i - 2] + fibo[i - 1];

		}
		System.out.println(Arrays.toString(fibo));
		for (int i = 2; i < fibo.length; i++) {
			nbOr = (float) fibo[i] / fibo[i - 1];
			System.out.println(nbOr +" "+ i );

			if (nbOr > 1.6179 && nbOr < 1.6181) {
				System.out.println("il est dans l'intervalle");
break;
			}
			System.out.println();
		}

	}

}
