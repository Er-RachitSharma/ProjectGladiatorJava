package com.lti.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.activation.FileDataSource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lti.dto.DocumentUploadDto;

@RestController
@CrossOrigin
public class UploadController {
	@GetMapping("/")
	public String showUploadForm(Model model) {
		return "uploadForm";
	}

	@PostMapping(path = "/upload", produces = "text/plain")
	public String saveFiles(@RequestPart("documents") MultipartFile[] files) { //@RequestPart imp very
		{
			DocumentUploadDto docDto = new DocumentUploadDto();
			int custId = docDto.getCustomerId();
			String status = "";
			File dir = new File("E:\\docupload\\"); //set you own path
			for (int i = 0; i < files.length; i++) {
				MultipartFile file = files[i];
				try {
					byte[] bytes = file.getBytes(); //content to array of bytes

					File uploadFile = new File(dir.getAbsolutePath() + File.separator + file.getOriginalFilename());
					BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(uploadFile));
					outputStream.write(bytes);
					outputStream.close();

					status = status + "You successfully uploaded file=" + file.getOriginalFilename();
				} catch (Exception e) {
					e.printStackTrace();
					status = status + "Failed to upload " + file.getOriginalFilename() + " " + e.getMessage();
				}
			}
			return status;

		
		}
	}
}