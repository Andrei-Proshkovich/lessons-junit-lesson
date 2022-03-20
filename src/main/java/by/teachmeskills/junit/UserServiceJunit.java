package by.teachmeskills.junit;

import by.teachmeskills.dao.UserDao;
import by.teachmeskills.dip.entity.User;
import by.teachmeskills.service.UserService;

public class UserServiceJunit {
        UserService userService =  UserService.getInstance();
    UserDao userDao =UserDao.getInstance();
    public User findUserById(Integer id) {
        User user = new User();

        if (id.equals(1)) {
            user.setFirstName("John");
            user.setLastName("Thompson");
            user.setEmail("j@t.com");

            user.setRole("user1");
        }
        else if (id.equals(2)) {
            user.setFirstName("Lili");
            user.setLastName("Pop");
            user.setEmail("lili@.by");

            user.setDateOFBirth("1999-01-01");

        }
        else {
            user.setFirstName("WRONG");
            user.setLastName("WRONG");
            user.setEmail("j@t.com");
            user.setRole("ADMIN");
        }

        return user;
    }

    public User saveUser(User expectedUser) {
        return expectedUser;
    }

    public boolean deleteUser(Integer id) {
        return userDao.delete(id);

    }


}