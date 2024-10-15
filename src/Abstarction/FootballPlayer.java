package Abstarction;

import Damas.Person;

public class FootballPlayer extends Person {

    private String team;
    private Integer number;
    private String country;

    public FootballPlayer(int id, String firstname, String lastname, int age , String team , int number, String country) {
        super(id,firstname, lastname,age);
        this.country=country;
        this.team=team;
        this.number=number;
    }

    public String getTeams() {
        return team;
    }

    public Integer getNumber() {
        return number;
    }

    public String getCountry() {
        return country;
    }

    public void setTeams(String team) {
        this.team = team;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setCountry(String country) {
        country = country;
    }
}
