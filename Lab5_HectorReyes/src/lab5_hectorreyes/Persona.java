/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_hectorreyes;

/**
 *
 * @author Onasis Reyes
 */
public class Persona {

    private String nacionalidad, nombre, apellido;
    private Pais pais;
    private int edad;
    private String genero, vocacion, tituloUni, tieneCovid;

    public Persona() {
    }

    public Persona(String nacionalidad, String nombre, String apellido, Pais pais, int edad, String genero, String vocacion, String tituloUni, String tieneCovid) {
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.edad = edad;
        this.genero = genero;
        this.vocacion = vocacion;
        this.tituloUni = tituloUni;
        this.tieneCovid = tieneCovid;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getVocacion() {
        return vocacion;
    }

    public void setVocacion(String vocacion) {
        this.vocacion = vocacion;
    }

    public String getTituloUni() {
        return tituloUni;
    }

    public void setTituloUni(String tituloUni) {
        this.tituloUni = tituloUni;
    }

    public String getTieneCovid() {
        return tieneCovid;
    }

    public void setTieneCovid(String tieneCovid) {
        this.tieneCovid = tieneCovid;
    }

    @Override
    public String toString() {
        return "Persona{" + "nacionalidad=" + nacionalidad + ", nombre=" + nombre + ", apellido=" + apellido + ", pais=" + pais + ", edad=" + edad + ", genero=" + genero + ", vocacion=" + vocacion + ", tituloUni=" + tituloUni + ", tieneCovid=" + tieneCovid + '}';
    }

}
