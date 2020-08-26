package com.lti.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lti.dto.DocumentUploadDto;
import com.lti.dto.StatusDto;
import com.lti.entity.DocumentDetails;
import com.lti.exception.IncomeServiceException;
import com.lti.repository.DocumentsRepo;
import com.lti.service.AddDocumentService;

import ch.qos.logback.core.status.Status;

@RestController
@CrossOrigin
public class DocumentsController {

	/*@Autowired
	private AddDocumentService docServ;

	@PostMapping( path="/uploadDocuments", consumes= "multipart/form-data" , produces= "application/json" )
	public StatusDto addDocuments(@RequestPart("file") MultipartFile file, @RequestPart("obj") DocumentUploadDto documentsDto ) {
		try {
			DocumentDetails documentDetails = new DocumentDetails();
			documentDetails.setAgreementToSale(documentsDto.getAgreementToSale().getOriginalFilename());
			documentDetails.setLoa(documentsDto.getLoa().getOriginalFilename());
			documentDetails.setNocFormBuilder(documentsDto.getNocFormBuilder().getOriginalFilename());
			documentDetails.setPanCard(documentsDto.getPanCard().getOriginalFilename());
			documentDetails.setVoterId(documentsDto.getVoterId().getOriginalFilename());
			documentDetails.setSalarySlip(documentsDto.getSalarySlip().getOriginalFilename());
			
			
		}
		catch(Exception e ) {
		}
		}*/
	}
