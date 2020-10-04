package com.hendisantika.repository;

import com.hendisantika.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : backend
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/10/20
 * Time: 19.41
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
