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
public class Factory {
    private String name;
    private List<Worker> workers;
    public Factory() {
        this.workers = new ArrayList<Worker>();
    }
    public Factory(String pName) {
        this(); //hace uso del constructor vacío para inicializar la lista de "workers"
        this.name = pName;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        this.name = pName;
    }
    public void addWorker(Worker pNewWorker) {
        boolean SW = true;
        for (Worker i : workers) {
            if (pNewWorker.equals(i)) {
                SW = false;
            }
        }
        if (SW) {
            workers.add(pNewWorker);
        }
        
        
    }
}
