package gestion_nom;
import java.util.ArrayList;

 
public class ListEtudiant extends ArrayList<Etudiant>
    {
	  public boolean add(Etudiant e) {
		  if(this.contains(e)) return false;
		  return super.add(e);
	  }
    }
