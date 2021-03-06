package ImageHoster.service;
/*
---------------------------------------------------------------------------------------------------------------------------------------
 Version         Modification Date                Developer                Modifications
---------------------------------------------------------------------------------------------------------------------------------------
 *@ 1.0.0.1         26-Oct-2020                  Mansur Farooq              Functionality Upgrade: Users can add comments for any image.
*/
import ImageHoster.model.Comments;
import ImageHoster.model.Image;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("commentService")
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    public void addComments(Comments comments){ commentRepository.addComments(comments);}

    public List<Comments> retrieveComments(Image image){ return commentRepository.retrieveComments(image);}
}
