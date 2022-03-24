package by.teachmeskills.dto;

public class Main {
    public static void main(String[] args) {
        UserDTO userDTO = new UserDTOBuilder().firstName("ret").lastName("ddava").email("dasd").build();

        System.out.println(userDTO.toString());
    }
}
