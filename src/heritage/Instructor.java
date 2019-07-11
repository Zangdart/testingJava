package heritage;

public class Instructor extends Person {
	int salaire;

	public Instructor(String nom, int anneeDeNaissance, int salaire) {
		super(nom, anneeDeNaissance);
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "le nom du prof est : " + nom + " et son annee de naissance est : " + anneeDeNaissance
				+ " et son salaire est " + salaire;
	}
}
