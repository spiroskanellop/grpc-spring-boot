package org.example.service;

import com.google.protobuf.Descriptors;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.example.Author;
import org.example.Book;
import org.example.BookAuthorServiceGrpc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@Service
public class BookAuthorClientService {

    @GrpcClient("grpc-example-service") //client will send one request and server will respond with one response.
    BookAuthorServiceGrpc.BookAuthorServiceBlockingStub synchronousClient;

    @GrpcClient("grpc-example-service") //client will send one request and server will send stream of response to the client.
    BookAuthorServiceGrpc.BookAuthorServiceStub asynchronousClient;
    public Map<Descriptors.FieldDescriptor, Object> getAuthor(int authorId){
        Author authorRequest = Author.newBuilder()
                .setAuthorId(authorId)
                .build();
        Author authorResponse = synchronousClient.getAuthor(authorRequest);
        return authorResponse.getAllFields();
    }

    public List<Map<Descriptors.FieldDescriptor, Object>> getBooksByAuthor(int authorId) throws InterruptedException {
        /*
        FieldDescriptor = Describes a field of a message type.
         */
        final CountDownLatch countDownLatch = new CountDownLatch(1);    //CountDownLatch we can cause a thread to block until other threads have completed a given task.
        Author authorRequest = Author.newBuilder().setAuthorId(authorId).build();  // create author object
        final List<Map<Descriptors.FieldDescriptor, Object>> response = new ArrayList<>();

        asynchronousClient.getBooksByAuthor(authorRequest, new StreamObserver<Book>() {
            @Override
            public void onNext(Book book) {
                response.add(book.getAllFields());
            }

            @Override
            public void onError(Throwable throwable) {
                countDownLatch.countDown();
            }

            @Override
            public void onCompleted() {
                countDownLatch.countDown();
            }
        });

        boolean await = countDownLatch.await(1, TimeUnit.MINUTES);
        return await ? response : Collections.emptyList();
    }
}
