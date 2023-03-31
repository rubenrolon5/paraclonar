package Modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import java.io.Serializable;
@Entity
@Table(name = "persona")
public class Persona implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private String telefono;

    public Persona() {
    }

    public Persona(Integer id) {
        this.id = id;

    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre(){
        return nombre;

    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDireccion(){
        return direccion;

    }
    public void setDireccion(String direccion){
        this.direccion= direccion;
    }

    public String getTelefono(){
        return telefono;

    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    @Override
    public int hashCode(){
        int hash = 0;
        hash += (id!= null? id.hashCode():0);
        return hash;
    }
    @Override
    public boolean equals(Object object){

        if(!(object instanceof Persona)){
            return false;
        }
        Persona other =(Persona)object;
        if ((this.id == null && other.id!=null)||(this.id!=null && !this.id.equals(other.id))){
            return false;
        }
        return true;
    }
    @Override
    public String toString(){
        return "com.pasantia.AppPasantia.modelo.Persona[id="+id+"]";
    }
}


