//Springboot web
package p;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class A2Application {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(A2Application.class, args);

        Process proc = Runtime.getRuntime().exec("ping www.chinaz.com");

        InputStream in = proc.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(in, "GBK"));
        String line = null;

        while((line=br.readLine())!=null){
            System.out.println(line);
        }
    }

}

/***
 正在 Ping www.chinaz.com.cdn20.com [103.254.189.85] 具有 32 字节的数据:
 来自 103.254.189.85 的回复: 字节=32 时间=156ms TTL=45
 来自 103.254.189.85 的回复: 字节=32 时间=154ms TTL=45
 来自 103.254.189.85 的回复: 字节=32 时间=162ms TTL=45
 来自 103.254.189.85 的回复: 字节=32 时间=163ms TTL=45

 103.254.189.85 的 Ping 统计信息:
 数据包: 已发送 = 4，已接收 = 4，丢失 = 0 (0% 丢失)，
 往返行程的估计时间(以毫秒为单位):
 最短 = 154ms，最长 = 163ms，平均 = 158ms
 */
