package djk.procesardkj.controller;

import djk.procesardkj.datos.UsuarioJpaController;
import djk.procesardkj.datos.exceptions.NonexistentEntityException;
import djk.procesardkj.domain.Usuario;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ControllerUsuario {

    UsuarioJpaController dao;

    public ControllerUsuario() {
        dao = new UsuarioJpaController();
    }

    public void registrar(Usuario usuario) throws Exception, NullPointerException {
        if (usuario.getCodigo().trim().length() == 0) {
            throw new NullPointerException("Contraseña vacia");
        }
        if (usuario.getClave().trim().length() == 0) {
            throw new NullPointerException("Contraseña vacia");
        }
        if(usuario.getNivelUsuario()==0 || usuario.getNivelUsuario()==-1){
            throw new NullPointerException("Favor seleccionar el nivel");
        }
        dao.create(usuario);
    }

    public void actualizar(Usuario usuario) throws Exception, NonexistentEntityException {
        dao.edit(usuario);
    }

    public void eliminar(String codigo) throws Exception {
        dao.destroy(codigo);
    }

    public List<Usuario> verUsuarios() throws SQLException {
        return dao.findUsuarioEntities();
    }

    public Usuario buscarPorCodigo(String codigo) throws Exception {
        return dao.findUsuario(codigo);
    }

    public Usuario iniciarSesion(String codigo, String clave) throws Exception, NullPointerException {
        if (codigo.trim().length() == 0) {
            throw new NullPointerException("Codigo del usuario vacio");
        }
        if (clave.trim().length() == 0) {
            throw new NullPointerException("Contraseña vacia");
        }

        Usuario usuario = dao.findUsuario(codigo);

        if (usuario != null) {
            if (usuario.getClave().equals(clave)) {
                return usuario;
            } else {
                throw new NullPointerException("La contraseña no coincide");
            }
        }
        throw new NullPointerException("El usuario con el codigo: " + codigo + "\n No existe!");
    }

    public DefaultTableModel getTabla() throws Exception {
        String[] columnas = {"CODIGO", "NOMBRE", "CLAVE", "NIVEL USUARIO"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);

        String[] fila = new String[columnas.length];
        for (Usuario usuario : verUsuarios()) {
            fila[0] = usuario.getCodigo();
            fila[1] = usuario.getNombre();
            fila[2] = usuario.getClave();
            fila[3] = usuario.getNivelUsuarioText();

            modelo.addRow(fila);
        }
        return modelo;
    }
}
