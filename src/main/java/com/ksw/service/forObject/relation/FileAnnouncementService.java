package com.ksw.service.forObject.relation;

import com.ksw.dto.forObject.relation.FileAnnouncementDTO;
import com.ksw.object.entity.mybatis.FileAnnouncement;
import com.ksw.object.vo.relation.FileAnnouncementVO;

import org.springframework.stereotype.Service;

@Service
public class FileAnnouncementService {

    // Entity -> DTO 변환 메소드
    public FileAnnouncementDTO convertToDTO(FileAnnouncement fileAnnouncementEntity) {
        return new FileAnnouncementDTO.Builder()
                .announcementNo(fileAnnouncementEntity.getAnnouncementNo())
                .fileNo(fileAnnouncementEntity.getFileNo())
                .build();
    }

    // DTO -> VO 변환 메소드
    public FileAnnouncementVO convertToVO(FileAnnouncementDTO fileAnnouncementDTO) {
        return new FileAnnouncementVO.Builder()
                .announcementNo(fileAnnouncementDTO.getAnnouncementNo())
                .fileNo(fileAnnouncementDTO.getFileNo())
                .build();
    }
}
