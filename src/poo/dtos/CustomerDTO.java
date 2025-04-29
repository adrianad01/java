package poo.dtos;

public class CustomerDTO {

    private Integer id;
    private String name;
    private String email;
    private String password;
    private String phone;

    public CustomerDTO(String password, Integer id, String name, String email, String phone) {
        this.password = password;
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public CustomerDTO() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
