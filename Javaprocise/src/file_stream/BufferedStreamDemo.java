package file_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * �ֽڻ�����
 * @version 1.0
 * @author С����
 * @2018��11��22�� ����2:01:28
 */
public class BufferedStreamDemo {
	public static void main(String[] args) throws Exception {
		//�ֽڻ��������
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("stream.txt",true));
		bos.write("HelloWorld��".getBytes());
		bos.close();
		
		//�ֽڻ���������
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream("stream.txt"));
		byte[] buffer = new byte[1024];//С������
		int len = -1;
		
		while((len = bin.read(buffer)) != -1) {
			System.out.println(new String(buffer,0,len));
		}
		bin.close();
	}
	
	
	
	
	
	
	
	
	
}
