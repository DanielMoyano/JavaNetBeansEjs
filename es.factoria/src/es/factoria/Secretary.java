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
public class Secretary extends Worker {
    private Executive executive;
    private static final double SALARYBASE = 1200;

    public Secretary(String pName, String pAddress, String pDni) {
        super(pName, pAddress, pDni);
    }

    @Override
    public double computeSalary() {
        setSalary(SALARYBASE);
        return getSalary();
    }
    
    
    public void setExecutive(Executive pExecutive) {
        this.executive = pExecutive;
    }
    
    public Executive getExecutive() {
        return executive;
    }
    
    
    public boolean hasExecutive() {
        return executive != null;
    }
    
    
    
    
}
