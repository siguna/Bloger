package l2.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import l2.blog.crud.MenuCrud;

@Service
public class MenuService {

	
	@Autowired
	MenuCrud menuCrud;
	
	public CustomDataJson getAll() {
		CustomDataJson dataJson=new CustomDataJson();
		dataJson.setData(menuCrud.findAll());
		dataJson.setMessage("get du lieu menu");
		return dataJson;
	}
}
