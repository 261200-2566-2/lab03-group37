public class Main {
    public static void main(String[] args) {
        Character c = new Character("Shin");
        c.showStatus();

        c.LVup();
        c.showStatus();

        c.equipSword();
        c.showStatus();

        c.equipShield();
        c.showStatus();

        c.SwordLVup();
        c.SwordLVup();
        c.SwordLVup();
        c.SwordLVup();
        c.SwordLVup();
        c.SwordLVup();

        Character firstkakwa = new Character("first");
        firstkakwa.equipShield();
        firstkakwa.equipSword();
        firstkakwa.LVup();
        firstkakwa.showStatus();

        firstkakwa.attack(c);
        c.showStatus();
        c.attack(firstkakwa);
        firstkakwa.showStatus();
    }
}