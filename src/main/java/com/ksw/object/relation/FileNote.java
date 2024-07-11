package com.ksw.object.relation;

import com.ksw.object.entity.File;
import com.ksw.object.entity.Note;

public class FileNote {

    private Note note;
    private File file;

    // 기본 생성자
    public FileNote() {}

	public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
}
