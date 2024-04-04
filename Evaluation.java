package fr.voix.admin;

public class Evaluation {
	private int numero ;
	private int Note ;
	private String Commentaire ; 
	private int NbJaime;
	private boolean Validité ;
	
	public Evaluation(int numero, int Note, String Commentaire, int NbJaime, boolean Validité) {
		super();
		this.numero = numero;
		this.Note = Note;
		this.Commentaire = Commentaire;
		this.NbJaime = NbJaime;
		this.Validité = Validité;
	}
		
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNote() {
		return Note;
	}
	public void setNote(int note) {
		Note = note;
	}
	public String getCommentaire() {
		return Commentaire;
	}
	public void setCommentaire(String commentaire) {
		Commentaire = commentaire;
	}
	public int getNbJaime() {
		return NbJaime;
	}
	public void setNbJaime(int nbJaime) {
		NbJaime = nbJaime;
	}
	public boolean isValidité() {
		return Validité;
	}
	public void setValidité(boolean validité) {
		Validité = validité;
	}
	@Override
	public String toString() {
		return "Evaluation [numero=" + numero + ", Note=" + Note + ", Commentaire=" + Commentaire + ", NbJaime="
				+ NbJaime + ", Validité=" + Validité + "]";
	}
	public void AjoutJaime (int TotalJaime) {
		NbJaime = NbJaime + TotalJaime;
	}
}
	

