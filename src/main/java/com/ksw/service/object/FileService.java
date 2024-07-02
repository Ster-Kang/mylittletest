package com.ksw.service.object;

import com.ksw.dto.forObject.FileDTO;
import com.ksw.object.entity.jpa.File;
import com.ksw.object.vo.FileVO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;

@Service
public class FileService {

    private Path fileStorageLocation;

    @Value("${file.upload-dir.linux:/var/www/uploads}")
    private String linuxUploadDir;

    @Value("${file.upload-dir.windows:C:/var/www/uploads}")
    private String windowsUploadDir;

    @PostConstruct
    public void init() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            this.fileStorageLocation = Paths.get(windowsUploadDir).toAbsolutePath().normalize();
        } else {
            this.fileStorageLocation = Paths.get(linuxUploadDir).toAbsolutePath().normalize();
        }
        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (Exception ex) {
            throw new RuntimeException("Could not create the directory where the uploaded files will be stored.", ex);
        }
    }
	
	public FileDTO uploadFile(MultipartFile file) throws IOException {
	    if (file == null || file.isEmpty()) {
	        throw new IllegalArgumentException("File must not be null or empty");
	    }

	    String originalFileName = file.getOriginalFilename();
	    String extension = getFileExtension(originalFileName);
	    String savedFileName = UUID.randomUUID().toString() + extension;
	    
        Path filePath = fileStorageLocation.resolve(savedFileName);
        Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

	    FileDTO fileDTO = new FileDTO();
	    fileDTO.setSavedName(savedFileName);
	    fileDTO.setUploadName(originalFileName);
	    fileDTO.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));

	    return fileDTO;
	}


    private String getFileExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf("."));
    }
	
    // Entity -> DTO ��ȯ �޼ҵ�
    public FileDTO convertToDTO(File file) {
        return new FileDTO.Builder()
                .fileNo(file.getFileNo())
                .savedName(file.getSavedName())
                .uploadName(file.getUploadName())
                .createdAt(file.getCreatedAt())
                .build();
    }
    
    // DTO -> Entity ��ȯ �޼ҵ�
    public File convertToEntity(FileDTO fileDTO) {
        File file = new File();
        file.setFileNo(fileDTO.getFileNo());
        file.setSavedName(fileDTO.getSavedName());
        file.setUploadName(fileDTO.getUploadName());
        file.setCreatedAt(fileDTO.getCreatedAt());
        return file;
    }


    // DTO -> VO ��ȯ �޼ҵ�
    public FileVO convertToVO(FileDTO fileDTO) {
        return new FileVO.Builder()
                .fileNo(fileDTO.getFileNo())
                .savedName(fileDTO.getSavedName())
                .uploadName(fileDTO.getUploadName())
                .createdAt(fileDTO.getCreatedAt())
                .build();
    }
}
