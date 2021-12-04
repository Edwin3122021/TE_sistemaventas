
package com.emergentes.modelo;

import java.sql.Date;


public class Pagocuota {
    
    private int id_cuota;
    private int id_venta_plan;
    private Date fecha_vencimiento;
    private Date fecha_pago;
    private float monto;
    private String venta_plan;

    public Pagocuota() {
    }

    public int getId_cuota() {
        return id_cuota;
    }

    public void setId_cuota(int id_cuota) {
        this.id_cuota = id_cuota;
    }

    public int getId_venta_plan() {
        return id_venta_plan;
    }

    public void setId_venta_plan(int id_venta_plan) {
        this.id_venta_plan = id_venta_plan;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getVenta_plan() {
        return venta_plan;
    }

    public void setVenta_plan(String venta_plan) {
        this.venta_plan = venta_plan;
    }

    @Override
    public String toString() {
        return "Pagocuota{" + "id_cuota=" + id_cuota + ", id_venta_plan=" + id_venta_plan + ", fecha_vencimiento=" + fecha_vencimiento + ", fecha_pago=" + fecha_pago + ", monto=" + monto + ", venta_plan=" + venta_plan + '}';
    }
    
    
}
