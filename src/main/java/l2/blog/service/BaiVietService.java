package l2.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import l2.blog.crud.BaiVietCrud;

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
	public CustomDataJson getBaiVietViewCao() {
		CustomDataJson dataJson=new CustomDataJson();
		Sort sortTable=Sort.by("soview").descending();
		Pageable pageable = PageRequest.of(0, 5, sortTable);
		dataJson.setData(baiVietCrud.findByOderByDesc(pageable));
		return dataJson;
	}
	
	public CustomDataJson getTheoDanhMuc(long id) {
		CustomDataJson dataJson=new CustomDataJson();
		dataJson.setData(baiVietCrud.findByMenu(id));
		return dataJson;
	}
}
