package lab_exercises.lab_2.school_2;

import java.util.Date;

public class Person {
    private String name;
    private String family;
    private Date birthDate;

    public Person(String name, String family, Date birthDate) {
        this.name = name;
        this.family = family;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
