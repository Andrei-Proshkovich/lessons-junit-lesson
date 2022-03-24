package by.teachmeskills.dto;

import java.time.LocalDate;

public class UserDTO {
    private String firstName;
    private String lastName;
    private Long id;
    private String login;
    private String password;
    private String email;
    private LocalDate dateOfBirth;


    public UserDTO(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public UserDTO(UserDTOBuilder userDTOBuilder) {
        this.login = userDTOBuilder.getLogin();
        this.password = userDTOBuilder.getPassword();
        this.lastName = userDTOBuilder.getLastName();
        this.firstName = userDTOBuilder.getFirstName();
        this.id= userDTOBuilder.getId();
        this.dateOfBirth = userDTOBuilder.getDateOfBirth();
        this.email = userDTOBuilder.getEmail();
    }


    @Override
    public String toString() {
        return "UserDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' + ", email="+
                '\'' +email+ ", login="+ '\''+ login+ ", password="+ '\''
                + password+ ", id="+ '\''+id+
                '}';
    }
}