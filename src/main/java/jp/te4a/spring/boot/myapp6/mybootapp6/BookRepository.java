package jp.te4a.spring.boot.myapp6.mybootapp6;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.springframework.stereotype.Repository;


@Repository
    public class BookRepository {
    private final ConcurrentMap<Integer, BookBean> bookMap = new ConcurrentHashMap<>();
}