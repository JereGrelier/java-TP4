package tec;

public abstract class MonterDansStandard extends PassagerAbstrait {
    public MonterDansStandard(String nom, int destination) {
        super(nom, destination);
    }

    public void monterDans(Autobus t) {
        if (t.aPlaceAssise()) {
            t.monteeDemanderAssis(this);
        } else if (t.aPlaceDebout()) {
            t.monteeDemanderDebout(this);
        }
    }
}
