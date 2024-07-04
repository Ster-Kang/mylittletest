package com.ksw.vo.forObject.object;

import java.sql.Timestamp;
import java.util.Objects;

public final class FavoriteVO {
    private final Integer favoriteNo;
    private final Timestamp createdAt;

    private FavoriteVO(Builder builder) {
        this.favoriteNo = builder.favoriteNo;
        this.createdAt = builder.createdAt;
    }

    public Integer getFavoriteNo() {
        return favoriteNo;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavoriteVO that = (FavoriteVO) o;
        return Objects.equals(favoriteNo, that.favoriteNo) &&
                Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(favoriteNo, createdAt);
    }

    @Override
    public String toString() {
        return "FavoriteVO{" +
                "favoriteNo=" + favoriteNo +
                ", createdAt=" + createdAt +
                '}';
    }

    public static class Builder {
        private Integer favoriteNo;
        private Timestamp createdAt;

        public Builder favoriteNo(Integer favoriteNo) {
            this.favoriteNo = favoriteNo;
            return this;
        }

        public Builder createdAt(Timestamp createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public FavoriteVO build() {
            return new FavoriteVO(this);
        }
    }
}
