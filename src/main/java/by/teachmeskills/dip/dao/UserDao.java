package by.teachmeskills.dip.dao;

import by.teachmeskills.dip.entity.User;

public class UserDao implements Dao{
    @Override
    public void save(User user) {
        System.out.println(user);
    }
}