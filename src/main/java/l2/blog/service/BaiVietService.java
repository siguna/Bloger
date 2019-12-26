package l2.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import l2.blog.crud.BaiVietCrud;
import l2.blog.service.CustomDataJson.Status;

@Service
public class BaiVietService {

	
	@Autowired
	BaiVietCrud baiVietCrud;
	
	public CustomDataJson getAll() {
		
		
		CustomDataJson dataJson=new CustomDataJson();
		dataJson.setData(baiVietCrud.findAll());
		dataJson.setMessage("get full du lieu bai viet");
		
		return dataJson;
	}
}
