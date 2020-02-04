package com.shuyun.loalty.recognize;

public class RegInfo {

    private String plat;

    private String shopId;

    private String accountId;

    private String mobile;

    private String fixMobile;

    private String partner;

    private String tenantId;

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFixMobile() {
        return fixMobile;
    }

    public void setFixMobile(String fixMobile) {
        this.fixMobile = fixMobile;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String toString() {
        return "{" +
                "plat='" + plat + '\'' +
                ", shopId='" + shopId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", mobile='" + mobile + '\'' +
                ", fixMobile='" + fixMobile + '\'' +
                ", partner='" + partner + '\'' +
                ", tenantId='" + tenantId + '\'' +
                '}';
    }
}
