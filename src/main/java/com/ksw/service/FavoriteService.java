package com.ksw.service;

import com.ksw.dto.forObject.FavoriteDTO;
import com.ksw.object.entity.jpa.Favorite;
import com.ksw.object.vo.FavoriteVO;
import org.springframework.stereotype.Service;

@Service
public class FavoriteService {

    // Entity -> DTO ��ȯ �޼ҵ�
    public FavoriteDTO convertToDTO(Favorite favorite) {
        return new FavoriteDTO.Builder()
                .favoriteNo(favorite.getFavoriteNo())
                .createdAt(favorite.getCreatedAt())
                .build();
    }

    // DTO -> VO ��ȯ �޼ҵ�
    public FavoriteVO convertToVO(FavoriteDTO favoriteDTO) {
        return new FavoriteVO.Builder()
                .favoriteNo(favoriteDTO.getFavoriteNo())
                .createdAt(favoriteDTO.getCreatedAt())
                .build();
    }
}
