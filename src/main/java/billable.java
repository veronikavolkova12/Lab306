package com.example.lab306.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class BillableTask extends Task{

    private double hourlyRate;

    public BillableTask() {
    }

    public BillableTask(String title, LocalDate dueDate, boolean status, double hourlyRate) {
        super(title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
