package za.co.experiacollab.springbootlibrary.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.experiacollab.springbootlibrary.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
