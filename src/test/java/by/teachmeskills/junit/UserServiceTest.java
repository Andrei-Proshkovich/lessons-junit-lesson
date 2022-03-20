package by.teachmeskills.junit;

import by.teachmeskills.dip.entity.User;
import by.teachmeskills.dto.UserDTO;
import by.teachmeskills.service.UserService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

// Написать тесты для CRUD операций
class UserServiceTest {

    List<User> users = new ArrayList<>();
    User expectedUser;
    UserService userService = UserService.getInstance();

    @BeforeEach
    void init() {

        expectedUser = new User();
        expectedUser.setFirstName("Marina");
        expectedUser.setLastName("Putilova");
        expectedUser.setEmail("mari@.by");

        expectedUser.setDateOFBirth("1999-01-01");

    }


    @Test
    @DisplayName("Testing delete user")
    @ValueSource(ints = {3})
    void testDeleteUserFailed() {
        boolean actualUser = userService.deleteUser(4);
        Assertions.assertFalse(actualUser);
    }
    @Test
    @DisplayName("Testing update user succesful")
    @Tag("USERS-TEST")
    void testUpdateUser() {
        boolean actualUser = userService.update(4,expectedUser);
        Assertions.assertTrue(actualUser, String.valueOf(expectedUser));


    }
@Test
@DisplayName("Testing delete user")
@ValueSource(ints = {3})
void testFindAllUsers() {
    List<UserDTO> actualUser = userService.findAllUsers();
    Assertions.assertEquals(actualUser,users);
}

}