package filedemo;

import java.io.*;
import java.util.Scanner;

/**
 * 允许用户依次输入多个姓名和住址，并能
 * 将用户的输入保存到文件中。用户输入“quit”表示输入完毕，程序退出。
 * @version 1.0
 * @author 小新新
 * @2018年11月25日 下午8:53:38
 */
public class StreamDemo {
	public static final String filepath = "D:/javatext/Javaprocise/src/filedemo/file.txt";
	public StreamDemo() throws IOException {
		inputView();
		read();
	}
	
	/**
	 * 写文件方法
	 * @param str 写StringBuilder的字符串
	 * @throws IOException
	 */
	public static void Write(StringBuilder str) throws IOException {
		String array = null;
		BufferedWriter fStream = null;
		try {
			fStream = new BufferedWriter(new FileWriter(filepath,true));
			fStream.write(str.toString());
			fStream.newLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fStream.close();
		}
	}

	/**
	 * 重复输入界面
	 * @throws IOException 
	 */
	public void inputView() throws IOException {
		Scanner input = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		while(true) {
			System.out.print("请输入姓名:");
			String name = input.next();
			if (name.equals("quit")) {
				return;
			}
			str.append(name)
				.append(",");
			System.out.print("请输入住址:");
			String address = input.next();
			if (address.equals("quit")) {
				return;
			}
			str.append(address)
				.append(";");
			Write(str);
		}
	}
	/**
	 * 读文件方法
	 * @throws IOException 
	 */
	public void read() throws IOException{
		String line = null;
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(filepath));
			while((line = in.readLine()) != null){
				System.out.println(line);;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			in.close();
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		StreamDemo sDemo = new StreamDemo();
		
		
	}


	
	
	
}
