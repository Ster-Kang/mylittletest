package com.ksw.service.object;

import com.ksw.dto.forObject.FileNoteDTO;
import com.ksw.object.entity.mybatis.FileNote;
import com.ksw.object.vo.FileNoteVO;
import org.springframework.stereotype.Service;

@Service
public class FileNoteService {

    // Entity -> DTO ��ȯ �޼ҵ�
    public FileNoteDTO convertToDTO(FileNote fileNoteEntity) {
        return new FileNoteDTO.Builder()
                .noteNo(fileNoteEntity.getNoteNo())
                .fileNo(fileNoteEntity.getFileNo())
                .build();
    }

    // DTO -> VO ��ȯ �޼ҵ�
    public FileNoteVO convertToVO(FileNoteDTO fileNoteDTO) {
        return new FileNoteVO.Builder()
                .noteNo(fileNoteDTO.getNoteNo())
                .fileNo(fileNoteDTO.getFileNo())
                .build();
    }
}
