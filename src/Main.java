import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Окуу жайлардын объектилерин түзүү
        EducationCenter school = new School("Central High School", "USA", LocalDate.of(1990, 1, 1));
        EducationCenter university = new University("Harvard University", "USA", LocalDate.of(1636, 9, 8));
        EducationCenter college = new College("Tech College", "UK", LocalDate.of(1985, 5, 15));

        // Студенттердин массивин түзүү
        Student[] students = new Student[]{
                new Student("Alice", "Smith", Gender.FEMALE, LocalDate.of(2020, 9, 1), school),
                new Student("Bob", "Johnson", Gender.MALE, LocalDate.of(2021, 9, 1), university),
                new Student("Charlie", "Brown", Gender.MALE, LocalDate.of(2019, 9, 1), college),
                new Student("Diana", "Miller", Gender.FEMALE, LocalDate.of(2022, 9, 1), school),
                new Student("Eva", "Davis", Gender.FEMALE, LocalDate.of(2020, 9, 1), university),
                new Student("Frank", "Wilson", Gender.MALE, LocalDate.of(2021, 9, 1), college),
                new Student("Grace", "Taylor", Gender.FEMALE, LocalDate.of(2018, 9, 1), school),
                new Student("Henry", "Moore", Gender.MALE, LocalDate.of(2019, 9, 1), university),
                new Student("Ivy", "Clark", Gender.FEMALE, LocalDate.of(2020, 9, 1), college),
                new Student("Jack", "White", Gender.MALE, LocalDate.of(2021, 9, 1), school)
        };

        // Бардык студенттер жонундо маалыматты чыгарган методду чакыруу
        printStudentsInfo(students);
    }

    public static void printStudentsInfo(Student[] students) {
        for (Student student : students) {
            String educationCenterName = student.getEducationCenter().getName();
            int studyingYears = LocalDate.now().getYear() - student.getDateOfStart().getYear();
            System.out.println("Студент: " + student.getName() + " " + student.getSurname());
            System.out.println("Жынысы: " + student.getGender());
            System.out.println("Окуу жайы: " + educationCenterName);
            System.out.println("Окуган жылдары: " + studyingYears + " жыл");
            System.out.println("-----------------------------");
        }
    }

}
