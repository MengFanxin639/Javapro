package file_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * 字符缓冲流
 * @version 1.0
 * @author 小新新
 * @2018年11月22日 下午4:52:55
 */
public class BufferedWriterReaderDemo {
	private static final String filepath = "stream.txt";//一般路劲写法，例d:D:/javatext/Javaprocise/src/filedemo/stream.txt
	
	public static void main(String[] args) throws Exception {
		
		
		//输出流--写文件
		BufferedWriter out = new BufferedWriter(new FileWriter(filepath,true));//true表示是否可追加
		out.write("大江东去日夜白！");//这里也可以定义Scanner 来输入new Scanner(System.in).next()
		out.newLine();//换行
		out.write("奔流到海不复回！");
		out.close();//记得关闭流
		
		//输入--读文件
		BufferedReader in = new BufferedReader(new FileReader(filepath));
		String line = null;
		while((line = in.readLine()) != null) {
			System.out.println(in.readLine());
		}
		in.close();//记得关闭流
		
	}
}




//char[] buffer = new char[1024];//小缓冲
//int len = -1;
//while((len = in.read(buffer)) != -1){
//	System.out.println(new String(buffer,0,len));
//}








