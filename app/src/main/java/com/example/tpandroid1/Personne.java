package com.example.tpandroid1;


import java.util.List;

public class Personne {
    private final Integer matricule;
    private final String firstName;
    private final String lastName;
    private final List<String> formation;
    private final String countryValue;

    public Personne(Integer matricule,
                    String firstName,
                    String lastName,
                    List<String> formation,
                    String countryValue) {
        this.matricule = matricule;
        this.firstName = firstName;
        this.lastName = lastName;
        this.formation = formation;
        this.countryValue = countryValue;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "matricule=" + matricule +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", formation=" + formation +
                ", countryValue='" + countryValue + '\'' +
                '}';
    }
}

