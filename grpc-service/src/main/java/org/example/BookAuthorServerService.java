package org.example;

import com.google.protobuf.Descriptors;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.example.Author;
import org.example.Book;
import org.example.BookAuthorServiceGrpc;

import javax.management.Descriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;

@GrpcService
public class BookAuthorServerService extends BookAuthorServiceGrpc.BookAuthorServiceImplBase{
    @Override
    public void getAuthor(Author request, StreamObserver<Author> responseObserver) {
        TempDb.getAuthorsFromTempDb().stream()
                .filter(author -> author.getAuthorId() == request.getAuthorId())
                .findFirst()
                .ifPresent(responseObserver::onNext);
        responseObserver.onCompleted();
    }

    @Override
    public void getBooksByAuthor(Author request, StreamObserver<Book> responseObserver) {
    /*       StreamObserver =  Receives notifications from an observable stream of messages.
    It is used by both the client stubs and service implementations for sending or receiving stream messages
     */
        TempDb.getBooksFromTempDb().stream()
                .filter(book -> book.getAuthorId() == request.getAuthorId())
                .forEach(responseObserver::onNext);
        responseObserver.onCompleted();
    }
//
//    @Override
//    public StreamObserver<Book> getExpensiveBook(StreamObserver<Book> responseObserver) {
//        return super.getExpensiveBook(responseObserver);
//    }
//
//    @Override
//    public StreamObserver<Book> getBooksByGender(StreamObserver<Book> responseObserver) {
//        return super.getBooksByGender(responseObserver);
//    }
}
