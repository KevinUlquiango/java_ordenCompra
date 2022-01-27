package com.test;

import com.clases.Cliente;
import com.clases.OrdenCompra;
import com.clases.Producto;

import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra ordenUno = new OrdenCompra("Viveres");
        Cliente clienteUno = new Cliente("Luisito", " Comunica");
        ordenUno.setCliente(clienteUno);
        ordenUno.setFecha(new Date());
        ordenUno.addProducto(new Producto("La Favorita", "Leche", 12))
                .addProducto(new Producto("Coca Cola", "Fanta", 3))
                .addProducto(new Producto("Ferrero", "Nutela", 6))
                .addProducto(new Producto("Durex", "Condones", 3));

        OrdenCompra ordenDos = new OrdenCompra("Repuestos PC");
        Cliente clienteDos = new Cliente("Erika", "Maritnes");
        ordenDos.setFecha(new Date());
        ordenDos.setCliente(clienteDos);
        ordenDos.addProducto(new Producto("Nexus", "Ventilador", 10))
                .addProducto(new Producto("Intel", "Procesador", 50))
                .addProducto(new Producto("Samsung", "Monitor", 880))
                .addProducto(new Producto("Acer", "Mouse", 10));


        OrdenCompra ordenTres = new OrdenCompra("Celulares");
        Cliente clienteTres = new Cliente("Mishell", "Guambi");
        ordenTres.setFecha(new Date());
        ordenTres.setCliente(clienteTres);
        ordenTres.addProducto(new Producto("Samsung", "A50", 300))
                .addProducto(new Producto("Xiaomi", "Note 9", 800))
                .addProducto(new Producto("Claro","Aspire 6",610))
                .addProducto(new Producto("Huawei","Y30",500));

        OrdenCompra[] totalOrdenes = {ordenUno, ordenDos, ordenTres};
        for (OrdenCompra orden : totalOrdenes
        ) {
            Producto[] Productos = orden.getProducto();
            String listadoProductos = "";
            for (Producto producto : Productos
            ) {
                if (producto != null) {
                    listadoProductos += ("\n\t" + producto);
                }
            }

            StringBuffer concatenar = new StringBuffer();
            concatenar.append("\n=====================================\n");
            concatenar.append("Id:" + orden.getIdentificador() + "\n");
            concatenar.append("Cliente: " + orden.getCliente() + "\n");
            concatenar.append("Descripcion: " + orden.getDescripcion() + "\n");
            concatenar.append("Fecha: " + orden.getFecha() + "\n");
            concatenar.append("Productos: " + listadoProductos + "\n");
            concatenar.append("Total: " + orden.granTotal());
            concatenar.append("\n=====================================");
            System.out.println(concatenar);
        }

    }
}
