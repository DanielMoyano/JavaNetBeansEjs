/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.factoria;

/**
 *
 * @author Daniel Moyano
 */
public class Salesman extends Worker{
    private double salesMonth;
    private static final double COMISSION = 5;
    private static final double SALARYBASE = 1300;
    private Executive executive;
    
    public Salesman(String pName, String pAddress, String pDni) {
        super(pName, pAddress, pDni);
    }
    
    public boolean hasExecutive() {
        return executive != null;
    }
    
    public Executive getExecutive() {
        return executive;
    }
    
    public void setExecutive(Executive pExecutive) {
        this.executive = pExecutive;
    }
    
    public double getSalesMonth() {
        return this.salesMonth;
    }
    
    public void changeMonth() {
        this.salesMonth = 0;
    }
    
    public void newSale (double pSale) {
        this.salesMonth += pSale;
    }
    @Override
    public double computeSalary() {
        this.setSalary(SALARYBASE + Math.round(Math.round(salesMonth * COMISSION /100 )));
        return this.getSalary();
    }
    
}
