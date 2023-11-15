//package architecture.lesserpanda.entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.transaction.Transactional;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.Rollback;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//@Transactional
//@Rollback(value = false)
//class UserTest {
//
//    @PersistenceContext
//    EntityManager em;
//
//    @Test
//    public void user(){
//        User user = new User("Lee", "1234", "1234", "lesserpanda");
//        em.persist(user);
//
//        em.flush();
//        em.clear();
//    }
//}