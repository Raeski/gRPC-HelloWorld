package com.helloworld.service;

import com.helloworld.grpc.*;
import io.grpc.stub.StreamObserver;

public class HelloWorldService extends HelloWorldGrpc.HelloWorldImplBase {

    @Override
    public void sayHello (HelloRequest helloRequest, StreamObserver<HelloReply> streamObserver) {
        HelloReply.Builder response = HelloReply.newBuilder();

        String caller = helloRequest.getName();
        HelloWorldMessage helloWorldMessage = new HelloWorldMessage();
        StringBuilder resposta = new StringBuilder();
        resposta.append(caller);
        resposta.append(" : ");
        resposta.append(helloWorldMessage.retornaFrase());
        response.setMessage(resposta.toString());
        streamObserver.onNext(response.build());
        streamObserver.onCompleted();
    }

    @Override
    public void sayMyName (Name name, StreamObserver<MyName> streamObserver) {
        MyName.Builder response = MyName.newBuilder();

        String caller = name.getName();
        MyNameMessage myNameMessage = new MyNameMessage();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(caller);
        stringBuilder.append(" : ");
        stringBuilder.append(myNameMessage.returnName());
        response.setMessage(stringBuilder.toString());
        streamObserver.onNext(response.build());
        streamObserver.onCompleted();
    }

}
