public class Employee {
    String name;
    int code;
    Address address;

    Employee(String name, int code, Address address){
        this.name = name;
        this.code = code;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void introduce(){
        System.out.println("Code: " + getCode());
        System.out.println("Name: " + getName());
        System.out.println("District: " + address.getDistrict());
        System.out.println("City: " + address.getCity());
        System.out.println("Country: " + address.getCountry());
    }
}
