package com.example.lab306.models;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class InternalTask extends Task{

    public InternalTask(String title, LocalDate dueDate, boolean status) {
        super(title, dueDate, status);
    }

    public InternalTask() {
    }
}
