package programmers;

public class 핸드폰번호가리기 {

	public static void main(String[] args) {
		String phone_number = "010100000000000000000";

		for (int i = 0; i < phone_number.length()-4; i++) {
			phone_number = phone_number.replaceFirst("\\d", "*");
		}
		String answer = "";
		answer = phone_number;
		
		System.out.println(phone_number);
	}
	
//	String substr = phone_number.substring(0, phone_number.length()-4);
//	substr.replace(oldChar, newChar)

}
