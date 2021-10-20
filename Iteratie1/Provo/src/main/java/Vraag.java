public abstract class Vraag {
    protected String vraagTekst;

    public Vraag(String vraagTekst){
        this.vraagTekst = vraagTekst;
    }

    public String getVraagTekst(){
        return vraagTekst;
    }

    abstract boolean isVraagCorrect(String antwoord);
}
