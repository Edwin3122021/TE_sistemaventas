
package com.emergentes.modelo;

import java.sql.Date;

public class Ventaplan {
   
    private int id_venta_plan;
    private int id_vendedor;
    private int id_automovil;
    private int id_cliente;
    private float total;
    private float monto_cuota;
    private Date fecha_adjudicacion;
    private String vendedor;
    private String automovil;
    private String cliente;

    public Ventaplan() {
    }

    public int getId_venta_plan() {
        return id_venta_plan;
    }

    public void setId_venta_plan(int id_venta_plan) {
        this.id_venta_plan = id_venta_plan;
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

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getMonto_cuota() {
        return monto_cuota;
    }

    public void setMonto_cuota(float monto_cuota) {
        this.monto_cuota = monto_cuota;
    }

    public Date getFecha_adjudicacion() {
        return fecha_adjudicacion;
    }

    public void setFecha_adjudicacion(Date fecha_adjudicacion) {
        this.fecha_adjudicacion = fecha_adjudicacion;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getAutomovil() {
        return automovil;
    }

    public void setAutomovil(String automovil) {
        this.automovil = automovil;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Ventaplan{" + "id_venta_plan=" + id_venta_plan + ", id_vendedor=" + id_vendedor + ", id_automovil=" + id_automovil + ", id_cliente=" + id_cliente + ", total=" + total + ", monto_cuota=" + monto_cuota + ", fecha_adjudicacion=" + fecha_adjudicacion + ", vendedor=" + vendedor + ", automovil=" + automovil + ", cliente=" + cliente + '}';
    }
    
    
}
