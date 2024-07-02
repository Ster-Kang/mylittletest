package com.ksw.service.forObject.object;

import com.ksw.dto.forObject.object.CategoryViewDTO;
import com.ksw.object.entity.jpa.CategoryView;
import com.ksw.object.vo.object.CategoryViewVO;

import org.springframework.stereotype.Service;

@Service
public class CategoryViewService {

    // Entity -> DTO ��ȯ �޼ҵ�
    public CategoryViewDTO convertToDTO(CategoryView categoryView) {
        return new CategoryViewDTO.Builder()
                .categoryViewNo(categoryView.getCategoryViewNo())
                .createdAt(categoryView.getCreatedAt())
                .build();
    }

    // DTO -> VO ��ȯ �޼ҵ�
    public CategoryViewVO convertToVO(CategoryViewDTO categoryViewDTO) {
        return new CategoryViewVO.Builder()
                .categoryViewNo(categoryViewDTO.getCategoryViewNo())
                .createdAt(categoryViewDTO.getCreatedAt())
                .build();
    }
}
