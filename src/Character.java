public class Character {
    private String name;
    private int LV;
    private int maxHP;
    private int HP;
    private int mana;
    private double speed;
    private double baseSpeed;
    private Sword sword;
    private Shield shield;

    public Character(String name){
        this.name = name;
        maxHP = 100;
        HP = maxHP;
        mana = 300;
        speed = 70;
        baseSpeed  = speed;
    }

    public void LVup(){
        System.out.println(name+" is LV.up!!! GG EZ.");
        LV++;
        maxHP+=10;
        HP = maxHP;
        mana+=1000;
        baseSpeed+=40.5;
        speedCompute();
    }

    public void SwordLVup(){
        if(sword != null){
            sword.LVup();
            System.out.println(name+"'s sword is LV.up!!!");
            speedCompute();
        }else{
            System.out.println(name+" don't have a sword!!!");
        }

    }

    public void ShieldLVup(){
        if(shield != null){
            shield.LVup();
            System.out.println(name+"'s shield is LV.up!!!");
            speedCompute();
        }else{
            System.out.println(name+" don't have a sword!!!");
        }
    }

    public void equipSword(){
        if(sword != null){
            System.out.println(name+" already have a sword!!!");
        } else {
            System.out.println(name+" equips a sword!!!");
            sword = new Sword();
            speed -= sword.getWeight();
        }
    }
    public void equipShield(){
        if(shield != null){
            System.out.println(name+" already have a shield!!!");
        } else {
            System.out.println(name+" equips a shield!!!");
            shield = new Shield();
            speed -= shield.getWeight();
        }
    }
    private void speedCompute(){
        speed = baseSpeed;
        if(sword != null){
            speed-=sword.getWeight();
        }
        if(shield != null){
            speed-=shield.getWeight();
        }
        if(speed<0){
            speed=0;
        }
    }

    public void attack(Character enemy){
        System.out.println(name+" attack "+enemy.name);
        int damage=0;
        if (sword!=null) {
            damage += sword.getDMG();
        }
        if (enemy.shield!=null) {
            damage -= enemy.shield.getDEF();
        }

        if(damage>0) {
            System.out.println(enemy.name+" is received "+damage+" damage.");
            enemy.HP -= damage;
        }
        else {
            System.out.println(enemy.name+" takes no damage.");
        }

        if (enemy.HP<=0) {
            enemy.HP=0;
            System.out.println(enemy.name+" is died");
        }
    }

    public void showStatus(){
        System.out.println("---------------- Hero Name : "+name+" ----------------");
        System.out.println("LV : "+LV);
        System.out.println("Hp : "+HP+"/"+maxHP);
        System.out.println("Mana : "+mana);
        System.out.println("Speed : "+speed);
        if(sword != null){
            sword.showStatus();
        }
        if(shield != null) {
            shield.showStatus();
        }
        System.out.println("--------------------------------------------------");
    }
}