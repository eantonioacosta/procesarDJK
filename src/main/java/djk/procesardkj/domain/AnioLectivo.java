/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djk.procesardkj.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author ENOR ACOSTA
 */
@Entity
@Table(name = "anios_lectivos")
@NamedQueries({
    @NamedQuery(name = "AnioLectivo.findAll", query = "SELECT a FROM AnioLectivo a"),
    @NamedQuery(name = "AnioLectivo.findByIdAnioLectivo", query = "SELECT a FROM AnioLectivo a WHERE a.idAnioLectivo = :idAnioLectivo"),
    @NamedQuery(name = "AnioLectivo.findByNombre", query = "SELECT a FROM AnioLectivo a WHERE a.nombre = :nombre")})
public class AnioLectivo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_anio_lectivo")
    private Integer idAnioLectivo;
    @Size(max = 45)
    private String nombre;
    @OneToMany(mappedBy = "anioLectivo")
    private List<Grupo> grupoList;
    @OneToMany(mappedBy = "anioLectivo")
    private List<CargaAcademica> cargaAcademicaList;

    public AnioLectivo() {
        grupoList = new ArrayList<>();
        cargaAcademicaList = new ArrayList<>();
    }

    public AnioLectivo(Integer idAnioLectivo) {
        this.idAnioLectivo = idAnioLectivo;
        grupoList = new ArrayList<>();
        cargaAcademicaList = new ArrayList<>();
    }

    public AnioLectivo(Integer idAnioLectivo, String nombre) {
        this.idAnioLectivo = idAnioLectivo;
        this.nombre = nombre;
        grupoList = new ArrayList<>();
        cargaAcademicaList = new ArrayList<>();
    }

    public Integer getIdAnioLectivo() {
        return idAnioLectivo;
    }

    public void setIdAnioLectivo(Integer idAnioLectivo) {
        this.idAnioLectivo = idAnioLectivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Grupo> getGrupoList() {
        return grupoList;
    }

    public void setGrupoList(List<Grupo> grupoList) {
        this.grupoList = grupoList;
    }

    public List<CargaAcademica> getCargaAcademicaList() {
        return cargaAcademicaList;
    }

    public void setCargaAcademicaList(List<CargaAcademica> cargaAcademicaList) {
        this.cargaAcademicaList = cargaAcademicaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnioLectivo != null ? idAnioLectivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnioLectivo)) {
            return false;
        }
        AnioLectivo other = (AnioLectivo) object;
        if ((this.idAnioLectivo == null && other.idAnioLectivo != null) || (this.idAnioLectivo != null && !this.idAnioLectivo.equals(other.idAnioLectivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "djk.procesardkj.domain.AnioLectivo[ idAnioLectivo=" + idAnioLectivo + " ]";
    }
    
}
