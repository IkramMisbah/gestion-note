package gestion_nom;

public class Etudiant {
     private int id;
     private String nom;
     private double note;
     public Etudiant() {
		this.id=id;
		this.nom=nom;
		this.note=10;
	}
     public String toString()
     {
    	 return "("+this.nom +":" +this.note+")";
     }
     public boolean equals(Object obj)
     {   if (!(obj instanceof Etudiant))
    	 return false;
    	 return ((Etudiant) obj).id== this.id;
     }
}
