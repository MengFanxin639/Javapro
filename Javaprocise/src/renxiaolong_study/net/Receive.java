package renxiaolong_study.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 接收端
 * @version 1.0
 * @author 小新新
 * @2018年11月29日 下午7:26:45
 */
public class Receive {

	public static void main(String[] args) throws Exception {
		//创建接受端对象
		DatagramSocket receiver = new DatagramSocket(10086);
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, 1024);
		//接收数据
		receiver.receive(dp );
		//获取接受的数据
		String msg = new String(dp.getData(), 0,dp.getLength());
		System.out.println("发送过来的数据:" + msg);
		System.out.println(InetAddress.getLocalHost());
	}

}
