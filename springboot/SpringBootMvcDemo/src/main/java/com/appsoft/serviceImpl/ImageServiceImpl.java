package com.appsoft.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsoft.models.Image;
import com.appsoft.repository.ImageRepository;
import com.appsoft.services.ImageService;

@Service
public class ImageServiceImpl implements ImageService {
	@Autowired
	private ImageRepository imageRepo;

	@Override
	public Image addImage(Image image) {

		return this.imageRepo.save(image);
	}

	@Override
	public List<Image> getAllImages() {
		// TODO Auto-generated method stub
		return this.imageRepo.findAll();
	}

}
