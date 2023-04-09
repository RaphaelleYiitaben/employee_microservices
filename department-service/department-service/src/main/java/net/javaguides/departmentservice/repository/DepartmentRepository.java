package net.javaguides.departmentservice.repository;

import net.javaguides.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

//pass the entity and the type of its primary key
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findDepartmentByCode(String code);
}
