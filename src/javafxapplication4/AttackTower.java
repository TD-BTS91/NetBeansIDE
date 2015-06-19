/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

/**
 *
 * @author Dimitrios
 */
public class AttackTower {

    String tName;
    double tARange = 0.0;
    double tADmg = 0.0;
    double tASpeed = 0.0;
    int tLvl = 0;

    public AttackTower() {
        MyProps tProps = new MyProps("Towers.properties");
        System.out.println(" TowerSpeed: " + tProps.getDoubleMyProps("TSPEED", 1.0)
                + " TowerRange: " + tProps.getDoubleMyProps("TRANGE", 10.0)
                + " TowerDamage: " + tProps.getDoubleMyProps("TDMG", 5.0)
                + " TowerLvl: " + tProps.getIntMyProps("TLVL", 1));
    }

    public AttackTower(String tName) {
        MyProps tProps = new MyProps("Towers.properties");
        System.out.println(" TowerSpeed: " + tProps.getDoubleMyProps("TSPEED", 1.0)
                + " TowerRange: " + tProps.getDoubleMyProps("TRANGE", 10.0)
                + " TowerDamage: " + tProps.getDoubleMyProps("TDMG", 5.0)
                + " TowerLvl: " + tProps.getIntMyProps("TLVL", 1));
        this.tName = tName;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public double gettARange() {
        return tARange;
    }

    public void settARange(double tARange) {
        this.tARange = tARange;
    }

    public double gettADmg() {
        return tADmg;
    }

    public void settADmg(double tADmg) {
        this.tADmg = tADmg;
    }

    public int gettLvl() {
        return tLvl;
    }

    public void settLvl(int tLvl) {
        this.tLvl = tLvl;
    }

    public double gettASpeed() {
        return tASpeed;
    }

    public void settASpeed(double tASpeed) {
        this.tASpeed = tASpeed;
    }

}
