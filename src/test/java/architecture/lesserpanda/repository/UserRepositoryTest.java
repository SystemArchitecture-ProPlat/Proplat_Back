//package architecture.lesserpanda.repository;
//
//import architecture.lesserpanda.entity.User;
//import jakarta.transaction.Transactional;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.Rollback;
//
//import static org.assertj.core.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//@Transactional
//@Rollback(value = false)
//class UserRepositoryTest {
//
//    @Autowired UserRepository userRepository;
//
//    @Test
//    public void save(){
//        User user = new User("user1");
//        userRepository.save(user);
//
//        User findUser = userRepository.findById(user.getId());
//        assertThat(findUser).isEqualTo(user);
//    }
//}