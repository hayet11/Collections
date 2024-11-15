import java.util.HashSet;

public class EspritHashSet implements GestionEnseignant{

    public HashSet<Enseignant> hashSet = new HashSet<>();

    @Override
    public void ajouterEnseignant(Enseignant e) {
        hashSet.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return hashSet.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for(Enseignant e:hashSet){
            if (e.getId()==id)
                return true;
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        hashSet.remove(e);
    }

    @Override
    public void displayEnseignants() {
        for(Enseignant e:hashSet){
            System.out.println(e);
        }
    }
}
