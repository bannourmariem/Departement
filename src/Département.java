public class Département {

    private int id ;
    private  String nom_departement ;
    private  int nbr_employes ;

    public Département(int id , String nom_departement , int nbr_employes) {
        this.id=id ;
        this.nbr_employes =nbr_employes ;
        this.nom_departement=nom_departement ;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNom_departement() {
        return nom_departement;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    public int getNbr_employes() {
        return nbr_employes;
    }

    public void setNbr_employes(int nbr_employes) {
        this.nbr_employes = nbr_employes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Département departement)) return false;
        return getId() == departement.getId() && getNom_departement().equals(departement.getNom_departement());
    }

    @Override
    public String toString() {
        return super.toString() +"id" +id +" nom_departement" +nom_departement +" nbr_employes" +nbr_employes;
    }
}
