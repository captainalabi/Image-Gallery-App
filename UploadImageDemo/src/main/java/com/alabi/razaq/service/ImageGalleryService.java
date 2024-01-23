package com.alabi.razaq.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alabi.razaq.entity.ImageGallery;


@Service
public interface ImageGalleryService {

	void saveImage(ImageGallery imageGallery);

	List<ImageGallery> getAllActiveImages();

	Optional<ImageGallery> getImageById(Long id);

	void deleteById(Long id);

	Optional<ImageGallery> findById(Long id);
}
