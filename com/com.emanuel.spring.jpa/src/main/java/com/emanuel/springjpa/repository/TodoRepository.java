package com.emanuel.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.emanuel.springjpa.Todo;
import org.springframework.scheduling.annotation.Async;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public interface TodoRepository extends JpaRepository<Todo, Long> {

//    Query Todos by summary
    List<Todo> getBySummary(String summary);

//    Query just one optional Todo by summary and due date
    Optional<Todo> findBySummaryAndDueDate(String summary, Date date);

//    Query a stream of Todos by summary or description
    Stream<Todo> readBySummaryOrDescription(String summary, String description);

//    Count the amount of Todos with certain summary
    long countBySummary(String summary);

//      Write a custom query for all todos in the year 2016
    @Query("Select t from Todo t where t.dueDate BETWEEN '2016-01-01' AND '2016-12-31'")
    List<Todo> getTodosOf2016();


//    Get available Todos by summary asynchronously
    @Async
    CompletableFuture<List<Todo>> findAsyncJava8BySummary(String summary);

    @Async
    Future<List<Todo>> findAsyncBeforeJava8BySummary(String summary);

}
