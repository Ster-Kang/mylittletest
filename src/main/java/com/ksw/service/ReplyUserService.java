package com.ksw.service;

import com.ksw.dto.forObject.ReplyUserDTO;
import com.ksw.object.entity.mybatis.ReplyUser;
import com.ksw.object.vo.ReplyUserVO;
import org.springframework.stereotype.Service;

@Service
public class ReplyUserService {

    // Entity -> DTO ��ȯ �޼ҵ�
    public ReplyUserDTO convertToDTO(ReplyUser replyUserEntity) {
        return new ReplyUserDTO.Builder()
                .userNo(replyUserEntity.getUserNo())
                .replyNo(replyUserEntity.getReplyNo())
                .build();
    }

    // DTO -> VO ��ȯ �޼ҵ�
    public ReplyUserVO convertToVO(ReplyUserDTO replyUserDTO) {
        return new ReplyUserVO.Builder()
                .userNo(replyUserDTO.getUserNo())
                .replyNo(replyUserDTO.getReplyNo())
                .build();
    }
}
