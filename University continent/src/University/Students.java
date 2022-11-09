package University;

public class Students extends General {
    private String studentsCourseNumber;
    private String studentsTitle;
    private Stage stage;
    private Pronoun1 pronoun1;


    public Students(String nameSurname, Pronoun pronoun, String verb, String department, Stage stage, String studentsCourseNumber){
        super(nameSurname, pronoun, verb, department);
        setStudentsCourseNumber(studentsCourseNumber);
        setStage(stage);
    }

    public Students(String nameSurname, Pronoun pronoun, String department, Stage stage, String studentsCourseNumber){
        super(nameSurname, pronoun, department);
        setStudentsCourseNumber(studentsCourseNumber);
        setStage(stage);
    }

    public Students(String nameSurname, Pronoun pronoun, String verb, String department, Pronoun1 pronoun1, String studentsTitle){
        super(nameSurname, pronoun, verb, department);
        setStudentsTitle(studentsTitle);
        setPronoun1(pronoun1);
    }

    public Students(String nameSurname, Pronoun pronoun, String department, Pronoun1 pronoun1, String studentsTitle){
        super(nameSurname, pronoun, department);
        setStudentsTitle(studentsTitle);
        setPronoun1(pronoun1);
    }

    public String getStudentsCourseNumber() {
        return studentsCourseNumber;
    }

    public void setStudentsCourseNumber(String studentsCourseNumber) {
        this.studentsCourseNumber = studentsCourseNumber;
    }

    public String getStudentsTitle() {
        return studentsTitle;
    }

    public void setStudentsTitle(String studentsTitle) {
        this.studentsTitle = studentsTitle;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Pronoun1 getPronoun1() {
        return pronoun1;
    }

    public void setPronoun1(Pronoun1 pronoun1) {
        this.pronoun1 = pronoun1;
    }

    @Override
    public String toString() {
        if(studentsCourseNumber!=null & getPronoun()!=Pronoun.M & getPronoun()!=Pronoun.F) return "Student{ This is " + getNameSurname() + ". "
                + getPronoun() + " " +  getVerb() + " at "
                + getDepartment() + ". "
                + getPronoun() + " is "
                + studentsCourseNumber + "'th year "
                + stage + " student.}";
        else if (studentsCourseNumber==null & getPronoun()!=Pronoun.M & getPronoun()!=Pronoun.F)
            return "GraduateStudent{ This is " + getNameSurname() + ". "
                    + getPronoun() + " " +  getVerb() + " at "
                    + getDepartment() + ". "
                    + pronoun1 + " thesis title is "
                    + studentsTitle + ".}";
        else if (studentsCourseNumber==null & getPronoun()!=Pronoun.HE & getPronoun()!=Pronoun.SHE)
            return "Student{ Имя: " + getNameSurname()
                    + " Пол: " + getPronoun()
                    + " Факультет: " + getDepartment()
                    + " Тема диссертации: " + studentsTitle + ".}";
        else if(studentsCourseNumber!=null & getPronoun()!=Pronoun.HE & getPronoun()!=Pronoun.SHE)
            return  "Student{ Имя: " + getNameSurname()
                    + " Пол: " + getPronoun()
                    + " Факультет: " + getDepartment()
                    + " Ступень: " + stage
                    + " Курс: " + studentsCourseNumber + ".}";
        else return "Hello";
    }

}
