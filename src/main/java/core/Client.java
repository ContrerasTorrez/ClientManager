package core;

import java.util.Date;

public class Client {

    int ID;
    String name;
    String type_nif;
    String NIF;
    String phone;
    String mobile;
    Boolean is_validate;
    Date create_date;
    String id_address;

    public Boolean insertClient(String name,String type_nif,String NIF, String phone,String mobile, String create_date,String id_address){
        String insert = "INSERT INTO CLIENT (C_NAME, C_TYPE_NIF, C_NIF,C_PHONE, C_MOBILE,C_CREATE_DATE, C_ID_ADDRESS) VALUES (" + name +
                "," + type_nif +
                "," + NIF +
                "," + phone +
                "," + mobile +
                "," + create_date +
                "," + id_address +
                ")";

        return true;
    }
    public Boolean updateClient(int ID, String name,String type_nif,String NIF, String phone,String mobile, String create_date,String id_address){
        String update = "UPDATE CLIENT SET C_NAME=" +
                ", C_TYPE_NIF=" +
                ", C_NIF,C_PHONE=" +
                ", C_MOBILE,C_CREATE_DATE=" +
                ", C_ID_ADDRESS=" +
                " WHERE ID = " + ID;
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