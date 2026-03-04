package com.example.demo.service;

import com.example.demo.entity.Todo;
import com.example.demo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository repo;

    public List<Todo> getAll() {
        return repo.findAll();
    }

    public Todo create(Todo todo) {
        // Mặc định task mới tạo sẽ chưa hoàn thành
        todo.setCompleted(false); 
        return repo.save(todo);
    }

    public Todo update(Long id, Todo todo) {
        Todo t = repo.findById(id).orElseThrow(() -> new RuntimeException("Todo not found"));
        t.setTitle(todo.getTitle());
        
        // Cập nhật thêm trường description
        t.setDescription(todo.getDescription());
        
        t.setCompleted(todo.isCompleted());
        return repo.save(t);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}