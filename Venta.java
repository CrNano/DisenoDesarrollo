/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc202.proyecto.controller;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class Venta 
{
   int edades = 0;
    int n=0;
    String cedulas = "",
            nombres = "",
            apellidos = "",
            correos = "",
            telefonos = "",
            direcciones = "",
            tipo_asientos = "",
            vendedores = "",
            asientoE = "",
            fechas = "";

    Datos vector [ ];

    Scanner lectura = new Scanner(System.in);

    double asientos;
    TipoAsientos tipoAsientos;
    TipoVendedor tipoVendedores;
    String solicitud;
    String respuesta;

    public void setTamanio(int tam) {
        if (tam > 0) {
            vector = new Datos[tam];
        }
    }

    public int getTamanio() {
        return vector.length;

    }
 //box sirve para resumir el código.
    public String box(String texto) {
        return JOptionPane.showInputDialog(texto);
    }

    public void Ingresar() {
         //Menú
        int metodo;
        metodo = Integer.parseInt(box("Elija el metodo de compra [1] - VENTANILLA [2] - INTERNET"));

        if (metodo == 1) {
            tipoVendedores = TipoVendedor.VENTANILLA;
            elecasiento();
        } else {
            tipoVendedores = TipoVendedor.INTERNET;
            elecasiento();
        }

    }

    public void elecasiento() {

        int opcion = 0;
        //Menú
        opcion = Integer.parseInt(box("Elija el tipo de asiento [1] - NORMAL [2] - VIP"));

        if (opcion == 1) {
            tipoAsientos = TipoAsientos.NORMAL;

            AsientoN();

        } else {

            tipoAsientos = TipoAsientos.VIP;

            AsientoV();

        }

    }
    void AsientoN() {
        int valor;
        valor = Integer.parseInt(box("Cuantos asietos va a solicitar: "));
        for (int i = 0; i < valor; i++) {
            solicitud = box("Escriba el asiento que va a comprar");
        }
        cliente();

    }

    void AsientoV() {
        int valor;

        valor = Integer.parseInt(box("Cuantos asietos va a solicitar: "));
        for (int i = 0; i < valor; i++) {
            solicitud = box("Escriba el asiento que va a comprar");
        }

        cliente();

    }

    void cliente() {
        Datos datos;
        int i, edad = 0;

        String cedula = "", nombre = "", apellido = "", correo = "", telefono = "", direccion = "", tipo_asiento = "", vendedor = "", asientoE = "", fecha = "";

        for (i = 0; i < 1; i++) {
            cedula = box("Cedula:");
            cedulas = cedula;
            nombre = box("Nombre:");
            nombres = nombre;
            apellido = box("Apellido:");
            apellidos = apellido;
            edad = Integer.parseInt(box("Edad:"));
            edades = edad;
            correo = box("Correo:");
            correos = correo;
            telefono = box("Telefono:");
            telefonos=telefono;
            direccion = box("Direccion:");
            direcciones=direccion;    
            tipo_asiento = tipoAsientos.toString();
            vendedor = tipoVendedores.toString();
            asientoE = solicitud;
            fecha = box("Fecha de compra:");
            fechas=fecha;
            datos = new Datos(cedula, nombre, apellido, edad, correo, telefono, direccion, tipo_asiento, vendedor, asientoE, fecha);
            vector[n] = datos;
            n++;

        }
        

    }
    
    String Respuestas(){
        respuesta = "Cedula: " + cedulas+
                "\nNombre: " + nombres + 
                "\nApellido: " + apellidos +
                "\nEdad: " + edades +
                "\nCorreo: " + correos+
                "\nTelofono: " + telefonos + 
                "\nDirecion: " + direcciones +
                "\nTipo Asiento: " + tipoAsientos +
                "\nTipo Vendedor: " + tipoVendedores +
                "\nAsiento: " + solicitud +
                "\nFecha: " + fechas ;
        return respuesta;
    }
    


    public void buscarPorFecha(String fecha) {
        int i;
        String info = "Listado por fecha\n";
        for (i = 0; i < getTamanio(); i++) {
            if (vector[i].getFecha().equals(fecha)) {
                info += "Cedula: " + vector[i].getCedula() + "\n";
                info += "Nombre: " + vector[i].getNombre() + "\n";
                info += "Apellido: " + vector[i].getApellido() + "\n";
                info += "Edad: " + vector[i].getEdad() + "\n";
                info += "Correo: " + vector[i].getCorreo() + "\n";
                info += "Telefono: " + vector[i].getTelefono() + "\n";
                info += "Direccion: " + vector[i].getDireccion() + "\n";
                info += "Tipo Asiento: " + vector[i].getTipo_asiento() + "\n";
                info += "Tipo Venta: " + vector[i].getVendedor() + "\n";
                info += "Asiento: " + vector[i].getAsientoE() + "\n";
                info += "Fecha: " + vector[i].getFecha() + "\n";
            }

        }

        JOptionPane.showMessageDialog(null, info);
    }
    
}
