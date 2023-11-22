public class Shield {
    private int LV;
    private int DEF;
    private double weight;

    public Shield(){
        DEF = 20;
        weight = 30;
    }
    public void LVup(){
        LV++;
        DEF+=18;
        weight+=15;
    }

    public void showStatus(){
        System.out.println("---------------- Shield --------------------------");
        System.out.println("LV : "+LV);
        System.out.println("DEF : "+DEF);
        System.out.println("Weight : "+weight);
    }

    public int getDEF() {
        return DEF;
    }

    public double getWeight() {
        return weight;
    }
}