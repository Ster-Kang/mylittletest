package com.ksw.service;

import com.ksw.dto.forObject.FileUserDTO;
import com.ksw.object.entity.mybatis.FileUser;
import com.ksw.object.vo.FileUserVO;
import org.springframework.stereotype.Service;

@Service
public class FileUserService {

    // Entity -> DTO ��ȯ �޼ҵ�
    public FileUserDTO convertToDTO(FileUser fileUserEntity) {
        return new FileUserDTO.Builder()
                .userNo(fileUserEntity.getUserNo())
                .fileNo(fileUserEntity.getFileNo())
                .build();
    }

    // DTO -> VO ��ȯ �޼ҵ�
    public FileUserVO convertToVO(FileUserDTO fileUserDTO) {
        return new FileUserVO.Builder()
                .userNo(fileUserDTO.getUserNo())
                .fileNo(fileUserDTO.getFileNo())
                .build();
    }
}
