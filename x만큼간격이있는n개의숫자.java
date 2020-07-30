package programmers;

public class x만큼간격이있는n개의숫자 {

	public static void main(String[] args) {
		int x1 = 0;
		int x2 = 4;
		int x3 = -4;
		
		int n1 = 1;
		int n2 = 3;
		int n3 = 2;
		
		long x4 = (long)x1;
		
		long[] answer = new long[n1];
		
		for (int i = 1; i < n1+1; i++) {
			answer[i-1] = x4*i;
		}
		
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}
