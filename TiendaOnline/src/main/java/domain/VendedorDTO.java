/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author USUARIO
 */
public class VendedorDTO {
    private int id_vendedor;
    private String nombre;
    private int password;

    /**
     * @return the id_vendedor
     */
    public int getId_vendedor() {
        return id_vendedor;
    }

    /**
     * @param id_vendedor the id_vendedor to set
     */
    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the password
     */
    public int getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "VendedorDTO{" + "id_vendedor=" + id_vendedor + ", nombre=" + nombre + ", password=" + password + '}';
    }

   
    
}
