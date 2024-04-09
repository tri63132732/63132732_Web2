package org.o7planning.thymeleaf.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.o7planning.thymeleaf.Models.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>  {
}
