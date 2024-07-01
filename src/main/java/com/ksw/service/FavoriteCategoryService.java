package com.ksw.service;

import com.ksw.dto.forObject.FavoriteCategoryDTO;
import com.ksw.object.entity.mybatis.FavoriteCategory;
import com.ksw.object.vo.FavoriteCategoryVO;
import org.springframework.stereotype.Service;

@Service
public class FavoriteCategoryService {

    // Entity -> DTO ��ȯ �޼ҵ�
    public FavoriteCategoryDTO convertToDTO(FavoriteCategory favoriteCategoryEntity) {
        return new FavoriteCategoryDTO.Builder()
                .userNo(favoriteCategoryEntity.getUserNo())
                .categoryNo(favoriteCategoryEntity.getCategoryNo())
                .favoriteNo(favoriteCategoryEntity.getFavoriteNo())
                .build();
    }

    // DTO -> VO ��ȯ �޼ҵ�
    public FavoriteCategoryVO convertToVO(FavoriteCategoryDTO favoriteCategoryDTO) {
        return new FavoriteCategoryVO.Builder()
                .userNo(favoriteCategoryDTO.getUserNo())
                .categoryNo(favoriteCategoryDTO.getCategoryNo())
                .favoriteNo(favoriteCategoryDTO.getFavoriteNo())
                .build();
    }
}
