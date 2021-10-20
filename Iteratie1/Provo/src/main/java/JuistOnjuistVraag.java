public class JuistOnjuistVraag extends Vraag{
    boolean correcteKeuze;

    public JuistOnjuistVraag(String vraagTekst, boolean correcteKeuze) {
        super(vraagTekst);
        this.correcteKeuze = correcteKeuze;
    }

    @Override
    boolean isVraagCorrect(String antwoord) {
        //TODO: implementation
        return true;
    }
}
