package file_stream;

import java.io.*;

/**
 * 获取进程数据-编译运行java代码
 * @version 1.0
 * @author 小新新
 * @2018年11月21日 下午8:14:04
 */
public class ProcessDemo {
	public static void main(String[] args) throws Exception {
		String string = "System.out.println(\"nishi\");";
		eval(string);
		
	}

	private static void eval(String string) throws IOException {
		//1:使用StringBder拼接一个HelloWorld程序
		StringBuilder sBuilder = new StringBuilder(80);
		sBuilder.append("public class Hello{")
			.append("public static void main(String[] args) {")
			.append(string)
			.append(";")
			.append("}")
			.append("}");
		//2:保存到一个叫hello.java文件中
		OutputStream out = new FileOutputStream("Hello.java");
		out.write(sBuilder.toString().getBytes());
		out.close();
		System.out.println(string);
	}
}
