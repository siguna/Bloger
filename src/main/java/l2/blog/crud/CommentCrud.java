package l2.blog.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import l2.blog.entity.Comment;
@Repository
public interface CommentCrud extends CrudRepository<Comment, Integer> {

}
