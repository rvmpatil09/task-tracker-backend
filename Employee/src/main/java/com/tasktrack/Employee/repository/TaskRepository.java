package com.tasktrack.Employee.repository;

import com.tasktrack.Employee.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
