package User;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/**
 * �ļ��Ķ�д����
 * @version 1.0
 * @author С����
 * @2018��9��4�� ����3:26:58
 */
public class FileDemo {
	
	private static final String FilePath = "src/User/User.java";
	public static void main(String[] args) throws IOException {
		File file = new File(FilePath);
		InputStream inputStream = new FileInputStream(file);
		byte[] bytes =new byte[10000];
		inputStream.read(bytes);
//		int count = 0;
//		while ((bytes[count] = (byte)inputStream.read() ) != -1 ){
//			count++;
//			
//		}
		
		String content = new String(bytes);
		System.out.println(content);
		inputStream.close();
	}

}
