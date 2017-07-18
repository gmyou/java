package test;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Reverse this strings";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println("");
		System.out.println("StringBuffer");
		// 버퍼를 만듭니다.
		StringBuffer strBuffer = new StringBuffer();
		// 변환할 문자열
		str = "Reverse this strings";
		// 버퍼에 문자열을 넣고
		strBuffer.append(str);
		// 버퍼안에 reverse()를 이용해 거꾸로 출력
		System.out.print(strBuffer.reverse());
	}

}
