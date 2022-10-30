package University;

public class Result {

    public static void main(String[] args) {

        General general = new General("Ronald Turner", Pronoun.HE, "is", "Computer science");
        System.out.println(general.toString());

        Teachers teachers = new Teachers("Ronald Turner", Pronoun.HE, "is", "Computer science", Degree.PHD, "Programming paradigms");
        System.out.println(teachers.toString());

        Students students = new Students("Leo Wilkinson", Pronoun.HE, "is", "Computer science", Stage.BACHELOR, "III");
        System.out.println(students.toString());

        students = new Students("Ronald Correa", Pronoun.HE, "is", "Computer science", Pronoun1.HIS, "Design of a functional programming language");
        System.out.println(students.toString());

        General[] generalArray = new General[6];
        generalArray[0] = new Teachers("Ronald Turner", Pronoun.M, "Computer science", Degree.PHD, "Programming paradigms");
        generalArray[1] = new Teachers("Ruth Hollings", Pronoun.F, "Jurisprudence", Degree.MSC, "Domestic arbitration");
        generalArray[2] = new Students("Leo Wilkinson", Pronoun.M, "Computer science", Stage.BACHELOR, "III");
        generalArray[3] = new Students("Anna Cunningham", Pronoun.F,"World economy", Stage.BACHELOR, "I");
        generalArray[4] = new Students("Jill Lundqvist", Pronoun.F, "Jurisprudence", Stage.MASTER, "I");
        generalArray[5] = new Students("Ronald Correa", Pronoun.M, "Computer science", Pronoun1.HIS, "Design of a functional programming language");
        general.printAll(generalArray);
    }
}
