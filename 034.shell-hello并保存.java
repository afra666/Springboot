//springboot web-ubuntu
package p;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class A2Application {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(A2Application.class, args);

        Process p = Runtime.getRuntime().exec(new String[]{
                "bash", "-c",
                "echo Hello World > ./output"
        });
    }

}
//========================================================================
Process process=Runtime.getRuntime().exec(new String[]{
                "sh","-c",
                "echo abcde > ./bb.txt"
        });

