package com.example.du5fd.parsejson;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Du5fd on 9-3-2015.
 */
public class Contact {
    private String id;
    private String name;
    private String email;
    private String address;
    private String gender;
    private Phone phone;

    private static final String TAG_ID = "id";
    private static final String TAG_NAME = "name";

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private static final String TAG_EMAIL = "email";
    private static final String TAG_ADDRESS = "address";
    private static final String TAG_GENDER = "gender";
    private static final String TAG_PHONE_MOBILE = "mobile";
    private static final String TAG_PHONE_HOME = "home";
    private static final String TAG_PHONE_OFFICE = "office";

    public Contact(JSONObject json){
        try {
            id = json.getString(TAG_ID);
            name = json.getString(TAG_NAME);
            email = json.getString(TAG_EMAIL);
            address = json.getString(TAG_ADDRESS);
            gender = json.getString(TAG_GENDER);
            phone = new Phone(json.getString(TAG_PHONE_MOBILE),
                    json.getString(TAG_PHONE_HOME),json.getString(TAG_PHONE_OFFICE));

        } catch (JSONException e){
            e.printStackTrace();
        }

    }
}
