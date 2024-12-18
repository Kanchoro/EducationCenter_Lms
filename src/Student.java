import java.time.LocalDate;

public class Student {
    private String name;
    private String surname;
    private Gender gender;
    private LocalDate dateOfStart;
    private EducationCenter educationCenter;

    public Student(String name, String surname, Gender gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }
}
