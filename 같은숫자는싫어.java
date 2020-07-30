package 프로그래머스;

import java.util.*;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
//		int[] a = { 1, 1, 3, 3, 0, 1, 1};
		int[] b = { 4, 4, 4, 3, 3, 1,1,1,2,2,3,3,2,2,1 ,9,9,9,87,4,2};

		ArrayList<Integer> c = new ArrayList<Integer>();

		for (int i = 1; i < b.length; i++) {
			if (c.size() == 0) {
				c.add(b[i - 1]);
			}
			else {
				if (b[i - 1] != b[i] && b[i - 1] != c.get((c.size() - 1))) {
					c.add(b[i - 1]);
				} else {
					continue;
				}
			}
		}
		c.add(b[b.length-1]);
		
		int[] answer = new int[c.size()];
		
		for (int j = 0; j < c.size(); j++) {
			answer[j] = (c.get(j));
		}
		
		System.out.println(c);
		
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}
}
