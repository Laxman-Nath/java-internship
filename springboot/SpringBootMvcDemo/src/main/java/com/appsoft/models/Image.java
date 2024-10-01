package com.appsoft.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "img_table")
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String imageName;
	private String imageType;
	private double imageSize;
}
