package com.appsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appsoft.models.Image;

public interface ImageRepository extends JpaRepository<Image, Integer> {

}
