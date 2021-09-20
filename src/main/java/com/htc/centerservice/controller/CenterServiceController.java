package com.htc.centerservice.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htc.centerservicce.entity.CenterServiceEntity;
import com.htc.centerservice.repository.CenterServiceInterface;


public class CenterServiceController {

	@Autowired
	private CenterServiceInterface centreServiceInterface;
	
	@GetMapping("/vaccination/centre/{centre_id}")
	public CenterServiceEntity getCentrebyId(@PathVariable Long centre_id) {
		return centreServiceInterface.findById(centre_id).get();
	}
	
	@PostMapping("/create/centre")
	public CenterServiceEntity createCentre(@RequestBody CenterServiceEntity centreService) {
		return centreServiceInterface.save(centreService);
	}
	
	@GetMapping("/vaccination/centre/{pincode}")
	public List<CenterServiceEntity> getCentrebypinCode(@PathVariable Long pincode) {
		return centreServiceInterface.findByPin_code(pincode);
	}
}


