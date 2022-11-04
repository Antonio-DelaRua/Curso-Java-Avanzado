package ObjetosYDirectivaDeMenorConocimiento.DTO;


import java.util.ArrayList;

public class Usuarios {
    ArrayList<Usuario> usuarios = new ArrayList();

    public Usuario ObetenerUsuario(String name) {
        for (Usuario usuario : usuarios) {
            if (usuario.nombre == name) {
                return usuario;
            }
        }
    return null;
        }
        public void meterUsuario (Usuario usuario) {
            usuarios.add(usuario);

        }


        }