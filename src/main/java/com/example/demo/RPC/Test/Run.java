package com.example.demo.RPC.Test;

import com.example.demo.RPC.Client.RpcImporter;
import com.example.demo.RPC.Server.EchoService;
import com.example.demo.RPC.Server.EchoServiceImpl;
import com.example.demo.RPC.Server.RpcExporter;

import java.net.InetSocketAddress;


public class Run {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //创建异步发布服务端的线程并启动，用于接受PRC客户端的请求，根据请求参数调用服务实现类，返回结果给客户端
        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                try{
                    RpcExporter.exporter("localhost", 8088);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
        //创建客户端服务代理类，构造RPC求情参数，发起RPC调用

        RpcImporter<EchoService> importer=new RpcImporter<EchoService>();
        EchoService echo = importer.importer(EchoServiceImpl.class, new InetSocketAddress("localhost",8088));
        for(int i=10;i>0;i--) {
            System.out.println(echo.echo("Are u ok?"));
        }
    }

}