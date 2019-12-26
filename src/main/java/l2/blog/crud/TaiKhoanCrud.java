package l2.blog.crud;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import l2.blog.entity.TaiKhoan;

@Repository
public interface TaiKhoanCrud extends CrudRepository<TaiKhoan, String> {

	
	TaiKhoan findByTendangnhap(String tendangnhap);
	

	

}
