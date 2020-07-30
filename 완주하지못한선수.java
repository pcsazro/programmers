package 프로그래머스;

import java.util.Arrays;
import java.util.LinkedList;

public class 완주하지못한선수 {

	public static void main(String[] args) {
	String[] participant = {"leo", "kiki", "eden", "leo"};
	String[] completion1 = {"leo", "kiki", "eden"};
	String[] completion2 = {"leo", "leo", "eden"};
	
	Arrays.sort(participant);
	Arrays.sort(completion1);
	Arrays.sort(completion2);
	
	LinkedList<String> part = new LinkedList<String>();
	for (int i = 0; i < participant.length; i++) {
		part.add(participant[i]);
	}
	
	LinkedList<String> comp = new LinkedList<String>();
	for (int i = 0; i < completion1.length; i++) {
		comp.add(completion1[i]);
	}
	
	System.out.println(part);
	String answer = "";
	
	for (int i = 0; i < participant.length; i++) {
		if (part.peek().equals(comp.peek())) {
			part.poll();
			comp.poll();
		} else {
			answer = part.peek();
		}
	}
	
	System.out.println(answer);
		
	}
	
}
