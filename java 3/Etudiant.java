public class Etudiant {
    private String nom;
    private double moyenne;
    private String avis;
    private Notation[] notes; 


    public Etudiant(String nom, Notation[] notes) {
        this.nom = nom;
        this.notes = notes;
        this.moyenne = calculerMoyenne(); 
        this.avis = donnerAvis();
    }

    private double calculerMoyenne() {
        double sommeNotes = 0;
        int sommeCoefs = 0;

        for (Notation n : notes) {
            sommeNotes += n.getNote() * n.getCoef();
            sommeCoefs += n.getCoef();
        }

        return sommeNotes / sommeCoefs;
    }

   
    private String donnerAvis() {
        if (moyenne >= 10)
            return "Admis";
        else if (moyenne >= 8)
            return "Rattrapage";
        else
            return "Refusé";
    }


    public void afficher() {
        System.out.println("Nom de l'étudiant : " + nom);
        System.out.println("Notes : ");
        for (Notation n : notes) {
            n.afficher();
        }
        System.out.printf("Moyenne : %.2f\n", moyenne);
        System.out.println("Avis : " + avis);
        System.out.println("----------------------------");
    }

 
    public double getMoyenne() {
        return moyenne;
    }

    public String getAvis() {
        return avis;
    }
}
