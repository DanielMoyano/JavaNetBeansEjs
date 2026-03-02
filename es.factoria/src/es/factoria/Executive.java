/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.factoria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Moyano
 */
public class Executive extends Worker {
    private static final double COMISSION = 2;
    private static final double SALARYBASE = 2500;
    private final List<Salesman> salesmen;
    private Secretary secretary;
    
    public Executive(String pName, String pAddress, String pDni) {
        super(pName, pAddress, pDni);
        this.salesmen = new ArrayList<>();
    }
    public void addSalesman(Salesman pNewSalesman) throws OverrideException {
        if (!pNewSalesman.hasExecutive()) {
            pNewSalesman.setExecutive(this);
            this.salesmen.add(pNewSalesman);
        }
        else {
            throw new OverrideException("ERROR: Salesman: " + pNewSalesman.getName() + "ya está asignado");
        }
    }
    @Override
    public double computeSalary() {
        double ventas = 0;
        for (Salesman emp : salesmen) {
            ventas += emp.getSalesMonth();
        }
        this.setSalary(SALARYBASE + Math.round(Math.round(ventas * COMISSION /100 )));
        return this.getSalary();    
    }
}
