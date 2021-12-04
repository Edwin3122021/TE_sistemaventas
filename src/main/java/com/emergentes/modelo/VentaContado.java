
package com.emergentes.modelo;

import java.sql.Date;

public class VentaContado {
    private int id_venta;
    private int id_cliente;
    private int id_vendedor;
    private int id_automovil;
    private float precio;
    private String fecha;
    private String cliente;
    private String automovil;
    private String vendedor;

    public VentaContado() {
    }

    
    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public int getId_automovil() {
        return id_automovil;
    }

    public void setId_automovil(int id_automovil) {
        this.id_automovil = id_automovil;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getAutomovil() {
        return automovil;
    }

    public void setAutomovil(String automovil) {
        this.automovil = automovil;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "VentaContado{" + "id_venta=" + id_venta + ", id_cliente=" + id_cliente + ", id_vendedor=" + id_vendedor + ", id_automovil=" + id_automovil + ", precio=" + precio + ", fecha=" + fecha + ", cliente=" + cliente + ", automovil=" + automovil + ", vendedor=" + vendedor + '}';
    }

  
}
