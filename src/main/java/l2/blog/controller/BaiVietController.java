package l2.blog.controller;

import javax.net.ssl.SSLEngineResult.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import l2.blog.service.BaiVietService;
import l2.blog.service.CustomDataJson;

@RestController
@RequestMapping("/api")
public class BaiVietController {

	
	@Autowired
	BaiVietService baiVietService;
	
	@GetMapping("/baivietall")
	public ResponseEntity<CustomDataJson> getAll(){
		return new ResponseEntity<CustomDataJson>(baiVietService.getAll(), HttpStatus.OK);
	}
}
