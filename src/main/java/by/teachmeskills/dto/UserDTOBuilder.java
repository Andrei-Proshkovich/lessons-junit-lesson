package by.teachmeskills.dto;

import java.time.LocalDate;

public class UserDTOBuilder {
    private String firstName;
    private String lastName;
    private Long id;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    private String login;
    private String password;
    private String email;
    private LocalDate dateOfBirth;

    public  UserDTOBuilder firstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public  UserDTOBuilder lastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public UserDTOBuilder id(Long id){
        this.id = id;
        return this;
    }

    public  UserDTOBuilder login(String login){
        this.login = login;
        return this;
    }

    public  UserDTOBuilder password(String password){
        this.password = password;
        return  this;
    }

    public  UserDTOBuilder email(String email){
        this.email=email;
        return this;
    }

    public UserDTOBuilder dateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
        return this;
    }
    public UserDTO build(){
        return new UserDTO(this);
    }
}
