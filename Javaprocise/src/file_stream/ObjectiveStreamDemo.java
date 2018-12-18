package file_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 使用对象流来实现序列化和反序列化
 * @version 1.0
 * @author 小新新
 * @2018年11月27日 下午6:24:34
 */
public class ObjectiveStreamDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("/onj.txt");
		
//		writeObject(f);
		readObject(f);
		
	}
	/**
	 * 反序列化操作
	 * @param f
	 */
	private static void readObject(File f) throws Exception{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		User user  = (User) in.readObject();
		System.out.println(user);
		in.close();
	}
	/**
	 * 序列化操作
	 * @param f
	 * @throws Exception 
	 */
	private static void writeObject(File f) throws Exception {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
		out.writeObject(new User("will", "1234", 20));
		out.close();
	}
}

/**
 * 需要序列化的对象
 * @version 1.0
 * @author 小新新
 * @2018年11月27日 下午6:25:30
 */
class User implements Serializable{
	private String name;
	private String password;
	private int age;
	
	public User(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return super.toString();
	}
}