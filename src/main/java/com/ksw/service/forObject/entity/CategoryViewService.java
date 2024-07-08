package com.ksw.service.forObject.entity;

import com.ksw.dto.forObject.entity.CategoryViewDTO;
import com.ksw.object.entity.CategoryView;
import com.ksw.vo.forObject.entity.CategoryViewVO;

import org.springframework.stereotype.Service;

@Service
public class CategoryViewService {

    // Entity -> DTO 변환 메소드
    public CategoryViewDTO convertToDTO(CategoryView categoryView) {
        return new CategoryViewDTO.Builder()
                .categoryViewNo(categoryView.getCategoryViewNo())
                .createdAt(categoryView.getCreatedAt())
                .build();
    }

    // DTO -> VO 변환 메소드
    public CategoryViewVO convertToVO(CategoryViewDTO categoryViewDTO) {
        return new CategoryViewVO.Builder()
                .categoryViewNo(categoryViewDTO.getCategoryViewNo())
                .createdAt(categoryViewDTO.getCreatedAt())
                .build();
    }
}
