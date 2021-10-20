import java.util.ArrayList;
import java.util.stream.IntStream;

public class Kennistoets {
    private String toetsNaam;
    private String tijd;
    private ArrayList<Vraag> vragen;
    private String eindTijd;

    public Kennistoets(String toetsNaam, String tijd, ArrayList<Vraag> vragen){
        this.toetsNaam = toetsNaam;
        this.tijd = tijd;
        this.vragen = vragen;
    }

    public Vraag toonVraag(int vraagnummer){
        Vraag vraag = vragen.get(vraagnummer);

        String vraagTekst = vraag.getVraagTekst();
        System.out.println("Vraag: " + vraagTekst);

        if(vraag instanceof MeerkeuzeVraag ){
            ArrayList<String> mogelijkeAntwoorden =  ((MeerkeuzeVraag) vraag).getMogelijkeAntwoorden();

            int lengte = mogelijkeAntwoorden.size();
            IntStream.range(0,lengte)
                    .forEach(index -> System.out.println((index + 1) + ". " + mogelijkeAntwoorden.get(index)));

            System.out.println("[1-" + lengte + "]:");
        }
        else if (vraag instanceof KortAntwoordVraag){
            System.out.println("[]:");
        }
        else if (vraag instanceof JuistOnjuistVraag){
            System.out.println("[true/false]:");
        }
        return vraag;
    }
}
