package Registro.Uniminuto;


import Registro.Uniminuto.Usuario;

public interface UsuarioServidor {

	public boolean addUsuario(Usuario p);
	
	public boolean deleteUsuario(int id);
	
	public Usuario getUsuario(int id);
	
	public Usuario[] getAllUsuario();
}
