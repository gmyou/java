package test;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Reverse this strings";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println("");
		System.out.println("StringBuffer");
		// ���۸� ����ϴ�.
		StringBuffer strBuffer = new StringBuffer();
		// ��ȯ�� ���ڿ�
		str = "Reverse this strings";
		// ���ۿ� ���ڿ��� �ְ�
		strBuffer.append(str);
		// ���۾ȿ� reverse()�� �̿��� �Ųٷ� ���
		System.out.print(strBuffer.reverse());
	}

}
