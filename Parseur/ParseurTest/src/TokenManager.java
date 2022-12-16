import java.util.StringTokenizer;

public class TokenManager {
    int tCourant;// token en cours
    String entree;

    public TokenManager(String[] args) {
        StringTokenizer entree;
        public TokenManager(String )
    }

    public char getTokenSuivant() {
        if (tCourant < entree.length())
            return entree.charAt(tCourant++);
        else
            return '#';
    }
}