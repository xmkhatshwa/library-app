package za.co.experiacollab.spring_boot_library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.experiacollab.spring_boot_library.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
