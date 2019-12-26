package l2.blog.crud;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import l2.blog.entity.Menu;

@Repository
public interface MenuCrud extends CrudRepository<Menu, Integer> {

}
