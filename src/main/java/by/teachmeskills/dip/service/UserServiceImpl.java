package by.teachmeskills.dip.service;

import by.teachmeskills.dip.dao.Dao;
import by.teachmeskills.dip.dao.UserDao;
import by.teachmeskills.dip.entity.User;

public class UserServiceImpl implements UserService {
    private Dao userDao = new UserDao();
    @Override
    public void convertToUpperCase(String firstName, String lastName) {
        User user = new User();
        user.setFirstName(firstName.toUpperCase());
        user.setLastName(lastName.toUpperCase());
        userDao.save(user);
    }
}