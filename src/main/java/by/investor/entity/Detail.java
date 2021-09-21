package by.investor.entity;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "details")
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "father_name")
    private String fatherName;

    private String citizenship;

    private LocalDate birthday;

    @Column(name = "passport_code")
    private String passportCode;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToOne(cascade = {PERSIST, DETACH, MERGE,REFRESH},
    mappedBy = "detail")
    private Client client;

    public Detail() {
    }

    public Detail(String firstName, String lastName, String fatherName, String citizenship, LocalDate birthday, String passportCode, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.citizenship = citizenship;
        this.birthday = birthday;
        this.passportCode = passportCode;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPassportCode() {
        return passportCode;
    }

    public void setPassportCode(String passportCode) {
        this.passportCode = passportCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Detail detail = (Detail) o;
        return Objects.equals(firstName, detail.firstName) && Objects.equals(lastName, detail.lastName) && Objects.equals(fatherName, detail.fatherName) && Objects.equals(citizenship, detail.citizenship) && Objects.equals(birthday, detail.birthday) && Objects.equals(passportCode, detail.passportCode) && Objects.equals(phoneNumber, detail.phoneNumber) && Objects.equals(client, detail.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, fatherName, citizenship, birthday, passportCode, phoneNumber, client);
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", citizenship='" + citizenship + '\'' +
                ", birthday=" + birthday +
                ", passportCode='" + passportCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
