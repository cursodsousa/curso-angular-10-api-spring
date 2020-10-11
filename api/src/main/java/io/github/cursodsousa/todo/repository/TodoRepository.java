package io.github.cursodsousa.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.cursodsousa.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
