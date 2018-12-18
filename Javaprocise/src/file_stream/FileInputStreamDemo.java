package file_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 演示文件字节输入流
 * @version 1.0
 * @author 小新新
 * @2018年11月21日 下午1:07:17
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws Exception {
		//1.创建目标对象，把数据保存到哪个文件
		File target = new File("stream.txt");
		//2.创建文件字节输出流对象
		OutputStream out = new FileOutputStream(target);
		//3.具体的输出操作
		
		//4.关闭资源
		out.close();
		
		
	}
}
