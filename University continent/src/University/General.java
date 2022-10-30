package University;

public class General {
    private String nameSurname;
    private String department;
    private Pronoun pronoun;
    private String verb;


    public General (String nameSurname, Pronoun pronoun, String department) {
        setNameSurname(nameSurname);
        setDepartment(department);
        setPronoun(pronoun);
    }

    public General (String nameSurname, Pronoun pronoun, String verb, String department) {
        this(nameSurname,  pronoun, department);
        setVerb(verb);
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Pronoun getPronoun() {
        return pronoun;
    }

    public void setPronoun(Pronoun pronoun) {
        this.pronoun = pronoun;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String toString(){
        return "General{ This is " + nameSurname + ". "
                + pronoun + " " +  verb + " at "
                + department + ".}";
    }

    public static void printAll(General[] generalArray){
        for (int i = 0; i < 6; i++) {
            System.out.println(generalArray[i]);
        }
    }
}
