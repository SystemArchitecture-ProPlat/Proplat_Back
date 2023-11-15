//package architecture.lesserpanda.repository;
//
//import architecture.lesserpanda.entity.Post;
//import architecture.lesserpanda.entity.Reply;
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
//class PostRepositoryTest {
//
//    @Autowired PostRepository postRepository;
//    @Test
//    void save() {
//        Post post = new Post("post1");
//        postRepository.save(post);
//
//        Post findPost = postRepository.findById(post.getId());
//
//        assertThat(findPost).isEqualTo(post);
//    }
//
//    @Test
//    void findByName() {
//        Post post = new Post("post2");
//        postRepository.save(post);
//
//        Post findPost = postRepository.findByTitle(post.getTitle());
//
//        assertThat(findPost).isEqualTo(post);
//    }
//
//    @Test
//    void findAll(){
//        Post post1 = new Post("post1");
//        postRepository.save(post1);
//
//        Post post2 = new Post("post2");
//        postRepository.save(post2);
//
//        List<Post> find = postRepository.findAll();
//        assertThat(find.size()).isEqualTo(2);
//    }
//
//    @Test
//    void delete(){
//        Post post1 = new Post("post1");
//        postRepository.save(post1);
//
//        Post post2 = new Post("post2");
//        postRepository.save(post2);
//
//        postRepository.delete(post1);
//
//        List<Post> find = postRepository.findAll();
//        assertThat(find.size()).isEqualTo(1);
//    }
//}