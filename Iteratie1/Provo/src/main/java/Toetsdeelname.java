import java.util.ArrayList;

public class Toetsdeelname {
    private Student student;
    private Kennistoets kennistoets;
    private ArrayList<GegevenAntwoord> gegevenAntwoorden;

    public Toetsdeelname(Student student, Kennistoets kennistoets){
        this.student = student;
        this.kennistoets = kennistoets;
        gegevenAntwoorden = new ArrayList<GegevenAntwoord>();
    }

    public void beantwoordVraag(Vraag vraag, String studentAntwoord){
        gegevenAntwoorden.add(new GegevenAntwoord(vraag, studentAntwoord));
    }
}
