package com.ksw.dto.forObject.relation;

import java.io.Serializable;

import com.ksw.dto.forObject.entity.AlarmDTO;
import com.ksw.dto.forObject.entity.NoteDTO;
import com.ksw.dto.forObject.entity.ReplyDTO;
import com.ksw.dto.forObject.entity.UserDTO;

public class AlarmRelationDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	

    private AlarmDTO alarmDTO;
    private UserDTO receiverDTO;
    private UserDTO makerDTO;
    private NoteDTO noteDTO;
    private ReplyDTO replyDTO;

    public NoteDTO getNoteDTO() {
		return noteDTO;
	}

	public void setNoteDTO(NoteDTO noteDTO) {
		this.noteDTO = noteDTO;
	}

	public ReplyDTO getReplyDTO() {
		return replyDTO;
	}

	public void setReplyDTO(ReplyDTO replyDTO) {
		this.replyDTO = replyDTO;
	}

	// 기본 생성자
    public AlarmRelationDTO() {}

	public AlarmDTO getAlarmDTO() {
		return alarmDTO;
	}

	public void setAlarmDTO(AlarmDTO alarmDTO) {
		this.alarmDTO = alarmDTO;
	}

	public UserDTO getReceiverDTO() {
		return receiverDTO;
	}

	public void setReceiverDTO(UserDTO receiverDTO) {
		this.receiverDTO = receiverDTO;
	}

	public UserDTO getMakerDTO() {
		return makerDTO;
	}

	public void setMakerDTO(UserDTO makerDTO) {
		this.makerDTO = makerDTO;
	}
}
