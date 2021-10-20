import java.util.ArrayList;
import java.util.Scanner;

public class ToetsUitvoerenExecutor {

    private int aantalVragen;
    private Student student;
    private Kennistoets kennistoets;
    private Toetsdeelname toetsdeelname;
    Scanner scanner = new Scanner(System.in);

    public void execute() {
        student = new Student("Marnix wildeman", "test");
        kennistoets = maakToets();
        toetsdeelname = deelnemenAanToets(student, kennistoets);

        studentMaaktToets();
    }

    private Kennistoets maakToets(){
        String naam = "Programmeer oefening";
        String tijd = tijdNaarString(1,0);
        ArrayList<Vraag> vragen = maakVragen();

        return new Kennistoets(naam, tijd, vragen);
    }

    private String tijdNaarString(int uur, int minuten){
        return uur +":"+minuten;
    }

    private ArrayList<Vraag> maakVragen(){

        ArrayList<Vraag> vragen = new ArrayList<Vraag>();

        Vraag juistOnjuistVraag = new JuistOnjuistVraag("Om een komma getal op te slaan, gebruik je het data-type float?", true);
        vragen.add(juistOnjuistVraag);
        aantalVragen++;

        ArrayList<String> mogelijkAntwoorden = new ArrayList<String>();
        mogelijkAntwoorden.add("Integer");
        mogelijkAntwoorden.add("String");
        mogelijkAntwoorden.add("Double");

        Vraag meerkeuzeVraag = new MeerkeuzeVraag("Welk data-type gebruik je om een stuk tekst op te slaan?", mogelijkAntwoorden, 1);
        vragen.add(meerkeuzeVraag);
        aantalVragen++;

        ArrayList<String> correcteSteekwoorden = new ArrayList<String>();
        correcteSteekwoorden.add("hoofdletters");

        Vraag kortAntwoordVraag = new KortAntwoordVraag("Hoe moet je final variables opschrijven?", correcteSteekwoorden);
        vragen.add(kortAntwoordVraag);
        aantalVragen++;

        return vragen;
    }

    private Toetsdeelname deelnemenAanToets(Student student, Kennistoets kennistoets){
        return new Toetsdeelname(student, kennistoets);
    }

    private void studentMaaktToets(){
        for(int i = 0; i < aantalVragen; i++){
            Vraag vraag = kennistoets.toonVraag(i);
            String antwoord = scanner.nextLine();
            toetsdeelname.beantwoordVraag(vraag, antwoord);
        }
    }
}
