/*
 * Copyright (C) 2015 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.pdsw.samples.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author hcadavid
 */
public class Consulta implements Serializable{
    //el identificador es asignado por la base de datos,
    //por eso no se incluye en el constructor.
    private int id;
    
    private Date fechayHora;
    private String resumen;

    
    
    public Consulta(Date fechayHora, String resumen) {
        this.id=-1;
        this.fechayHora = fechayHora;
        this.resumen = resumen;
    }
    public Consulta(int id, Date fechayHora, String resumen) {
        this.id=id;
        this.fechayHora = fechayHora;
        this.resumen = resumen;
    }    
    
    public Consulta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechayHora() {
        return fechayHora;
    }

    public void setFechayHora(Date fechayHora) {
        this.fechayHora = fechayHora;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    @Override
    public String toString() {
        return "("+id+","+fechayHora+","+resumen+")"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        Consulta c= (Consulta)obj;
        return this.fechayHora.equals(c.getFechayHora()) && this.resumen.equalsIgnoreCase(c.getResumen());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.fechayHora);
        hash = 29 * hash + Objects.hashCode(this.resumen);
        return hash;
    }
    
    
}
