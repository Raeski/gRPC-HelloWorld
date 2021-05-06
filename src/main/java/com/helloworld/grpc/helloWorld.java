package com.helloworld.grpc;

import com.helloworld.service.HelloWorldService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class helloWorld {

    public static void main(String[] args) {

        int port = 8080;
        System.out.println("Iniciando servidor GRPC na porta 8080");
        Server server = ServerBuilder.forPort(port).addService(new HelloWorldService()).build();


        try {
            server.start();
            System.out.println("Servidor inicializado");
            server.awaitTermination();
        } catch (IOException | InterruptedException e ) {
            System.out.println("Servidor não consegui inicializar " + e.getMessage());
        }


    }
}
