package com.notetaker.data.dao;

import com.google.inject.ImplementedBy;

import com.notetaker.data.Note;
import com.notetaker.data.dao.impl.sqlite.SQLiteDAOInterface;

import java.util.List;

@ImplementedBy(SQLiteDAOInterface.class)
public interface DAOInterface {

    List<Note> fetchAll();

    void insert(Note note);

    void update(Note note);

    void delete(Note note);
}