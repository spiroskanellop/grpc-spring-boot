package org.example;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: schema.proto")
public final class BookAuthorServiceGrpc {

  private BookAuthorServiceGrpc() {}

  public static final String SERVICE_NAME = "org.example.BookAuthorService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.example.Author,
      org.example.Author> METHOD_GET_AUTHOR =
      io.grpc.MethodDescriptor.<org.example.Author, org.example.Author>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.BookAuthorService", "getAuthor"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.example.Author.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.example.Author.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.example.Author,
      org.example.Book> METHOD_GET_BOOKS_BY_AUTHOR =
      io.grpc.MethodDescriptor.<org.example.Author, org.example.Book>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "org.example.BookAuthorService", "getBooksByAuthor"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.example.Author.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.example.Book.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.example.Book,
      org.example.Book> METHOD_GET_EXPENSIVE_BOOK =
      io.grpc.MethodDescriptor.<org.example.Book, org.example.Book>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "org.example.BookAuthorService", "getExpensiveBook"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.example.Book.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.example.Book.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.example.Book,
      org.example.Book> METHOD_GET_BOOKS_BY_GENDER =
      io.grpc.MethodDescriptor.<org.example.Book, org.example.Book>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "org.example.BookAuthorService", "getBooksByGender"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.example.Book.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.example.Book.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookAuthorServiceStub newStub(io.grpc.Channel channel) {
    return new BookAuthorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookAuthorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookAuthorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookAuthorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookAuthorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BookAuthorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary - synchronous
     *client will send one request and server will respond with one response.
     * </pre>
     */
    public void getAuthor(org.example.Author request,
        io.grpc.stub.StreamObserver<org.example.Author> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_AUTHOR, responseObserver);
    }

    /**
     * <pre>
     *sever streaming - Asynchronous
     *client will send one request and server will send stream of response to the client.
     * </pre>
     */
    public void getBooksByAuthor(org.example.Author request,
        io.grpc.stub.StreamObserver<org.example.Book> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BOOKS_BY_AUTHOR, responseObserver);
    }

    /**
     * <pre>
     *client streaming - Asynchronous
     *client will stream of request and server will respond with one response.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.Book> getExpensiveBook(
        io.grpc.stub.StreamObserver<org.example.Book> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_GET_EXPENSIVE_BOOK, responseObserver);
    }

    /**
     * <pre>
     *bi-directional streaming - Asynchronous
     *client will send stream of request and server will respond with stream of response.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.Book> getBooksByGender(
        io.grpc.stub.StreamObserver<org.example.Book> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_GET_BOOKS_BY_GENDER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_AUTHOR,
            asyncUnaryCall(
              new MethodHandlers<
                org.example.Author,
                org.example.Author>(
                  this, METHODID_GET_AUTHOR)))
          .addMethod(
            METHOD_GET_BOOKS_BY_AUTHOR,
            asyncServerStreamingCall(
              new MethodHandlers<
                org.example.Author,
                org.example.Book>(
                  this, METHODID_GET_BOOKS_BY_AUTHOR)))
          .addMethod(
            METHOD_GET_EXPENSIVE_BOOK,
            asyncClientStreamingCall(
              new MethodHandlers<
                org.example.Book,
                org.example.Book>(
                  this, METHODID_GET_EXPENSIVE_BOOK)))
          .addMethod(
            METHOD_GET_BOOKS_BY_GENDER,
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.example.Book,
                org.example.Book>(
                  this, METHODID_GET_BOOKS_BY_GENDER)))
          .build();
    }
  }

  /**
   */
  public static final class BookAuthorServiceStub extends io.grpc.stub.AbstractStub<BookAuthorServiceStub> {
    private BookAuthorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookAuthorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookAuthorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookAuthorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary - synchronous
     *client will send one request and server will respond with one response.
     * </pre>
     */
    public void getAuthor(org.example.Author request,
        io.grpc.stub.StreamObserver<org.example.Author> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_AUTHOR, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *sever streaming - Asynchronous
     *client will send one request and server will send stream of response to the client.
     * </pre>
     */
    public void getBooksByAuthor(org.example.Author request,
        io.grpc.stub.StreamObserver<org.example.Book> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_BOOKS_BY_AUTHOR, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming - Asynchronous
     *client will stream of request and server will respond with one response.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.Book> getExpensiveBook(
        io.grpc.stub.StreamObserver<org.example.Book> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_GET_EXPENSIVE_BOOK, getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *bi-directional streaming - Asynchronous
     *client will send stream of request and server will respond with stream of response.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.Book> getBooksByGender(
        io.grpc.stub.StreamObserver<org.example.Book> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_GET_BOOKS_BY_GENDER, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BookAuthorServiceBlockingStub extends io.grpc.stub.AbstractStub<BookAuthorServiceBlockingStub> {
    private BookAuthorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookAuthorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookAuthorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookAuthorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary - synchronous
     *client will send one request and server will respond with one response.
     * </pre>
     */
    public org.example.Author getAuthor(org.example.Author request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_AUTHOR, getCallOptions(), request);
    }

    /**
     * <pre>
     *sever streaming - Asynchronous
     *client will send one request and server will send stream of response to the client.
     * </pre>
     */
    public java.util.Iterator<org.example.Book> getBooksByAuthor(
        org.example.Author request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_BOOKS_BY_AUTHOR, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookAuthorServiceFutureStub extends io.grpc.stub.AbstractStub<BookAuthorServiceFutureStub> {
    private BookAuthorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookAuthorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookAuthorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookAuthorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary - synchronous
     *client will send one request and server will respond with one response.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Author> getAuthor(
        org.example.Author request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_AUTHOR, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AUTHOR = 0;
  private static final int METHODID_GET_BOOKS_BY_AUTHOR = 1;
  private static final int METHODID_GET_EXPENSIVE_BOOK = 2;
  private static final int METHODID_GET_BOOKS_BY_GENDER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookAuthorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookAuthorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AUTHOR:
          serviceImpl.getAuthor((org.example.Author) request,
              (io.grpc.stub.StreamObserver<org.example.Author>) responseObserver);
          break;
        case METHODID_GET_BOOKS_BY_AUTHOR:
          serviceImpl.getBooksByAuthor((org.example.Author) request,
              (io.grpc.stub.StreamObserver<org.example.Book>) responseObserver);
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
        case METHODID_GET_EXPENSIVE_BOOK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getExpensiveBook(
              (io.grpc.stub.StreamObserver<org.example.Book>) responseObserver);
        case METHODID_GET_BOOKS_BY_GENDER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getBooksByGender(
              (io.grpc.stub.StreamObserver<org.example.Book>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class BookAuthorServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.Schema.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BookAuthorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookAuthorServiceDescriptorSupplier())
              .addMethod(METHOD_GET_AUTHOR)
              .addMethod(METHOD_GET_BOOKS_BY_AUTHOR)
              .addMethod(METHOD_GET_EXPENSIVE_BOOK)
              .addMethod(METHOD_GET_BOOKS_BY_GENDER)
              .build();
        }
      }
    }
    return result;
  }
}
