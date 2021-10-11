package org.zerock.ajaxserver.dto;

public class StoreDTO {

    private Long sno;
    private String name;
    private double lat,lng;
    private String menus, cat;

    public StoreDTO(Long sno, String name, double lat, double lng, String menus, String cat) {
        this.sno = sno;
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.menus = menus;
        this.cat = cat;
    }

    public Long getSno() {
        return sno;
    }

    public void setSno(Long sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getMenus() {
        return menus;
    }

    public void setMenus(String menus) {
        this.menus = menus;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "StoreDTO{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", menus='" + menus + '\'' +
                ", cat='" + cat + '\'' +
                '}';
    }
}
