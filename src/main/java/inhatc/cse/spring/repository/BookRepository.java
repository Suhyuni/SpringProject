package inhatc.cse.spring.repository;

import inhatc.cse.spring.controller.dto.BookDto;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BookRepository {

    private final SqlSessionTemplate sqlSession;

    public int save(BookDto bookDto) {
        return sqlSession.insert("Book.save", bookDto);
    }

    public List<BookDto> findAll() {
        return sqlSession.selectList("Book.findAll");
    }
}