package question3;

/**
 * NFP121 TpIntroduction, usage de BlueJ et du "Submitter".
 * 
 * @version septembre 2009
 * @author à compléter
 * @see java.lang.String, java.lang.Math
 */
public class AuditeurCNAM {
    /** l'attribut nom de chaque auditeur. */
    private String nom;
    /** l'attribut prenom de chaque auditeur. */
    private String prenom;
    /** l'attribut matricule de chaque auditeur. */
    private String matricule;

    /**
     * "Création", le constructeur d'un auditeur avec son nom, son prénom et son
     * matricule.
     * 
     * @param nom
     *            le nom de l'auditeur
     * @param prenom
     *            son prénom
     * @param matricule
     *            sur la carte d'inscription, près de la photo
     */
    public AuditeurCNAM(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    /**
     * le login au Cnam : 6 premières lettres du nom suivies de la première
     * lettre du prénom séparées de '_' . le login retourné est en minuscules,
     * le trait d'union, ou spéciaux <i>(pour unix)</i> sont remplacés par des
     * '_' pas de caractères accentués pour le login voir les classes
     * prédéfines, java.lang.String : les méthodes replaceAll, toLowerCase et
     * substring java.lang.Math : la méthode min<br>
     * <b>BlueJ : Menu Aide</b>
     * 
     * @return le login du Cnam simplifié, sans les adaptations dues aux
     *         homonymes...
     */
    public String login() {
        //functionn edited hereeeeeee
         String login = "";
        String nom1 = nom.substring(0,6);
        String prenom1 = prenom.substring(0,1);
        login = nom1 +"_" +prenom1;
        login = login.toLowerCase();
        login = login.replaceAll("[^a-zA-Z0-9]+","_");
        login = login.replaceAll("[^\\p{ASCII}]", "");
        for(int i=0;i<nom1.length();i++){
            if (!Character.isDigit(nom1.charAt(i))&& !Character.isLetter(nom1.charAt(i))) {
                login = login.substring(0, i)+"_"+login.substring(i+1);
            }
        }
        for(int i=0;i<prenom1.length();i++){
            if (!Character.isDigit(prenom1.charAt(i))&& !Character.isLetter(prenom1.charAt(i))) {
                login = login.substring(0, i)+"_"+login.substring(i+1);
            }
        }
        //login = Normalizer.normalize(login, Normalizer.Form.NFD);
        login = login.replaceAll("[^\\p{ASCII}]", "e");
        return login;// à compléter
    }

    /**
     * Lecture du nom de l'auditeur.
     * 
     * @return son nom
     */
    public String nom() {
        return null;
    }

    /**
     * Lecture du prénom de l'auditeur.
     * 
     * @return son prénom
     */
    public String prenom() {
        return null;
    }

    /**
     * Lecture du matricule de l'auditeur.
     * 
     * @return son matricule
     */
    public String matricule() {
        return null;
    }

    /**
     * méthode toString ( méthode redéfinie de la classe Object).
     * 
     * @return la concaténation du nom, du prénom et du login, selon cette
     *         syntaxe
     *         <code>nom() + " " + prenom() +  " login : " + login()</code>
     */
    @Override
    public String toString() {
        return nom() + " " + prenom() + " login : " + login();
    }

}
