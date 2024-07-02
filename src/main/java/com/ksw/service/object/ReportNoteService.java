package com.ksw.service.object;

import com.ksw.dto.forObject.ReportNoteDTO;
import com.ksw.object.entity.mybatis.ReportNote;
import com.ksw.object.vo.ReportNoteVO;
import org.springframework.stereotype.Service;

@Service
public class ReportNoteService {

    // Entity -> DTO ��ȯ �޼ҵ�
    public ReportNoteDTO convertToDTO(ReportNote reportNoteEntity) {
        return new ReportNoteDTO.Builder()
                .userNo(reportNoteEntity.getUserNo())
                .noteNo(reportNoteEntity.getNoteNo())
                .reportNo(reportNoteEntity.getReportNo())
                .build();
    }

    // DTO -> VO ��ȯ �޼ҵ�
    public ReportNoteVO convertToVO(ReportNoteDTO reportNoteDTO) {
        return new ReportNoteVO.Builder()
                .userNo(reportNoteDTO.getUserNo())
                .noteNo(reportNoteDTO.getNoteNo())
                .reportNo(reportNoteDTO.getReportNo())
                .build();
    }
}
