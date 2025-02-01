package com.Projects.To_Do_List.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="to_do_list")
public class toDo_Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="task_name")
    private String taskName;

    @Column(name="start_date")
    private String startDate;

    @Column(name="end_date")
    private String endDate;

    @Column(name="progress")
    private String progress;

    // Making constructors
    public toDo_Entity(){

    }

    public toDo_Entity(int id, String taskName, String startDate, String endDate, String progress) {
        this.id = id;
        this.taskName = taskName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.progress = progress;
    }

    // making getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    // generating toString()
    @Override
    public String toString() {
        return "toDo_Entity{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", progress='" + progress + '\'' +
                '}';
    }
}
