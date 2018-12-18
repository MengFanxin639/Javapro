package ClassPro;

import java.io.*;
import java.util.Scanner;

/**
 * �����û�����������������סַ������
 * ���û������뱣�浽�ļ��С��û����롰quit����ʾ������ϣ������˳���
 * @version 1.0
 */
public class StreamDemo {
	
	public StreamDemo() throws IOException {
		inputView();
		read();
	}
	
	/**
	 * д�ļ�����
	 * @param str дStringBuilder���ַ���
	 * @throws IOException
	 */
	public static void Write(StringBuilder str) throws IOException {
		String array = null;
		BufferedWriter fStream = null;
		try {
			
			fStream.write(str.toString());
	   		fStream.newLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fStream.close();
		}
	}

	/**
	 * �ظ��������
	 * @throws IOException 
	 */
	public void inputView() throws IOException {
		Scanner input = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		while(true) {
			System.out.print("����������:");
			String name = input.next();
			if (name.equals("quit")) {
				return;
			}
			str.append(name)
				.append(",");
			System.out.print("������סַ:");
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
	 * ���ļ�����
	 * @throws IOException 
	 */
	public void read() throws IOException{
		String line = null;
		BufferedReader in = null;
		try {
			
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
