package com.ksw.object.relation;

import java.io.Serializable;

import com.ksw.object.entity.Alarm;
import com.ksw.object.entity.Note;
import com.ksw.object.entity.Reply;
import com.ksw.object.entity.User;

public class AlarmRelation implements Serializable
{

	private static final long serialVersionUID = 1L;
	
    private Alarm alarm;
    private User receiver;
    private User maker;
    private Note note;
    private Reply reply;

    public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}

	public Reply getReply() {
		return reply;
	}

	public void setReply(Reply reply) {
		this.reply = reply;
	}

	// 기본 생성자
    public AlarmRelation() {}

	public Alarm getAlarm() {
		return alarm;
	}

	public void setAlarm(Alarm alarm) {
		this.alarm = alarm;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public User getMaker() {
		return maker;
	}

	public void setMaker(User maker) {
		this.maker = maker;
	}
}
