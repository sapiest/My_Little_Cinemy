package My_Little_Teamy.My_Little_Cinemy.repos;

import My_Little_Teamy.My_Little_Cinemy.domains.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {
}
