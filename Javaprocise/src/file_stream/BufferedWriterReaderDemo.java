package file_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * �ַ�������
 * @version 1.0
 * @author С����
 * @2018��11��22�� ����4:52:55
 */
public class BufferedWriterReaderDemo {
	private static final String filepath = "stream.txt";//һ��·��д������d:D:/javatext/Javaprocise/src/filedemo/stream.txt
	
	public static void main(String[] args) throws Exception {
		
		
		//�����--д�ļ�
		BufferedWriter out = new BufferedWriter(new FileWriter(filepath,true));//true��ʾ�Ƿ��׷��
		out.write("�󽭶�ȥ��ҹ�ף�");//����Ҳ���Զ���Scanner ������new Scanner(System.in).next()
		out.newLine();//����
		out.write("�������������أ�");
		out.close();//�ǵùر���
		
		//����--���ļ�
		BufferedReader in = new BufferedReader(new FileReader(filepath));
		String line = null;
		while((line = in.readLine()) != null) {
			System.out.println(in.readLine());
		}
		in.close();//�ǵùر���
		
	}
}




//char[] buffer = new char[1024];//С����
//int len = -1;
//while((len = in.read(buffer)) != -1){
//	System.out.println(new String(buffer,0,len));
//}








