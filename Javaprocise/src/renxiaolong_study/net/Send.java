package renxiaolong_study.net;

import java.io.*;
import java.net.*;
import java.util.Scanner;


/**
 * 发送端
 * @version 1.0
 * @author 小新新
 * @2018年11月29日 下午7:04:48
 */
public class Send {

	public static void main(String[] args) throws Exception {
		//创建发送端对象
		DatagramSocket sender = new DatagramSocket(10006);
		String data = "苍茫的天涯是我的爱！我是你新哥";
		InetAddress ip = InetAddress.getByName("10.133.4.170");
		
		DatagramPacket dp = new DatagramPacket(data.getBytes(), data.getBytes().length,
				ip,
				10086);
		//发送数据  
		sender.send(dp);
		sender.close();
		
	}

}
