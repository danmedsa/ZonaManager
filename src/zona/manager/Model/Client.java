/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zona.manager.Model;

/**
 *
 * @author DanielMedina
 */
public class Client {
    String nombre, comentarios, repartidor, no_servir, tel, cel, email, calle, num, col, q_calles, interior, fecha_ingreso;
    int comida, refrigerio, cena;
    boolean activo;
    float cuenta;

    public void setName(String name) {
        this.nombre = name;
    }

    public void setAddress(String street, String number, String interno, String colonia, String calles) {
           this.calle = street;
           this.num = number;
           this.interior = interno;
           this.col = colonia;
           this.q_calles = calles;
    }

    public void setRepartidor(String rep) {
        this.repartidor = rep;
    }

    public void setComentarios(String comentario, String no_servir) {
        this.comentarios  = comentario;
        this.no_servir = no_servir;
    }

    public void pagoCliente(float pago) {
        this.cuenta -= pago;
    }

    public void agregarCuenta(float cuenta) {
        this.cuenta += cuenta;
    }

    public void setDieta(int comida, int refrigerio, int cena) {
        this.comida = comida;
        this.refrigerio = refrigerio;
        this.cena = cena;
    }
}
