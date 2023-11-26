public class Sword {
    private int LV;
    private int DMG;
    private double weight;

    public Sword(){
        DMG = 40;
        weight = 25;
    }

    public void LVup(){
        LV++;
        DMG+=20;
        weight+=10;
    }

    public void showStatus(){
        System.out.println("---------------- Sword ---------------------------");
        System.out.println("LV : "+LV);
        System.out.println("DMG : "+DMG);
        System.out.println("Weight : "+weight);
    }

    public int getDMG() {
        return DMG;
    }

    public double getWeight() {
        return weight;
    }
}