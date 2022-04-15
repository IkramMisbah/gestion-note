package gestion_nom;



public class Etudiant implements Comparable<Etudiant> {
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
     public int compareTO (Etudiant e)
     {
    	 if(this.note==e.note) return 0;
 		if(this.note>e.note) return 1;
 		return -1;
     }
 	 
}
