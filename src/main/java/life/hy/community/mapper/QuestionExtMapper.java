package life.hy.community.mapper;

import life.hy.community.model.Question;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public interface QuestionExtMapper {
    int incView(Question record);
    int incCommentCount(Question record);
    List<Question> selectRelated(Question question);
}
