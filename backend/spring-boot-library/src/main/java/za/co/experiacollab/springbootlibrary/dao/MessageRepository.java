package za.co.experiacollab.springbootlibrary.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.experiacollab.springbootlibrary.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
