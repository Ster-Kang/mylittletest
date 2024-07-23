package com.ksw.service.forObject.entity;

import com.ksw.dao.forObject.entity.ReplyRepository;
import com.ksw.dto.forObject.entity.ReplyDTO;
import com.ksw.object.entity.Reply;
import com.ksw.vo.forObject.entity.ReplyVO;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReplyService {
	
	@Autowired
	private ReplyRepository replyRepository;
	
	@Transactional
	public Reply writeReply(String replyContent) {
		Reply reply = new Reply();
		reply.setReplyContent(replyContent);
		if (replyContent != null) {
			reply = replyRepository.save(reply);
			System.out.println("reply 삽입 후 no 반환 : "+reply.getReplyNo());
			return reply;
		}
		System.out.println("Insert Reply failed. Empty ReplyDTO returned");
		return reply;
	}
	
	// List<ReplyDTO> -> List<ReplyVO> 변환 메소드
	public List<ReplyVO> convertToVOList(List<ReplyDTO> replyDTOList) {
		
		if(replyDTOList == null) {
			System.out.println("List<ReplyDTO> to List<ReplyVO> failed. Singleton List<ReplyVO> returned");
			return Collections.singletonList(new ReplyVO.Builder().build());
		}
		return replyDTOList.stream()
				.map(this::convertToVO)
				.collect(Collectors.toList());
	}
	
    // Entity -> DTO 변환 메소드
    public ReplyDTO convertToDTO(Reply replyEntity) {
    	ReplyDTO dto = new ReplyDTO();
    	if (replyEntity == null) {
    		System.out.println("Reply to ReplyDTO failed. Empty ReplyDTO created. Reply is null");
    		return dto;
    	}
    	dto.setCreatedAt(replyEntity.getCreatedAt());
    	dto.setIsActive(replyEntity.getIsActive());
    	dto.setParentReply(replyEntity.getParentReply());
    	dto.setReplyContent(replyEntity.getReplyContent());
    	dto.setReplyNo(replyEntity.getReplyNo());
    	dto.setUpdatedAt(replyEntity.getUpdatedAt());
        return dto;
    }
    
    public Reply convertToEntity(ReplyDTO replyDTO) {
    	Reply replyEntity = new Reply();
    	if(replyDTO == null) {
    		System.out.println("ReplyDTO to Reply failed. Empty Reply created. ReplyDTO is null");
    		return replyEntity;
    	}
        replyEntity.setReplyNo(replyDTO.getReplyNo());
        replyEntity.setReplyContent(replyDTO.getReplyContent());
        replyEntity.setParentReply(replyDTO.getParentReply());
        replyEntity.setIsActive(replyDTO.getIsActive());
        replyEntity.setCreatedAt(replyDTO.getCreatedAt());
        replyEntity.setUpdatedAt(replyDTO.getUpdatedAt());
        return replyEntity;
    }

    // DTO -> VO 변환 메소드
    public ReplyVO convertToVO(ReplyDTO replyDTO) {
    	if(replyDTO == null) {
    		System.out.println("ReplyDTO to ReplyVO failed. Empty ReplyVO created. ReplyDTO is null");
    		return new ReplyVO.Builder().build();
    	}
        return new ReplyVO.Builder()
                .replyNo(replyDTO.getReplyNo())
                .replyContent(replyDTO.getReplyContent())
                .parentReply(replyDTO.getParentReply())
                .isActive(replyDTO.getIsActive())
                .createdAt(replyDTO.getCreatedAt())
                .updatedAt(replyDTO.getUpdatedAt())
                .build();
    }
}
