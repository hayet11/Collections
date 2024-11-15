import java.util.TreeSet;

public class EspritTreeSet implements GestionEnseignant {

    public TreeSet<Enseignant> treeSet = new TreeSet<>();

    @Override
    public void ajouterEnseignant(Enseignant e) {
        treeSet.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return treeSet.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for(Enseignant e : treeSet){
            if(e.getId()==id)
                return true;
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        treeSet.remove(e);
    }

    @Override
    public void displayEnseignants() {
        for(Enseignant e : treeSet){
            System.out.println(e);
        }
    }
}
