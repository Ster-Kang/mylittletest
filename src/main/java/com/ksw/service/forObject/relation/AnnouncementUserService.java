package com.ksw.service.forObject.relation;

import com.ksw.dto.forObject.relation.AnnouncementUserDTO;
import com.ksw.object.entity.mybatis.AnnouncementUser;
import com.ksw.object.vo.relation.AnnouncementUserVO;

import org.springframework.stereotype.Service;

@Service
public class AnnouncementUserService {

    // Entity -> DTO ��ȯ �޼ҵ�
    public AnnouncementUserDTO convertToDTO(AnnouncementUser announcementUserEntity) {
        return new AnnouncementUserDTO.Builder()
                .announcementNo(announcementUserEntity.getAnnouncementNo())
                .userNo(announcementUserEntity.getUserNo())
                .build();
    }

    // DTO -> VO ��ȯ �޼ҵ�
    public AnnouncementUserVO convertToVO(AnnouncementUserDTO announcementUserDTO) {
        return new AnnouncementUserVO.Builder()
                .announcementNo(announcementUserDTO.getAnnouncementNo())
                .userNo(announcementUserDTO.getUserNo())
                .build();
    }
}
