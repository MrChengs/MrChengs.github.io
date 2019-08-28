package com.lgsim;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by Administrator on 2019/8/28.
 */
public class Server {
    public static void startSocket(int port,DataHanler dataHanler){
        try {
            ServerSocket serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public interface DataHanler{
        String dataHandler();
    }
}
