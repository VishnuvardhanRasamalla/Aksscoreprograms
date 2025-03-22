package rajesh;

public class Json {
    private int id;
    private String username;
    private String email;
    Address address;
    private String phone;
    private String website;
    Company company;

    public Json(int id, String username, String email, Address address, String phone, String website, Company company) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }
}
