public class App {
    public static void main(String[] args) throws Exception {
        String[] ch = new String[] { "bdccd" };
        TokenManager tm = new TokenManager(ch);
        Parseur p = new Parseur(tm);
        if (p.valider()) {
            System.out.println(ch[0] + " est valide");
        } else
            System.out.println(ch[0] + " n'est pas valide");
    }
}
