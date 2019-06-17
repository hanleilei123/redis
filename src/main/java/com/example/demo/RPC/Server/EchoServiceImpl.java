package com.example.demo.RPC.Server;

/**
 * Created by Administrator on 2019/6/17.
 */
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String ping) {
        // TODO Auto-generated method stub
        return ping != null ? ping + "--> I am ok." : "I am bad.";
    }
}
