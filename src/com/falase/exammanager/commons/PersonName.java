package com.falase.exammanager.commons;

import com.falase.exammanager.exceptions.DuplicateAliasException;

import java.util.ArrayList;

/**
 * Created by Femi Falase on 19/02/2016.
 */
public class PersonName {

    private final ArrayList<String> aliases = new ArrayList<String>();
    private String firstName = "", middleName = "", lastName = "";


    //    Constructors
//    ============
    public PersonName() {
        this.firstName = "***UNKNOWNN***";
        this.middleName = "***UNKNOWNN***";
        this.lastName = "***UNKNOWNN***";
    }

    public PersonName(String lastName) {
        this.firstName = "***UNKNOWNN***";
        this.middleName = "***UNKNOWNN***";
        this.lastName = lastName;
    }

    public PersonName(String firstName, String lastName) {
        this.firstName = firstName;
        this.middleName = "***UNKNOWNN***";
        this.lastName = lastName;
    }

    public PersonName(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }


    //    Accessors and Mutators
//    ======================
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<String> getAliases() {
        return aliases;
    }


    /**
     * This method will assist in managing aliases by add known aliases to the Person associated with this name
     */
    public boolean addAlias(String alias) {

        boolean added = false;
        try {
//            search for alias,
            for (String s : this.aliases) {
                // ...throw exception if found
                if (s.equalsIgnoreCase(alias)) throw new DuplicateAliasException("Name already exists");

            }
            this.aliases.add(alias.trim());
            added = true;
        } catch (DuplicateAliasException e) {
            e.getMessage();
        }

        return added;
    }

    public String findOfficialName(String alias) {

        for (String s : this.aliases) {
            if (s.equalsIgnoreCase(alias)) {
                return this.toString();
            }
        }
        return "Name Not Found";
    }

    @Override
    public String toString() {
        return firstName + " " +
                middleName + ", " +
                lastName.toUpperCase();
    }
}