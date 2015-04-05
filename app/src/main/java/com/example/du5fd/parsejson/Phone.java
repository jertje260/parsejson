package com.example.du5fd.parsejson;

/**
 * Created by Du5fd on 9-3-2015.
 */
public class Phone {
    private String mobile;
    private String home;
    private String office;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Phone(String mobile, String home, String office){
        this.mobile = mobile;
        this.home = home;
        this.office = office;

    }
}
