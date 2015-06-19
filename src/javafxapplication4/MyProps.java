/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Properties;

/**
 *
 * @author Dimitrios
 */
public class MyProps {

    public Properties props;
    public InputStream in;
    public OutputStream out;


    public MyProps() {

    }

    public MyProps(String propFileName) {
        try {
            props = new Properties();
            in = new FileInputStream(propFileName);//"propfile.properties" 
            props.load(in);
        } catch (NullPointerException npe) {
            System.out.println("NulPointerException");
        } catch (FileNotFoundException fnfe) {
            System.out.println("FileNotFound!");
        } catch (IOException ioe) {
            System.out.println("IOException");
        }
    }


    public void setMyProps() {

    }

    public String getMyProps(String pName) {
        return props.getProperty(pName);
    }

    public double getDoubleMyProps(String dName, double defaultVal) {
        double dVal = 0.0;
        String s = props.getProperty(dName);
        if (s == null) {
            System.out.println("Valeur par defaut");
            return defaultVal;      // SI LE NOM DU PARAMETRE EST INTROUVABLE RENVOI LA VALEUR PAR DEFAUT

        }
        try {
            dVal = Double.parseDouble(s);
        } catch (Exception e) {
            System.out.println("Ecxeption in 'MyProps.getDoubleMyProps' " + e.getMessage());
            return defaultVal;      //   SI ERREUR RENVOI LA VALEUR PAR DEFAUT
        }
        return dVal;                //  SINON S NON NUL ET PAS DEXCEPTION RETOURNE DVAL => FichierPorperties
    }

    public int getIntMyProps(String iName, int defaultVal) {
        int iVal = 0;
        String s = props.getProperty(iName);
        if (s == null) {
            System.out.println("Valeur par defaut");
            return defaultVal;
        }
        try {
            iVal = Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println("Ecxeption in 'MyProps.getIntMyProps' " + e.getMessage());
            return defaultVal;
        }
        return iVal;
    }

    public void setMyPropsVal(String pName, String pVal) {
        String s;
        s = (String) props.setProperty(pName, pVal);
        if (s == null) {
            System.out.println("Pas TROUVE " + pName);
        } else {
            System.out.println("OV de  " + pName + " etait de " + s);
        }
    }

    public void setDoubleMyPropsVal(String pName, double pVal) {
        String sVal = null;
        try {
            sVal = String.format(Locale.ENGLISH, "%.3f", sVal);//"%.3f" as fmt
            System.out.println("sVal :" + sVal);
        } catch (NullPointerException npe) {
            System.out.println("NullPointerException");
        }
        String s;
        s = (String) props.setProperty(pName, sVal);
        if (s == null) {
            System.out.println(pName + "introuvable");
        }
    }

    public void setIntMyPropsVal(String pName, int pVal) {
        String sVal = null;
        try {
            sVal = String.format(Locale.ENGLISH, "%.0f", sVal);//"%.3f" as fmt
        } catch (NullPointerException npe) {
            System.out.println("NullPointerException");
        }
        String s;
        s = (String) props.setProperty(pName, sVal);
        if (s == null) {
            System.out.println(pName + "introuvable");
        }
    }
    public void SaveMyProps(){
        out =null;
        try{
            out = new FileOutputStream("MyProperties.properties");
        }catch (FileNotFoundException fnfe) {
            System.out.println("FileNotFOundException in MyProps.SaveMyProps " + fnfe.getMessage());
        }
        try{
            props.store(out, null);
        }catch (IOException ioe){
            System.out.println("IOException in MyProps.SaveMyProps "+ ioe.getMessage());
        }
    }
}
