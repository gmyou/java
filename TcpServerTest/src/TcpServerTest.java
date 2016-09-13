// TcpServerTest.java

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class TcpServerTest {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
         
        try {
            // 서버소켓을 생성하고 5000번 포트와 결합(bind) 시킨다.
            serverSocket = new ServerSocket(5000);
            System.out.println(getTime() + " 서버가 준비되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        } // try - catch
         
        while (true) {
            try {
                System.out.println(getTime() + " 연결요청을 기다립니다.");
                // 서버소켓은 클라이언트의 연결요청이 올 때까지 실행을 멈추고 계속 기다린다.
                // 클라이언트의 연결요청이 오면 클라이언트 소켓과 통신할 새로운 소켓을 생성한다.
                Socket socket = serverSocket.accept();
                System.out.println(getTime() + socket.getInetAddress() + " 로부터 연결요청이 들어왔습니다.");
                 
                // 소켓의 출력스트림을 얻는다.
                OutputStream out = socket.getOutputStream(); 
                DataOutputStream dos = new DataOutputStream(out); // 기본형 단위로 처리하는 보조스트림
                 
                // 원격 소켓(remote socket)에 데이터를 보낸다.
                dos.writeUTF("서버로부터의 메세지입니다.");
                System.out.println(getTime() + " 데이터를 전송했습니다.");
                 
                // 스트림과 소켓을 달아준다.
                dos.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            } // try - catch
        } // while
    } // main
     
    static String getTime() {
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date());
    } // getTime
} // TcpServerTest
 
/*
 * 
 * 결과
 * [03:33:41] 서버가 준비되었습니다.
 * [03:33:41] 연결요청을 기다립니다.
 * [03:33:43]/127.0.0.1 로부터 연결요청이 들어왔습니다.
 * [03:33:43] 데이터를 전송했습니다.
 * [03:33:43] 연결요청을 기다립니다.
 * 
 */