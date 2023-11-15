//package architecture.lesserpanda.repository;
//
//import architecture.lesserpanda.entity.Post;
//import architecture.lesserpanda.entity.Reply;
//import jakarta.persistence.EntityManager;
//import jakarta.transaction.Transactional;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.Rollback;
//
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//@Transactional
//@Rollback(value = false)
//class ReplyRepositoryTest {
//
//    @Autowired ReplyRepository replyRepository;
//    @Autowired PostRepository postRepository;
//    @Autowired
//    EntityManager em;
//
//    @Test
//    void save() {
//        Reply reply = new Reply("Hi");
//        replyRepository.save(reply);
//
//        Reply find = replyRepository.findById(reply.getId());
//
//        assertThat(find).isEqualTo(reply);
//    }
//
//    @Test
//    void delete() {
//        Reply reply = new Reply("reply2");
//        replyRepository.save(reply);
//
//        replyRepository.delete(reply);
//        List<Reply> all = replyRepository.findAll();
//        assertThat(all.size()).isEqualTo(0);
//    }
//
//    @Test
//    void createRereply(){
//        Reply reply = new Reply("reply");
//        replyRepository.save(reply);
//
//        Reply rereply = new Reply("rereply");
//
//        reply.addRereply(rereply);
//        replyRepository.save(rereply);
//
//        List<Reply> resultList = em.createQuery("select r from Reply r join r.child c", Reply.class)
//                .getResultList();
//        assertThat(resultList.size()).isEqualTo(1);
//    }
//
//    @Test
//    void createReply(){
//        Post post = new Post("post");
//        postRepository.save(post);
//
//        Reply reply = new Reply("reply");
//        reply.setPost(post);
//        replyRepository.save(reply);
//    }
//}