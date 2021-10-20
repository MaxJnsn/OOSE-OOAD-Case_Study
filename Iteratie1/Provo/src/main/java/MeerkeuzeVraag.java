import java.util.ArrayList;

public class MeerkeuzeVraag extends Vraag{
    private ArrayList<String> mogelijkeAntwoorden;
    private int correcteIndex;

    public MeerkeuzeVraag(String vraagTekst, ArrayList<String> mogelijkeAntwoorden, int correcteIndex) {
        super(vraagTekst);
        this.mogelijkeAntwoorden = mogelijkeAntwoorden;
        this.correcteIndex = correcteIndex;
    }

    public ArrayList<String> getMogelijkeAntwoorden(){
        return mogelijkeAntwoorden;
    }

    @Override
    boolean isVraagCorrect(String antwoord) {
        //TODO: implementation
        return true;
    }
}
