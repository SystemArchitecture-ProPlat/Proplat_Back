//package architecture.lesserpanda.service;
//
//import architecture.lesserpanda.entity.Post;
//import architecture.lesserpanda.entity.User;
//import architecture.lesserpanda.entity.UserStack;
//import architecture.lesserpanda.repository.UserRepository;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.assertj.core.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//@Transactional
//@Rollback(value = false)
//class UserServiceTest {
//
//    @Autowired UserService userService;
//    @Autowired PostService postService;
//    @Test
//    public void join(){
//        User user = new User("user1");
//        Long id = userService.join(user);
//
//        User findUser = userService.findUser(id);
//
//        assertThat(findUser.getId()).isEqualTo(id);
//    }
//
//    @Test
//    public void addUserStack(){
//        User user = new User("Lee");
//        UserStack userStack = new UserStack();
//
//        user.addUserStack(userStack);
//
//        userService.join(user);
//    }
//
//    @Test
//    public void getAllPost(){
//        User user = new User("user");
//        userService.join(user);
//
//        Post post = new Post("post1");
//        post.setUser(user);
//
//        Post post1 = new Post("post2");
//    }
//}