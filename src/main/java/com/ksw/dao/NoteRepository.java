package com.ksw.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ksw.object.entity.jpa.Note;

public interface NoteRepository extends JpaRepository<Note, Long>{

}
