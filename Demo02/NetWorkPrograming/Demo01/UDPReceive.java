package Second.Demo02.NetWorkPrograming.Demo01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceive {
    public static void main(String[] args) throws IOException {
        // 1. 创建接收端的 Socket 对象 - 需要指定端口号
        DatagramSocket datagramSocket = new DatagramSocket(18888);
        // 2. 创建一个数据包，用于接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
        // 3. 调用接收方法 receive
        datagramSocket.receive(datagramPacket);
        // 4. 解析数据包
        byte[] message = datagramPacket.getData();
        String messageString = new String(message,0,datagramPacket.getLength());
        System.out.println(messageString);
        // 5. 关闭接收
        datagramSocket.close();
    }
}