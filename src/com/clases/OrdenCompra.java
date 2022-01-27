package com.clases;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrdenCompra {
    private int identificador;
    private String descripcion;
    private String fecha;
    private Cliente cliente;
    private Producto[] producto;
    private int contadorProductos;

    private static int contadorId;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.identificador = ++contadorId;
        this.producto = new Producto[4];
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;

    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProducto() {
        return producto;
    }

    public OrdenCompra addProducto(Producto producto) {
        if (contadorProductos < this.producto.length) {
            this.producto[contadorProductos++] = producto;
        }
        return this;
    }

    public void setFecha(Date fecha) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd MMMM, yyyy");
        this.fecha = formatoFecha.format(fecha);
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int granTotal() {
        int total = 0;
        for (Producto pro : producto
        ) {
            try{
                total += pro.getPrecio();
            }catch (Exception e){
                total = 0;
            }
        }
        return total;
    }
}
