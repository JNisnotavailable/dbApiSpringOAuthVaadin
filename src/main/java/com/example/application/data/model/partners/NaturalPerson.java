package com.example.application.data.model.partners;

import java.util.List;

public class NaturalPerson {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Gender gender;
    private String academicTitle;
    private String titleOfNobility;
    private String nationality;
    private String birthName;
    private String birthPlace;
    private List<Legitimation> legitimation;
    private Boolean dbAPIauthenticatedUser;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }

    public String getTitleOfNobility() {
        return titleOfNobility;
    }

    public void setTitleOfNobility(String titleOfNobility) {
        this.titleOfNobility = titleOfNobility;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthName() {
        return birthName;
    }

    public void setBirthName(String birthName) {
        this.birthName = birthName;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public List<Legitimation> getLegitimation() {
        return legitimation;
    }

    public void setLegitimation(List<Legitimation> legitimation) {
        this.legitimation = legitimation;
    }

    public Boolean getDbAPIauthenticatedUser() {
        return dbAPIauthenticatedUser;
    }

    public void setDbAPIauthenticatedUser(Boolean dbAPIauthenticatedUser) {
        this.dbAPIauthenticatedUser = dbAPIauthenticatedUser;
    }
}
