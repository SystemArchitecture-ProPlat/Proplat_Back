//package architecture.lesserpanda.service;
//
//import architecture.lesserpanda.entity.Post;
//import architecture.lesserpanda.entity.Reply;
//import architecture.lesserpanda.entity.User;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//@Transactional
//@Rollback(value = false)
//class ReplyServiceTest {
//
//    @Autowired ReplyService replyService;
//    @Autowired PostService postService;
//    @Autowired UserService userService;
//
//    @Test
//    public void createReply(){
//        User user = new User("user");
//        Post parent = new Post("post");
//        userService.join(user);
//        postService.savePost(parent, user.getId());
//
//        Reply reply1 = new Reply("test");
//        Long id = replyService.saveReply(reply1, parent.getId());
//
//        Reply findReply = replyService.findReply(id);
//
//        assertThat(findReply).isEqualTo(reply1);
//    }
//
//    @Test
//    public void findAll(){
//        User user = new User("user");
//        Post parent = new Post("post");
//        userService.join(user);
//        postService.savePost(parent, user.getId());
//
//        Reply reply1 = new Reply("reply1");
//        Reply reply2 = new Reply("reply2");
//
//        replyService.saveReply(reply1, parent.getId());
//        replyService.saveReply(reply2, parent.getId());
//
//        List<Reply> all = replyService.findAll();
//        assertThat(all.size()).isEqualTo(2);
//    }
//
//    @Test
//    public void deleteReply(){
//        User user = new User("user");
//        Post parent = new Post("post");
//        userService.join(user);
//        postService.savePost(parent, user.getId());
//
//        Reply reply1 = new Reply("reply1");
//        Reply reply2 = new Reply("reply2");
//
//        Long id1 = replyService.saveReply(reply1, parent.getId());
//        Long id2 = replyService.saveReply(reply2, parent.getId());
//
//        replyService.deleteReply(id1);
//
//        List<Reply> all = replyService.findAll();
//        assertThat(all.size()).isEqualTo(1);
//    }
//
//    @Test
//    public void createRereply(){
//        User user = new User("user");
//        userService.join(user);
//
//        Post parent = new Post("post");
//        postService.savePost(parent, user.getId());
//
//        Reply reply1 = new Reply("test");
//        replyService.saveReply(reply1, parent.getId());
//
//        Reply rereply = new Reply("rereply");
//        rereply.createRereply(reply1);
//        replyService.saveReply(rereply, parent.getId());
//    }
//}