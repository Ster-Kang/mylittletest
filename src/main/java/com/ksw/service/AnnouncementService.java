package com.ksw.service;

import com.ksw.dto.forObject.AnnouncementDTO;
import com.ksw.object.entity.jpa.Announcement;
import com.ksw.object.vo.AnnouncementVO;
import org.springframework.stereotype.Service;

@Service
public class AnnouncementService {

    // Entity -> DTO ��ȯ �޼ҵ�
    public AnnouncementDTO convertToDTO(Announcement announcement) {
        return new AnnouncementDTO.Builder()
                .announcementNo(announcement.getAnnouncementNo())
                .announcementTitle(announcement.getAnnouncementTitle())
                .announcementContent(announcement.getAnnouncementContent())
                .schedule(announcement.getSchedule())
                .isActive(announcement.getIsActive())
                .createdAt(announcement.getCreatedAt())
                .updatedAt(announcement.getUpdatedAt())
                .build();
    }

    // DTO -> VO ��ȯ �޼ҵ�
    public AnnouncementVO convertToVO(AnnouncementDTO announcementDTO) {
        return new AnnouncementVO.Builder()
                .announcementNo(announcementDTO.getAnnouncementNo())
                .announcementTitle(announcementDTO.getAnnouncementTitle())
                .announcementContent(announcementDTO.getAnnouncementContent())
                .schedule(announcementDTO.getSchedule())
                .isActive(announcementDTO.getIsActive())
                .createdAt(announcementDTO.getCreatedAt())
                .updatedAt(announcementDTO.getUpdatedAt())
                .build();
    }
}
