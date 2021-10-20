import java.util.ArrayList;
import java.util.List;

public class KortAntwoordVraag extends Vraag{
    private List<String> correcteSteekwoorden;

    public KortAntwoordVraag(String vraagTekst, ArrayList<String> correcteSteekwoorden) {
        super(vraagTekst);
        this.correcteSteekwoorden = correcteSteekwoorden;
    }

    @Override
    boolean isVraagCorrect(String antwoord) {
        //TODO: implementation
        return true;
    }
}
