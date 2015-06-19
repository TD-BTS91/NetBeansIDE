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
public class Mob {

    String mName;
    double mRegen = 0.0;
    double mArmor = 0.0;
    double mSpeed = 0.0;
    int mHP = 0;
    int mLvl = 0;

    public Mob() {
        MyProps mProps = new MyProps("Ennemy.properties");
        System.out.println(" MobSpeed: " + mProps.getDoubleMyProps("MSPEED", 1.0)
                + " MobArmor: " + mProps.getDoubleMyProps("MARMOR", 10.0)
                + " MobRegen: " + mProps.getDoubleMyProps("MREGEN", 5.0)
                + " MobHP: " + mProps.getIntMyProps("MHP", 15)
                + " MobLvl: " + mProps.getIntMyProps("MLVL", 1));
    }

    public Mob(String tName) {
        MyProps mProps = new MyProps("Ennemy.properties");
        System.out.println(" MobSpeed: " + mProps.getDoubleMyProps("MSPEED", 1.0)
                + " MobArmor: " + mProps.getDoubleMyProps("MARMOR", 10.0)
                + " MobRegen: " + mProps.getDoubleMyProps("MREGEN", 5.0)
                + " MobHP: " + mProps.getIntMyProps("MHP", 15)
                + " MobLvl: " + mProps.getIntMyProps("MLVL", 1));
        this.mName = tName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public double getmRegen() {
        return mRegen;
    }

    public void setmRegen(double mRegen) {
        this.mRegen = mRegen;
    }

    public double getmArmor() {
        return mArmor;
    }

    public void setmArmor(double mArmor) {
        this.mArmor = mArmor;
    }

    public int getmLvl() {
        return mLvl;
    }

    public void setmLvl(int mLvl) {
        this.mLvl = mLvl;
    }

    public double getmSpeed() {
        return mSpeed;
    }

    public void setmSpeed(double mSpeed) {
        this.mSpeed = mSpeed;
    }

}
