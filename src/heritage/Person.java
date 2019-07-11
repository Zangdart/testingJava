package heritage;

public class Person {
	String nom;
	int anneeDeNaissance; 
	
	public Person(String nom , int anneeDeNaissance) {
		this.nom = nom;
		this.anneeDeNaissance = anneeDeNaissance;
	}
	

	@Override
	public String toString() {
		return  "le nom de la personne  est : " + nom + " et son annee de naissance est : "
				+ anneeDeNaissance;
	}
}
