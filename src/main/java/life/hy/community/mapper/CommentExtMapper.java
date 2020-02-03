package life.hy.community.mapper;

import life.hy.community.model.Comment;
import org.springframework.stereotype.Controller;

@Controller
public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}