package com.corey.process;

import com.corey.service.IService;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            //在RMI服务注册表中查找名称为RHello的对象，并调用其上的方法
            IService service = (IService) Naming.lookup("rmi://localhost:8888/service02");
            System.out.println(service.service("test"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}