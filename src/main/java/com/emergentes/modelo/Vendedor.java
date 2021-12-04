
package com.emergentes.modelo;

public class Vendedor {
    
    private int id_vendedor;
    private String apellido_paterno;
    private String apellido_materno;
    private String nombres;
    private String cargo;
    private String fecha_ingreso;

    public Vendedor() {
    }

   
    
    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "id_vendedor=" + id_vendedor + ", apellido_paterno=" + apellido_paterno + ", apellido_materno=" + apellido_materno + ", nombres=" + nombres + ", cargo=" + cargo + ", fecha_ingreso=" + fecha_ingreso + '}';
    }
    
    
    

}
