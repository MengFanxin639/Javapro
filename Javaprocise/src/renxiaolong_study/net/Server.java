package renxiaolong_study.net;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.*;

/**
 * 服务端
 * @version 1.0
 * @author 小新新
 * @2018年11月28日 下午2:43:37
 */
public class Server {

	public static void main(String[] args) throws IOException {
		//创建服务器，指定端口为8888
		ServerSocket server = new ServerSocket(8888);
		System.out.println("服务端准备就绪");
		//接受连接该服务器的客户端对象
		boolean accept = true;
		while(accept){
		Socket client = server.accept();
		System.out.println("链接过来的·客户端：" + client.getInetAddress());
		
		String data = "我是服务端，呼叫客户端！";
		PrintStream out = new PrintStream(client.getOutputStream());
		out.println(data);
		
		out.close();
		}
		server.close();
		
	}

}
