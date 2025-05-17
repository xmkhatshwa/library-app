package za.co.experiacollab.springbootlibrary.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.experiacollab.springbootlibrary.entity.History;

public interface HistoryRepository extends JpaRepository<History, Long> {
}
