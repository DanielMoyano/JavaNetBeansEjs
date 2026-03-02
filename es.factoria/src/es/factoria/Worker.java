/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.factoria;

import java.util.Objects;

/**
 *
 * @author Daniel Moyano
 */
public abstract class Worker {
    private String name;
    private String dni;
    private String address;
    private double salary;

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Worker(String pName, String pAddress, String pDni ) {
        this.name = pName;
        this.address = pAddress;
        this.dni = pDni;
    }

    @Override
    public String toString() {
        return  name + ", " + dni + ", " + address;
    }

    //MÉTODO SIN MARCAR HASHCODE
    /*@Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }*/
    
    //MÉTODO MARCANDO HASHCODE (dni)
    /*@Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.dni);
        return hash;
    }*/

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Worker other = (Worker) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
    public abstract double computeSalary();
    
    
}
