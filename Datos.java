/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proye01.controller;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author diana
 */
public class Datos {

    Scanner lectura = new Scanner(System.in);

    public String cedula = "";
    public String nombre = "";
    public String apellido = "";
    public int edad = 0;
    public String correo = "";
    public String telefono = "";
    public String direccion = "";

    public String tipo_asiento = "";
    public String vendedor = "";
    public String asientoE = "";
    public String fecha = "";

    public Datos(String cedula, String nombre, String apellido, int edad, String correo, String telefono, String direccion, String tipo_asiento, String vendedor, String asientoE, String fecha) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipo_asiento = tipo_asiento;
        this.vendedor = vendedor;
        this.asientoE = asientoE;
        this.fecha = fecha;

    }

    public Scanner getLectura() {
        return lectura;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTipo_asiento() {
        return tipo_asiento;
    }

    public String getVendedor() {
        return vendedor;
    }

    public String getAsientoE() {
        return asientoE;
    }

    public String getFecha() {
        return fecha;
    }

    public void setLectura(Scanner lectura) {
        this.lectura = lectura;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCorreo(String correo) {
        int arroba = correo.indexOf("@");

        if (arroba > 0) {
            int punto = correo.indexOf(".", arroba);
            if (punto >= arroba + 2) {
                // csolano40412@ufide. = el contenido después del . es nulo
                String dominio = correo.substring(punto + 1);
                if (dominio != null && dominio.length() > 0) {
                    this.correo = correo;
                    return;
                }
            }
        }

        System.out.println("El correo es inválido.");
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;

    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTipo_asiento(String tipo_asiento) {
        this.tipo_asiento = tipo_asiento;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public void setAsientoE(String asientoE) {
        this.asientoE = asientoE;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
