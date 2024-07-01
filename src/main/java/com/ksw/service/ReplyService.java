package com.ksw.service;

import com.ksw.dto.forObject.ReplyDTO;
import com.ksw.object.entity.jpa.Reply;
import com.ksw.object.vo.ReplyVO;
import org.springframework.stereotype.Service;

@Service
public class ReplyService {

    // Entity -> DTO ��ȯ �޼ҵ�
    public ReplyDTO convertToDTO(Reply replyEntity) {
        return new ReplyDTO.Builder()
                .replyNo(replyEntity.getReplyNo())
                .replyContent(replyEntity.getReplyContent())
                .parentReply(replyEntity.getParentReply())
                .isActive(replyEntity.getIsActive())
                .createdAt(replyEntity.getCreatedAt())
                .updatedAt(replyEntity.getUpdatedAt())
                .build();
    }

    // DTO -> VO ��ȯ �޼ҵ�
    public ReplyVO convertToVO(ReplyDTO replyDTO) {
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
