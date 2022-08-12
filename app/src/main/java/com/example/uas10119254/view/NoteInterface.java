package com.example.uas10119254.view;

import android.database.Cursor;

import com.example.uas10119254.model.Note;

public interface NoteInterface {
    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}
