package l2.blog.crud;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import l2.blog.entity.BaiViet;

@Repository
public interface BaiVietCrud extends CrudRepository<BaiViet, Long> {

	@Query("SELECT bv FROM BaiViet bv")
	Page<BaiViet> findByOderByDesc(Pageable pageble);
	//@Query("from baiviet")
	//public List<BaiViet> getAll();
	
	@Query("SELECT bv FROM BaiViet bv WHERE bv.menu.id=?1")
	List<BaiViet> findByMenu(long id);

}
