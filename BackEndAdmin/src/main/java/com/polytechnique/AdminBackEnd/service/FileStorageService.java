package com.polytechnique.AdminBackEnd.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.polytechnique.AdminBackEnd.model.FileDB;
import com.polytechnique.AdminBackEnd.repository.FileDBRepository;


@Service
public class FileStorageService {
	
	@Autowired
	private FileDBRepository fileDBRepository;
	
	 public FileDB store(MultipartFile file) throws IOException {
		 	int  iduser = 1;
		    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		    FileDB FileDB = new FileDB(fileName, file.getContentType(), iduser,file.getBytes());

		    return fileDBRepository.save(FileDB);
		  }

		  public FileDB getFile(String id) {
		    return fileDBRepository.findById(id).get();
		  }
		  
		  public Stream<FileDB> getAllFiles() {
		    return fileDBRepository.findAll().stream();
		  }
		  
		  
		  public void deleteFile(String name) {
			   fileDBRepository.deleteByName(name);
		  }
		  
		  
		  public FileDB fetchFileyName(String name) {
			  return fileDBRepository.findByName(name);
		  }
		  
		  
}
