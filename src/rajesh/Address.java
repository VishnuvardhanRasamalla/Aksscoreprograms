package rajesh;

public class Address {
     String street;
     String suite;
     String city;
     int zipcode;
     Geo geo;

    public Address(String street, String suite, int zipcode, String city, Geo geo) {
        this.street = street;
        this.suite = suite;
        this.zipcode = zipcode;
        this.city = city;
        this.geo = geo;
    }

}
