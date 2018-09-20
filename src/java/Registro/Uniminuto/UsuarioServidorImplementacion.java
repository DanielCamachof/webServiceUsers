package Registro.Uniminuto;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.jws.WebService;
import Registro.Uniminuto.Usuario;

@WebService(serviceName = "UsuarioServidorImplementacion")
public class UsuarioServidorImplementacion implements UsuarioServidor {

	private static Map<Integer,Usuario> Usuarios = new HashMap<Integer,Usuario>();
	
	@Override
	public boolean addUsuario(Usuario p) {
		if(Usuarios.get(p.getId()) != null) return false;
		Usuarios.put(p.getId(), p);
                
		return true;
	}

	@Override
	public boolean deleteUsuario(int id) {
		if(Usuarios.get(id) == null) return false;
		Usuarios.remove(id);
		return true;
	}

	@Override
	public Usuario getUsuario(int id) {
		return Usuarios.get(id);
	}

	@Override
	public Usuario[] getAllUsuario() {
		Set<Integer> ids = Usuarios.keySet();
		Usuario[] p = new Usuario[ids.size()];
		int i=0;
		for(Integer id : ids){
			p[i] = Usuarios.get(id);
			i++;
		}
		return p;
	}

}
