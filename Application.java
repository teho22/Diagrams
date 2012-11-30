import java.util.ArrayList;
public class Application {
	public ArrayList <Projet> lp;
	
	Application(){
		addProjet();
	}
	
	public void addProjet(){
		Projet p=new Projet();
		lp.add(p);
	}
	public void removeProjet(Projet p){
		lp.remove(p);
	}
	
}
