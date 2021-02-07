package com.bilgeadam.designpatterns.creational.builder;

public class Home {
    private String city;
    private String county;
    private String neighborhood;
    private int homeOld;
    private int balconyCount;
    private int roomCount;
    private int area;
    private int roofCount;


    public Home() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public int getHomeOld() {
        return homeOld;
    }

    public void setHomeOld(int homeOld) {
        this.homeOld = homeOld;
    }

    public int getBalconyCount() {
        return balconyCount;
    }

    public void setBalconyCount(int balconyCount) {
        this.balconyCount = balconyCount;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getRoofCount() {
        return roofCount;
    }

    public void setRoofCount(int roofCount) {
        this.roofCount = roofCount;
    }

    @Override
    public String toString() {
        return "Home{" +
                "city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", homeOld=" + homeOld +
                ", balconyCount=" + balconyCount +
                ", roomCount=" + roomCount +
                ", area=" + area +
                ", roofCount=" + roofCount +
                '}';
    }

    public static class HomeBuilder{
        private String city;
        private String county;
        private String neighborhood;
        private int homeOld;
        private int balconyCount;
        private int roomCount;
        private int area;
        private int roofCount;

        public static HomeBuilder builder(){
            return new HomeBuilder();
        }

        public Home build(){
            Home home = new Home();
            home.setCity(city);
            home.setCounty(county);
            home.setNeighborhood(neighborhood);
            home.setHomeOld(homeOld);
            home.setBalconyCount(balconyCount);
            home.setRoomCount(roomCount);
            home.setArea(area);
            home.setRoofCount(roofCount);
            return home;
        }

        public HomeBuilder city(String city) {
            this.city = city;
            return this;
        }

        public HomeBuilder county(String county) {
            this.county = county;
            return this;
        }

        public HomeBuilder neighborhood(String neighborhood) {
            this.neighborhood = neighborhood;
            return this;
        }

        public HomeBuilder homeOld(int homeOld) {
            this.homeOld = homeOld;
            return this;
        }

        public HomeBuilder balconyCount(int balconyCount) {
            this.balconyCount = balconyCount;
            return this;
        }

        public HomeBuilder roomCount(int roomCount) {
            this.roomCount = roomCount;
            return this;
        }

        public HomeBuilder area(int area) {
            this.area = area;
            return this;
        }

        public HomeBuilder roofCount(int roofCount) {
            this.roofCount = roofCount;
            return this;
        }
    }

}
