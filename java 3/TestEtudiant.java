public class TestEtudiant {
    public static void main(String[] args) {
        
        Notation[] notesMarcus = {
            new Notation(12, 2),
            new Notation(15, 3),
            new Notation(9, 1)
        };

        
        Etudiant e1 = new Etudiant("Marcus", notesMarcus);

        
        e1.afficher();
    }
}
