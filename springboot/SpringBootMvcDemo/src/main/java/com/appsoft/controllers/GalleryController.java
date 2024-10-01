package com.appsoft.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.appsoft.models.Image;
import com.appsoft.repository.ImageRepository;
import com.appsoft.services.ImageService;

import ch.qos.logback.core.joran.conditional.IfAction;

@Controller
public class GalleryController {
	@Autowired
	private ImageService imgService;

	@GetMapping("/upload")
	public String getUpload() {
		return "uploadform";
	}

	@PostMapping("/upload")
	public String saveImage(@RequestParam MultipartFile image, Model m) throws IOException {
		if (image != null) {
			Image img = new Image();
			img.setImageName(image.getOriginalFilename());
			img.setImageSize(image.getSize());
			img.setImageType(image.getContentType());
			String uploadPath = "src\\main\\resources\\static\\img\\gallery\\";
			File file = new File(uploadPath);
			if (!file.exists()) {
				System.out.println("Inside not exists!");
				file.mkdir();
			}
			String filePath = uploadPath.concat(image.getOriginalFilename());
			if (this.imgService.addImage(img) != null) {
				Files.copy(image.getInputStream(), Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING);
				m.addAttribute("success", "file uploaded successfully!");
			} else {
				m.addAttribute("error", "Error uploading file!");
			}

		}
		return "uploadform";
	}
	
	@GetMapping("gallery")
	public String getGallery(Model m) {
		m.addAttribute("Images",this.imgService.getAllImages());
		return "gallery";
	}
}
