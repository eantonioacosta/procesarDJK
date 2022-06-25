/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djk.procesardkj.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ENOR ACOSTA
 */
@Entity
@Table(name = "padres")
@NamedQueries({
    @NamedQuery(name = "Padre.findAll", query = "SELECT p FROM Padre p"),
    @NamedQuery(name = "Padre.findByIdPadre", query = "SELECT p FROM Padre p WHERE p.idPadre = :idPadre"),
    @NamedQuery(name = "Padre.findByTipoId", query = "SELECT p FROM Padre p WHERE p.tipoId = :tipoId"),
    @NamedQuery(name = "Padre.findByNombres", query = "SELECT p FROM Padre p WHERE p.nombres = :nombres"),
    @NamedQuery(name = "Padre.findByApellidos", query = "SELECT p FROM Padre p WHERE p.apellidos = :apellidos"),
    @NamedQuery(name = "Padre.findByTelefono", query = "SELECT p FROM Padre p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Padre.findByCorreo", query = "SELECT p FROM Padre p WHERE p.correo = :correo")})
public class Padre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "id_padre")
    private String idPadre;
    @Column(name = "tipo_id")
    private Integer tipoId;
    @Size(max = 90)
    private String nombres;
    @Size(max = 90)
    private String apellidos;
    @Size(max = 45)
    private String telefono;
    @Size(max = 45)
    private String correo;
    @OneToMany(mappedBy = "padre")
    private List<Estudiante> estudianteList;
    @OneToMany(mappedBy = "padre1")
    private List<Estudiante> estudianteList1;

    public Padre() {
    }

    public Padre(String idPadre) {
        this.idPadre = idPadre;
    }

    public String getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(String idPadre) {
        this.idPadre = idPadre;
    }

    public Integer getTipoId() {
        return tipoId;
    }

    public void setTipoId(Integer tipoId) {
        this.tipoId = tipoId;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Estudiante> getEstudianteList() {
        return estudianteList;
    }

    public void setEstudianteList(List<Estudiante> estudianteList) {
        this.estudianteList = estudianteList;
    }

    public List<Estudiante> getEstudianteList1() {
        return estudianteList1;
    }

    public void setEstudianteList1(List<Estudiante> estudianteList1) {
        this.estudianteList1 = estudianteList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPadre != null ? idPadre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Padre)) {
            return false;
        }
        Padre other = (Padre) object;
        if ((this.idPadre == null && other.idPadre != null) || (this.idPadre != null && !this.idPadre.equals(other.idPadre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "djk.procesardkj.domain.Padre[ idPadre=" + idPadre + " ]";
    }
    
}
