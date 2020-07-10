package calcul;
package com.csys.DemandeA.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import org.junit.Assert;
public class calcul {
	


	    
	 public void Verif_methode_Htaxe(float quantité, Double prix, Double remise, Double prix_htaxe) throws Exception {

	        DecimalFormat df = new DecimalFormat();
	        // df.setMaximumFractionDigits(8); //8 chiffre apres la virgule
	        double expectedprixhorxtaxe1 = (prix * quantité) - ((prix * quantité * remise) / 100);

	        BigDecimal bd = new BigDecimal(expectedprixhorxtaxe1);
	        bd = bd.setScale(7, BigDecimal.ROUND_HALF_DOWN);
	        expectedprixhorxtaxe1 = bd.doubleValue();
	        /*  System.out.println("prix UNITAIRE :" + prix);
	        System.out.println("remise :" + remise);
	        System.out.println("prix hors taxe :" + prix_htaxe);
	        System.out.println("expectedprixhorxtaxe1:" + expectedprixhorxtaxe1);*/
	        Assert.assertEquals("Erreur en prix hors taxe", prix_htaxe, expectedprixhorxtaxe1, 0.0000000);
	        Thread.sleep(3000);

	    }

	    public void Verif_methode_totalremise(float quantité, Double prix, Double remise, Double totalremise) throws Exception {

	        Double expectedtotalremise = ((prix * quantité * remise) / 100);
	        BigDecimal bd = new BigDecimal(expectedtotalremise);
	        bd = bd.setScale(7, BigDecimal.ROUND_HALF_DOWN);
	        expectedtotalremise = bd.doubleValue();
	        /*  System.out.println("PRIX :" + prix);
	        System.out.println("remise :" + remise);
	        System.out.println("totalremise:" + totalremise);*/
	        System.out.println("expectedtotalremise:" + expectedtotalremise);
	        Assert.assertEquals("Erreur en total remise ", totalremise, expectedtotalremise, 0);
	        Thread.sleep(3000);

	    }

	    public void CalculHorsTaxe0(float prixreelHtaxe0, float prixHtaxe) throws Exception {
	        /* System.out.println("prixreelHtaxe0 :" + prixreelHtaxe0);
	        System.out.println("prixHtaxe :" + prixHtaxe);*/
	        Assert.assertEquals("Erreur en total  Hors Taxe base 0  ", prixreelHtaxe0, prixHtaxe, 0);
	        Thread.sleep(3000);

	    }

	    public void CalculTaxe0(float prixreelHtaxe0) throws Exception {
	        System.out.println("Verification total  Calcul  Taxe base 0 ");
	        Assert.assertEquals("Erreur en total  base 0  ", prixreelHtaxe0, 0, 0);
	        Thread.sleep(3000);

	    }

	    public void CalculHorsTaxe14(float prixreelHtaxe14, float prixHtaxe) throws Exception {
	        // float ftva14 = Float.parseFloat(prixreelHtaxe14.getText().trim());
	        System.out.println("Verification total  Calcul Hors Taxe base 14 ");
	        System.out.println("prixreelHtaxe14 :" + prixreelHtaxe14);
	        System.out.println("prixHtaxe :" + prixHtaxe);

	        System.out.println("Verification total  Calcul  HORS Taxe base 14 ");
	        Assert.assertEquals("Erreur en total  Hors Taxe base 14  ", prixreelHtaxe14, prixHtaxe, 0);
	        Thread.sleep(3000);

	    }

	    public void CalculTaxe14(Double prixHtaxe, Double prixtaxe14) throws Exception {

	        System.out.println(" Debut Verification total  taxe14 ");
	        Double expectedtva14 = (prixHtaxe * 14) / 100;
	        BigDecimal bd = new BigDecimal(expectedtva14);
	        bd = bd.setScale(7, BigDecimal.ROUND_HALF_DOWN);
	        expectedtva14 = bd.doubleValue();
	        System.out.println("Verification total  taxe14 ");
	        System.out.println("prixHtaxe :" + prixHtaxe);
	        System.out.println("prixtaxe14 :" + prixtaxe14);
	        System.out.println("calcul verif  :" + expectedtva14);
	        //verification de calcul 
	        Assert.assertEquals("Erreur en total le calcul de taux tva 14   ", prixtaxe14, expectedtva14, 0);
	        Thread.sleep(3000);
	    }

	    public void CalculHorsTaxe5(float prixreelHtaxe5, float prixHtaxe) throws Exception {

	        System.out.println("Verification total  Calcul Hors Taxe base 5 ");
	        System.out.println("prixreelHtaxe5  :" + prixreelHtaxe5);
	        System.out.println("prixHtaxe :" + prixHtaxe);
	        Assert.assertEquals("Erreur en total  Hors Taxe base 5  ", prixreelHtaxe5, prixHtaxe, 0);
	        Thread.sleep(3000);
	    }

	    public void CalculTaxe5(Double prixHtaxe, Double prixtaxe5) throws Exception {

	        System.out.println(" Debut Verification total  taxe5 ");
	        Double expectedtva5 = (prixHtaxe * 5) / 100;
	        BigDecimal bd = new BigDecimal(expectedtva5);
	        bd = bd.setScale(7, BigDecimal.ROUND_HALF_DOWN);
	        expectedtva5 = bd.doubleValue();
	        System.out.println("Verification total  taxe5 ");
	        System.out.println("prixHtaxe :" + prixHtaxe);
	        System.out.println("prixtaxe5 :" + prixtaxe5);
	        System.out.println("calcul verif 5 :" + expectedtva5);
	        //verification de calcul 
	        Assert.assertEquals("Erreur en total le calcul de taux tva 5:  ", prixtaxe5, expectedtva5, 0);
	        Thread.sleep(3000);
	    }

	    public void totalhorstaxe(Double prixHtaxe14, Double prixHtaxe0, Double prixHtaxe5, Double prixHtaxe10, Double totalHtaxe) throws Exception {

	        System.out.println(" Debut Verification total hors taxe ");
	        Double expectedtotal = prixHtaxe14 + prixHtaxe0 + prixHtaxe5 + prixHtaxe10;
	        BigDecimal bd = new BigDecimal(expectedtotal);
	        bd = bd.setScale(7, BigDecimal.ROUND_HALF_DOWN);
	        expectedtotal = bd.doubleValue();
	        System.out.println("Verification total  taxe ");
	        System.out.println("prixHtaxe14 :" + prixHtaxe14);
	        System.out.println("prixHtaxe0 :" + prixHtaxe0);
	        System.out.println("prixHtaxe5 :" + prixHtaxe5);
	        System.out.println("prixHtaxe10 :" + prixHtaxe10);
	        System.out.println("totalHtaxe :" + totalHtaxe);
	        System.out.println("calcul verif totalHtaxe Expected  :" + expectedtotal);
	        //verification de calcul 
	        Assert.assertEquals("Erreur en total le calcul de taux tva 5:  ", expectedtotal, totalHtaxe, 0);
	        Thread.sleep(3000);
	    }
	}


}
