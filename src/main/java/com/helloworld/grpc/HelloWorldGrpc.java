package com.helloworld.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.30.0)",
    comments = "Source: helloworld.proto")
public final class HelloWorldGrpc {

  private HelloWorldGrpc() {}

  public static final String SERVICE_NAME = "HelloWorld";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.helloworld.grpc.HelloRequest,
      com.helloworld.grpc.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.helloworld.grpc.HelloRequest.class,
      responseType = com.helloworld.grpc.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.helloworld.grpc.HelloRequest,
      com.helloworld.grpc.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.helloworld.grpc.HelloRequest, com.helloworld.grpc.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = HelloWorldGrpc.getSayHelloMethod) == null) {
      synchronized (HelloWorldGrpc.class) {
        if ((getSayHelloMethod = HelloWorldGrpc.getSayHelloMethod) == null) {
          HelloWorldGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.helloworld.grpc.HelloRequest, com.helloworld.grpc.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.helloworld.grpc.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.helloworld.grpc.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new HelloWorldMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.helloworld.grpc.Name,
      com.helloworld.grpc.MyName> getSayMyNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayMyName",
      requestType = com.helloworld.grpc.Name.class,
      responseType = com.helloworld.grpc.MyName.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.helloworld.grpc.Name,
      com.helloworld.grpc.MyName> getSayMyNameMethod() {
    io.grpc.MethodDescriptor<com.helloworld.grpc.Name, com.helloworld.grpc.MyName> getSayMyNameMethod;
    if ((getSayMyNameMethod = HelloWorldGrpc.getSayMyNameMethod) == null) {
      synchronized (HelloWorldGrpc.class) {
        if ((getSayMyNameMethod = HelloWorldGrpc.getSayMyNameMethod) == null) {
          HelloWorldGrpc.getSayMyNameMethod = getSayMyNameMethod =
              io.grpc.MethodDescriptor.<com.helloworld.grpc.Name, com.helloworld.grpc.MyName>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayMyName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.helloworld.grpc.Name.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.helloworld.grpc.MyName.getDefaultInstance()))
              .setSchemaDescriptor(new HelloWorldMethodDescriptorSupplier("SayMyName"))
              .build();
        }
      }
    }
    return getSayMyNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloWorldStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloWorldStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloWorldStub>() {
        @java.lang.Override
        public HelloWorldStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloWorldStub(channel, callOptions);
        }
      };
    return HelloWorldStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloWorldBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloWorldBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloWorldBlockingStub>() {
        @java.lang.Override
        public HelloWorldBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloWorldBlockingStub(channel, callOptions);
        }
      };
    return HelloWorldBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloWorldFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloWorldFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloWorldFutureStub>() {
        @java.lang.Override
        public HelloWorldFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloWorldFutureStub(channel, callOptions);
        }
      };
    return HelloWorldFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HelloWorldImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.helloworld.grpc.HelloRequest request,
        io.grpc.stub.StreamObserver<com.helloworld.grpc.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public void sayMyName(com.helloworld.grpc.Name request,
        io.grpc.stub.StreamObserver<com.helloworld.grpc.MyName> responseObserver) {
      asyncUnimplementedUnaryCall(getSayMyNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.helloworld.grpc.HelloRequest,
                com.helloworld.grpc.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getSayMyNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.helloworld.grpc.Name,
                com.helloworld.grpc.MyName>(
                  this, METHODID_SAY_MY_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class HelloWorldStub extends io.grpc.stub.AbstractAsyncStub<HelloWorldStub> {
    private HelloWorldStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloWorldStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.helloworld.grpc.HelloRequest request,
        io.grpc.stub.StreamObserver<com.helloworld.grpc.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayMyName(com.helloworld.grpc.Name request,
        io.grpc.stub.StreamObserver<com.helloworld.grpc.MyName> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayMyNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HelloWorldBlockingStub extends io.grpc.stub.AbstractBlockingStub<HelloWorldBlockingStub> {
    private HelloWorldBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloWorldBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.helloworld.grpc.HelloReply sayHello(com.helloworld.grpc.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.helloworld.grpc.MyName sayMyName(com.helloworld.grpc.Name request) {
      return blockingUnaryCall(
          getChannel(), getSayMyNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloWorldFutureStub extends io.grpc.stub.AbstractFutureStub<HelloWorldFutureStub> {
    private HelloWorldFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloWorldFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.helloworld.grpc.HelloReply> sayHello(
        com.helloworld.grpc.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.helloworld.grpc.MyName> sayMyName(
        com.helloworld.grpc.Name request) {
      return futureUnaryCall(
          getChannel().newCall(getSayMyNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_MY_NAME = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloWorldImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloWorldImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.helloworld.grpc.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.helloworld.grpc.HelloReply>) responseObserver);
          break;
        case METHODID_SAY_MY_NAME:
          serviceImpl.sayMyName((com.helloworld.grpc.Name) request,
              (io.grpc.stub.StreamObserver<com.helloworld.grpc.MyName>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloWorldBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloWorldBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.helloworld.grpc.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloWorld");
    }
  }

  private static final class HelloWorldFileDescriptorSupplier
      extends HelloWorldBaseDescriptorSupplier {
    HelloWorldFileDescriptorSupplier() {}
  }

  private static final class HelloWorldMethodDescriptorSupplier
      extends HelloWorldBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloWorldMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloWorldGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloWorldFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getSayMyNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
