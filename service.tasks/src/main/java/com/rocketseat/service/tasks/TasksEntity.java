package com.rocketseat.service.tasks;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity(name = "Task")
@Table(name = "task")
@AllArgsConstructor
@NoArgsConstructor
public class TasksEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String email;

    private LocalDateTime dueDate;

    private boolean notified;

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public void setNotified(boolean notified) {
        this.notified = notified;
    }

    public TasksEntity(TaskRequest taskRequest) {
        this.title = taskRequest.title();
        this.email = taskRequest.email();
        this.dueDate = taskRequest.dueDate();
        this.notified = taskRequest.notified();
    }
}
