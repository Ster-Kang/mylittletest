package com.ksw.service.forObject.object;

import com.ksw.dao.object.FavoriteRepository;
import com.ksw.dto.forObject.object.FavoriteDTO;
import com.ksw.object.entity.jpa.Favorite;
import com.ksw.object.vo.object.FavoriteVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FavoriteService {
	
    @Autowired
    private FavoriteRepository favoriteRepository;

    @Transactional
    public Favorite saveFavorite() {
        Favorite favorite = new Favorite();
        return favoriteRepository.save(favorite);
    }

    @Transactional
    public void deleteFavorite(Integer favoriteNo) {
        favoriteRepository.deleteById(favoriteNo);
    }
    
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
