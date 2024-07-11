package com.ksw.service.forObject.relation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksw.dto.forObject.relation.FileUserDTO;
import com.ksw.object.relation.FileUser;
import com.ksw.service.forObject.entity.FileService;
import com.ksw.service.forObject.entity.UserService;
import com.ksw.vo.forObject.relation.FileUserVO;

@Service
public class FileUserService {

	@Autowired
	private FileService fileService;
	@Autowired
	private UserService userService;
	
    // Entity -> DTO 변환 메소드
    public FileUserDTO convertToDTO(FileUser fileUserEntity) {
    	FileUserDTO dto = new FileUserDTO();
    	dto.setFileDTO(fileService.convertToDTO(fileUserEntity.getFile()));
    	dto.setUserDTO(userService.convertToDTO(fileUserEntity.getUser()));
        return dto;
    }

    // DTO -> VO 변환 메소드
    public FileUserVO convertToVO(FileUserDTO fileUserDTO) {
        return new FileUserVO.Builder()
                .userVO(userService.convertToVO(fileUserDTO.getUserDTO()))
                .fileVO(fileService.convertToVO(fileUserDTO.getFileDTO()))
                .build();
    }
}
