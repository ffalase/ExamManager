package com.falase.exammanager.commons;

import java.util.ArrayList;

/**
 * Created by Femi on 19/02/2016.
 */
public class Person {
    private final ArrayList<ContactDetail> contactDetails = new ArrayList<>();
    private PersonName personName;
    private Gender gender = Gender.UNKNOWN;

    public PersonName getPersonName() {
        return personName;
    }

    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public ArrayList<ContactDetail> getContactDetails() {
        return contactDetails;
    }

    enum Gender {MALE, FEMALE, UNKNOWN}
}
