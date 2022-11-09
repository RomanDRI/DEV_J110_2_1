package University;

public class Teachers extends General {
    private Degree degree;
    private String teacherSpecialty;

    public Teachers (String nameSurname, Pronoun pronoun, String verb, String department, Degree degree, String teacherSpecialty){
        super(nameSurname, pronoun, verb, department);
        setDegree(degree);
        setTeacherSpecialty(teacherSpecialty);
    }

    public Teachers (String nameSurname, Pronoun pronoun, String department, Degree degree, String teacherSpecialty){
        super(nameSurname, pronoun, department);
        setDegree(degree);
        setTeacherSpecialty(teacherSpecialty);
    }


    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public String getTeacherSpecialty() {
        return teacherSpecialty;
    }

    public void setTeacherSpecialty(String teacherSpecialty) {
        this.teacherSpecialty = teacherSpecialty;
    }

    @Override
    public String toString() {
        if(getPronoun()!=Pronoun.M & getPronoun()!=Pronoun.F) return "Teacher{ This is " + getNameSurname() + ". "
                + getPronoun() + " " + getVerb() + " at "
                + getDepartment() + ". "
                + getPronoun() + " has "
                + degree + " degree in "
                + teacherSpecialty + ".}";
        else return "Teacher{ Имя: " + getNameSurname()
                + " Пол: " + getPronoun()
                + " Факультет: " + getDepartment()
                + " Уч. Степень: " + degree
                + " Специальность: " + teacherSpecialty + ".}";
    }
}
