package by.teachmeskills.service;

import by.teachmeskills.dao.UserDao;
import by.teachmeskills.dto.UserDTO;
import by.teachmeskills.entity.User;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class UserService implements Serializable {
    private final transient UserDao userDao = UserDao.getInstance();
    private static final UserService INSTANCE = new UserService();

    public UserService() {
    }

    public static UserService getInstance() {
        return INSTANCE;
    }

    public List<UserDTO> findAllUsers() {

        return userDao.findAll().stream()
                .map(user -> new UserDTO(
                        user.getFirstName(),
                        user.getLastName()
                ))
                .collect(Collectors.toList());
    }

    public UserDTO findUserByID(Integer id) {
        if (id != null) {
            User user = userDao.findById(id);
            return new UserDTO(user.getFirstName(), user.getLastName());
        }
        return null;
    }

    public UserDTO save() {
        User user = new User();
        user.setFirstName("");
        user.setLastName("");
        user.setEmail("");


        userDao.save(user);

        return new UserDTO(user.getFirstName(), user.getLastName());
    }



    public  boolean update(Integer id, by.teachmeskills.dip.entity.User expectedUser) {
        User user = new User();
        user.setFirstName("Nick");
        user.setLastName("Nick");
        user.setEmail("nick@.com");

     userDao.update(id, user);
        return false;

    }
    public  UserDTO login(UserDTO userDTO){
        String login = userDTO.getLogin();
        String password = userDTO.getPassword();
        User user = userDao.findByLoginAndPassword(login, password);
        UserDTO mappedUsserDTO = userDTO;

        mappedUsserDTO.setLastName(user.getLastName());
       mappedUsserDTO.setFirstName(user.getFirstName());
        return mappedUsserDTO;
    }

    public boolean deleteUser(Integer id) {
        return userDao.delete(id);
}}