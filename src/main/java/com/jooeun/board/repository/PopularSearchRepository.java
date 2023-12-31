package com.jooeun.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jooeun.board.entity.PopularSearchEntity;

@Repository
public interface PopularSearchRepository extends JpaRepository<PopularSearchEntity, String> {

}
