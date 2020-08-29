/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_hectorreyes;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Onasis Reyes
 */
public class Pais {

    private String nombrePais;
    private Date fechaFun;
    private String nombreHimno;
    private Color color;

    public Pais() {
    }

    public Pais(String nombrePais, Date fechaFun, String nombreHimno, Color color) {
        this.nombrePais = nombrePais;
        this.fechaFun = fechaFun;
        this.nombreHimno = nombreHimno;
        this.color = color;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public Date getFechaFun() {
        return fechaFun;
    }

    public void setFechaFun(Date fechaFun) {
        this.fechaFun = fechaFun;
    }

    public String getNombreHimno() {
        return nombreHimno;
    }

    public void setNombreHimno(String nombreHimno) {
        this.nombreHimno = nombreHimno;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return nombrePais;
    }

}
