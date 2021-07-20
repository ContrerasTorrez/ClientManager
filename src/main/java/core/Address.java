package core;

public class Address {
    int ID;
    String street;
    String street2;
    String city;
    String state;
    String country;
    String address_type;
    String id_client;

    public Boolean insertAddress(Address address){
        String insert = "INSERT INTO CLIENT (A_STREET, A_STREET2, A_CITY, A_STATE, A_COUNTRY, A_ADDRESS_TYPE, A_ID_CLIENT) VALUES (" +
                      address.street +
                "," + address.street2 +
                "," + address.city +
                "," + address.state +
                "," + address.country +
                "," + address.address_type +
                "," + address.id_client +
                ")";

        return true;
    }
    public Boolean updateClient(Address address){
        String update = "UPDATE CLIENT SET " +
                "A_STREET=" + address.street +
                ", A_STREET2=" + address.street2 +
                ", A_CITY=" + address.city +
                ", A_STATE=" + address.state+
                ", A_COUNTRY=" + address.country +
                ", A_ADDRESS_TYPE=" + address.address_type +
                ", A_ID_CLIENT=" + address.id_client +
                " WHERE ID = " + address.ID ;
        return true;
    }

    public Boolean deleteClient(int ID){
        String delete = "DELETE CLIENT WHERE ID = " + ID;
        return true;
    }

    public Client[] selectClient(){
        return new Client [] {};
    }

}
