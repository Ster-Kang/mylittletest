package com.ksw.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ksw.object.entity.jpa.NoteView;

public interface NoteViewRepository extends JpaRepository<NoteView, Long>{

}
