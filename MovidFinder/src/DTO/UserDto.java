package DTO;

public class UserDto {
    private String id;
    private String pwd;
    private boolean isin;
    private boolean admin;

    private UserDto(String id, String pwd, boolean isin, boolean admin) {
        this.id = id;
        this.pwd = pwd;
        this.isin = isin;
        this.admin = admin;
    }
}
