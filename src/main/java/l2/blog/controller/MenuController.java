package l2.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import l2.blog.service.CustomDataJson;
import l2.blog.service.MenuService;

@RestController
@RequestMapping("/menuapi")
public class MenuController {
	
	@Autowired
	MenuService menuService;
	
	
	@CrossOrigin(origins="*")
	@GetMapping("/getAll")
	public ResponseEntity<CustomDataJson> getAll(){
		return new ResponseEntity<CustomDataJson>(menuService.getAll(), HttpStatus.OK);
	}
	
	@CrossOrigin(origins="*")
	@PostMapping("/post")
	public ResponseEntity<CustomDataJson> getAll1(){
		return new ResponseEntity<CustomDataJson>(menuService.getAll(), HttpStatus.OK);
	}
	

}
