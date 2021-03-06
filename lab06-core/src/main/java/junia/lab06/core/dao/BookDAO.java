package junia.lab06.core.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import junia.lab06.core.entity.Book;

//TODO complete this class
public interface BookDAO  {


    @Query("SELECT DISTINCT b FROM Book b LEFT JOIN FETCH b.authors LEFT JOIN FETCH b.tags LEFT JOIN FETCH b.reviews WHERE b.id=:id")
    Book getOneWithAuthorsAndTagsAndReviews(@Param("id") long bookId);
}
