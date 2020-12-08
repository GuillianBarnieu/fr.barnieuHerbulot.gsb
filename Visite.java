package fr.barnieu.gsb.classesMetier;
import java.util.Date;

public class Visite
{
    private int id;
    private int idPrac;
    private Date dateVisite;
    private Date dateRapport;
    private String motif;
    private String bilan;
    private int idConf;

    public Visite(int id, int idPrac, Date dateVisite, Date dateRapport, String motif, String bilan, int idConf)
    {
        this.id = id;
        this.idPrac = idPrac;
        this.dateVisite = dateVisite;
        this.dateRapport = dateRapport;
        this.motif = motif;
        this.bilan = bilan;
        this.idConf = idConf;
    }

    public String confString()
    {
        int val = this.getIdConf();
        String res = "Pas d'id connu";
        switch (val){
            case 1:
                res = "convaincu";
                break;
            case 2:
                res = "hésitant";
                break;
            case 3:
                res = "non convaincu";
                break;
        }
        return res;
    }

    public int getIdConf() {
        return idConf;
    }

    public void setIdConf(int idConf)
    {
        this.idConf = idConf;
    }
}
