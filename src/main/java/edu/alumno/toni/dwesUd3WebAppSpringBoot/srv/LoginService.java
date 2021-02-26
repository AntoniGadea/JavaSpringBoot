package edu.alumno.toni.dwesUd3WebAppSpringBoot.srv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.alumno.toni.dwesUd3WebAppSpringBoot.ram.Usuario;
import edu.alumno.toni.dwesUd3WebAppSpringBoot.util.Ts;

@Service
public class LoginService {
private static List<Usuario> usuarios= new ArrayList<Usuario>();
	
	static {
		usuarios.add(new Usuario("Antoni","AntoniGadea","AntoniG123.","tonigm.jpeg"));
	}
	
	public boolean usuarioValido(Usuario usuarioLogin) {
		for (Usuario usuario2 : usuarios) {
            if (usuario2.equals(usuarioLogin)) {
                return usuario2.getPassword().equals(usuarioLogin.getPassword());
            }
        }

        return false;
	}
	public Usuario encontrarUsuarioPorNickname(String nickname) {
		for (Usuario usuario : usuarios) {
			
			if (usuario.getNickname().equals(nickname))

				return usuario;
		}
		return null;
	}
	
	public void modificaUsuario(Usuario usuarioModificado, String usuarioModificacion){
		Usuario usuario = encontrarUsuarioPorNickname(usuarioModificacion);
		if(usuario != null) {
			for(int i = 0; i < usuarios.size(); i++) {
				if(usuarios.get(i).getNickname().contentEquals(usuarioModificado.getNickname())) {
					usuarioModificado.setTs(Ts.today());
					usuarioModificado.setUser(usuarioModificacion);
					usuarios.set(i, usuarioModificado);
					break;
				}
			}
		}
	}
}
