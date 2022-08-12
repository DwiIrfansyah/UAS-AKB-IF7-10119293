package com.example.uasakb10119293.view;

import android.database.Cursor;

import com.example.uasakb10119293.model.Note;

public interface NoteInterface {
    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}
