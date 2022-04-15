package gestion_nom;
import java.util.List;
public interface Condition {
	public boolean est_vrai (Etudiant e);
	public List<Etudiant>filtrer(Condition c);
	
	
	

}
