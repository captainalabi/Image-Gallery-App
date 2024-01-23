package com.alabi.razaq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alabi.razaq.entity.ImageGallery;



@Repository
public interface ImageGalleryRepository extends JpaRepository<ImageGallery, Long>{

}
