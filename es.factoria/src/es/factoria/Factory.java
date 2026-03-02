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
        //comprobar que el trabajador no exista ya (por Dni)
        for (Worker i : workers) {
            if (pNewWorker.equals(i)) {
                SW = false;
            }
        }
        if (SW) {
            workers.add(pNewWorker);
        }
    }

    public List<Worker> getWorkers() {
        return workers;
    }
    public Worker getWorker(String pDni) throws NotFoundException {
        //comprobar que el trabajador no exista ya (por Dni)
        for (Worker i : workers) {
            if (i.getDni()== pDni) {
                return (i);
            }
        }
        throw new NotFoundException("EL DNI: " + pDni + " no se encontró");
    }
    public String listSalaryWorkers() {
        String msg = "";
        for (Worker w : workers) {
            msg += w.getName() + " " + w.getDni() + " " + w.getAddress() + "\n";
        }
        return msg;
    }
}
