package com.ksw.service;

import com.ksw.dto.forObject.FileAnnouncementDTO;
import com.ksw.object.entity.mybatis.FileAnnouncement;
import com.ksw.object.vo.FileAnnouncementVO;
import org.springframework.stereotype.Service;

@Service
public class FileAnnouncementService {

    // Entity -> DTO ��ȯ �޼ҵ�
    public FileAnnouncementDTO convertToDTO(FileAnnouncement fileAnnouncementEntity) {
        return new FileAnnouncementDTO.Builder()
                .announcementNo(fileAnnouncementEntity.getAnnouncementNo())
                .fileNo(fileAnnouncementEntity.getFileNo())
                .build();
    }

    // DTO -> VO ��ȯ �޼ҵ�
    public FileAnnouncementVO convertToVO(FileAnnouncementDTO fileAnnouncementDTO) {
        return new FileAnnouncementVO.Builder()
                .announcementNo(fileAnnouncementDTO.getAnnouncementNo())
                .fileNo(fileAnnouncementDTO.getFileNo())
                .build();
    }
}
