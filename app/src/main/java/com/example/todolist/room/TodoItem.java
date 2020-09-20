package com.example.todolist.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TODO")
public class TodoItem {
    @PrimaryKey(autoGenerate = true)
    int id;

    @ColumnInfo(name = "title")
    private String title;
    @ColumnInfo(name = "checked")
    private Boolean checked;
    @ColumnInfo(name = "start")
    private String start;
    @ColumnInfo(name = "due")
    private String due;
    @ColumnInfo(name = "memo")
    private String memo;

    public TodoItem(String title, String start, String due, String memo){
        this.title = title;
        this.start = start;
        this.due = due;
        this.memo = memo;
        checked = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
