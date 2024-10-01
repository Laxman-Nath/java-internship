package com.appsoft.services;

import java.util.List;

import com.appsoft.models.Image;

public interface ImageService {
	Image addImage(Image image);
	List<Image> getAllImages();
}
