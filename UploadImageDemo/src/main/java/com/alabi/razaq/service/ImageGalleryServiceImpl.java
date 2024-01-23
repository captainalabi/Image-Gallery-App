package com.alabi.razaq.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alabi.razaq.entity.ImageGallery;
import com.alabi.razaq.repository.ImageGalleryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ImageGalleryServiceImpl implements ImageGalleryService{

	@Autowired
	private ImageGalleryRepository imageGalleryRepository;
	
	@Override
	public void saveImage(ImageGallery imageGallery) {
		imageGalleryRepository.save(imageGallery);	
	}

	@Override
	public List<ImageGallery> getAllActiveImages() {
		return imageGalleryRepository.findAll();
	}

	@Override
	public Optional<ImageGallery> getImageById(Long id) {
		return imageGalleryRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		imageGalleryRepository.deleteById(id);
	}
	
	@Override
	public Optional<ImageGallery> findById(Long id) {
		
		return imageGalleryRepository.findById(id);
	}
}

