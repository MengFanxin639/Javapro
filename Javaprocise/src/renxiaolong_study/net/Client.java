package renxiaolong_study.net;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * 客户端
 * @version 1.0
 * @author 小新新
 * @2018年11月28日 下午2:44:35
 */
public class Client {

	public static void main(String[] args) throws Exception, IOException {
		//创建客户端对象，并指明连接服务器的主机和端口
		Socket client = new Socket("localhost",8888);
		//获取客户端的输入流对象
		Scanner sc = new Scanner(client.getInputStream());
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		client.close();
	}

}
