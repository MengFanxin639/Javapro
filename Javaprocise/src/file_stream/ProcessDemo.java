package file_stream;

import java.io.*;

/**
 * ��ȡ��������-��������java����
 * @version 1.0
 * @author С����
 * @2018��11��21�� ����8:14:04
 */
public class ProcessDemo {
	public static void main(String[] args) throws Exception {
		String string = "System.out.println(\"nishi\");";
		eval(string);
		
	}

	private static void eval(String string) throws IOException {
		//1:ʹ��StringBderƴ��һ��HelloWorld����
		StringBuilder sBuilder = new StringBuilder(80);
		sBuilder.append("public class Hello{")
			.append("public static void main(String[] args) {")
			.append(string)
			.append(";")
			.append("}")
			.append("}");
		//2:���浽һ����hello.java�ļ���
		OutputStream out = new FileOutputStream("Hello.java");
		out.write(sBuilder.toString().getBytes());
		out.close();
		System.out.println(string);
	}
}
