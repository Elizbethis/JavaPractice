package Second.Demo02.NetWorkPrograming.Demo01;

import java.io.IOException;
import java.net.*;

public class Send {
    public static void main(String[] args) throws IOException {
        //建立socket发送端对象
        DatagramSocket datagramSocket = new DatagramSocket();
        //将要发送的数据打包成数据包
        String string = "Hello ,Java";
        byte[] bytes = string.getBytes();
        int length = bytes.length;
        //123.166.196.131
        InetAddress inetAddress = InetAddress.getByName("localhost");
        DatagramPacket datagramPacket = new DatagramPacket(bytes, length, inetAddress, 18888);
        //将数据报发送
        datagramSocket.send(datagramPacket);
        //关闭
        datagramSocket.close();
    }
}
