package Registro.Uniminuto;

import java.io.Serializable;

public class Usuario implements Serializable{

	private static final long serialVersionUID = -5577579081118070434L;
	
	private String Nombre;
        private String Apellido;
	private int Edad;
	private int id;
        private String Email;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }  

	
	
	@Override
	public String toString(){
		return id+"::"+Nombre+"::"+Apellido+"::"+Email;
	}
}