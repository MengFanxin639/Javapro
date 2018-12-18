package file_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 字节缓冲流
 * @version 1.0
 * @author 小新新
 * @2018年11月22日 下午2:01:28
 */
public class BufferedStreamDemo {
	public static void main(String[] args) throws Exception {
		//字节缓冲输出流
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("stream.txt",true));
		bos.write("HelloWorld！".getBytes());
		bos.close();
		
		//字节缓冲输入流
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream("stream.txt"));
		byte[] buffer = new byte[1024];//小缓冲区
		int len = -1;
		
		while((len = bin.read(buffer)) != -1) {
			System.out.println(new String(buffer,0,len));
		}
		bin.close();
	}
	
	
	
	
	
	
	
	
	
}
