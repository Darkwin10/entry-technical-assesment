/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Fernando Darwin VazC
 */
public class AcrossYears {
    private int years;

    public AcrossYears() {
    }
    
    public int getYears() {
        return this.years;
    }

    public void setYears(int years) {
        this.years = years;
    }
    
    public int yearsToCenturies(int years)
    {
        this.years = years;
        //Expression to obtain century
        int century = (years/100)+1;
        return century;
    }

}
