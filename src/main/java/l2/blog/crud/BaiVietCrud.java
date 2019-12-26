package l2.blog.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import l2.blog.entity.BaiViet;

@Repository
public interface BaiVietCrud extends CrudRepository<BaiViet, Integer> {

	
}
