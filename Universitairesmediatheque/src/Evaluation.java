public class Evaluation {
    private UV uv;
    private EnseignantChercheur enseignant;
    private Etudiant etudiant;
    private String date;
    private int note;

    public Evaluation(UV uv, EnseignantChercheur enseignant, Etudiant etudiant, String date, int note) {
        this.uv = uv;
        this.enseignant = enseignant;
        this.etudiant = etudiant;
        this.date = date;
        this.note = note;
    }

    // Getters et setters
    public UV getUv() {
        return uv;
    }

    public void setUv(UV uv) {
        this.uv = uv;
    }

    public EnseignantChercheur getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(EnseignantChercheur enseignant) {
        this.enseignant = enseignant;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
