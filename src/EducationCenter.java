import java.time.LocalDate;

public abstract class EducationCenter {
    protected String name;
    protected String locatedCountry;
    protected LocalDate foundationYear;

    public EducationCenter(String name, String locatedCountry, LocalDate foundationYear) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public String getLocatedCountry() {
        return locatedCountry;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }
}
