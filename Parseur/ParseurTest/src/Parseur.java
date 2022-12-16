import java.util.Stack;

public class Parseur {
    private TokenManager tm;
    private Stack<Character> pile;
    private char tokenCourant;

    public Parseur(TokenManager tm) {
        this.tm = tm;
        tokenSuivant();
        pile = new Stack<>();
        pile.push('$');
        pile.push('S');
    }

    private void tokenSuivant() {
        tokenCourant = tm.getTokenSuivant();
    }

    public boolean valider() {
        boolean termine = false;
        while (!termine) {
            switch (pile.peek()) {
                case 'S':
                    if (tokenCourant == 'b') {
                        pile.pop();
                        pile.push('A');
                        pile.push('B');
                        pile.push('C');
                        pile.push('D');
                        
                        tokenSuivant();
                    } else if (tokenCourant == 'c') {
                        pile.pop();
                        tokenSuivant();
                    } else
                        termine = true;
                    break;
                case 'A':
                    if (tokenCourant == 'b') {
                    	pile.pop();
                    	pile.push('A');
                        tokenSuivant();
                    } else if (tokenCourant == 'd') {
                        pile.pop();
                        tokenSuivant();
                    } else
                        termine = true;
                    break;
                case 'B':
                    if (tokenCourant == 'b') {
                        pile.pop();
                        pile.push('B');
                        tokenSuivant();
                    } else if (tokenCourant == 'c') {
                    	pile.pop();
                        tokenSuivant();
                    } else
                        termine = true;
                    break;
                case 'D':
                	if(tokenCourant=='d') {
                		pile.pop();
                		   tokenSuivant();
                    } else
                        termine = true;
                	break;
                case 'C':
                	if(tokenCourant=='c') {
                		pile.pop();
                		   tokenSuivant();
                    } else
                        termine = true;
                	break;
                	
                case '$':
                    termine = true;
                    break;
                default:
                    break;
            }
        }
        return (tokenCourant == '#' && pile.peek() == '$');
    }
}
