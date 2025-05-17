package za.co.experiacollab.springbootlibrary.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.experiacollab.springbootlibrary.entity.Checkout;

public interface CheckoutRepository extends JpaRepository<Checkout, Long> {
}
