package com.alpha;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.model.Asset;
import com.alpha.repository.AssetRepository;



@RestController(value = "/")
public class HomeController {
	
	@Autowired
	AssetRepository assetRepository;
	
	
	@GetMapping("/index")
	public String index() {
		
	return "welcome to Index API version 0.0.2";	
	}
	@GetMapping("/home")
	public String home() {
	return "welcome to Home API";	
	}
	
	@GetMapping("/asset")
	public List<Asset> getAsset() {
		
	return assetRepository.findAll();
	}
	

	
	}
