package file_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * ��ʾ�ļ��ֽ�������
 * @version 1.0
 * @author С����
 * @2018��11��21�� ����1:07:17
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws Exception {
		//1.����Ŀ����󣬰����ݱ��浽�ĸ��ļ�
		File target = new File("stream.txt");
		//2.�����ļ��ֽ����������
		OutputStream out = new FileOutputStream(target);
		//3.������������
		
		//4.�ر���Դ
		out.close();
		
		
	}
}
