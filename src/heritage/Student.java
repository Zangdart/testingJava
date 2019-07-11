package heritage;

public class Student extends Person {
	String programme;

	public Student(String nom, int anneeDeNaissance, String programme) {
		super(nom, anneeDeNaissance);
		this.programme = programme;
	}

	@Override
	public String toString() {
		return "le nom de l'etudiant  est : " + nom + " et son annee de naissance est : " + anneeDeNaissance
				+ " et son programme est " + programme;
	}

}
