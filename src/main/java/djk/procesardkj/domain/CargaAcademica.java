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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ENOR ACOSTA
 */
@Entity
@Table(name = "carga_academica")
@NamedQueries({
    @NamedQuery(name = "CargaAcademica.findAll", query = "SELECT c FROM CargaAcademica c"),
    @NamedQuery(name = "CargaAcademica.findByIdCarga", query = "SELECT c FROM CargaAcademica c WHERE c.idCarga = :idCarga")})
public class CargaAcademica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_carga")
    private Integer idCarga;
    @OneToMany(mappedBy = "cargaAcademica")
    private List<Nota> notaList;
    @JoinColumn(name = "id_anio_lectivo", referencedColumnName = "id_anio_lectivo")
    @ManyToOne
    private AnioLectivo anioLectivo;
    @JoinColumn(name = "id_asignatura", referencedColumnName = "id_asignatura")
    @ManyToOne
    private Asignatura asignatura;
    @JoinColumns({
        @JoinColumn(name = "id_docente", referencedColumnName = "id_docente"),
        @JoinColumn(name = "id_docente", referencedColumnName = "id_docente")})
    @ManyToOne
    private Docente docente;
    @JoinColumn(name = "id_grupo", referencedColumnName = "id_grupo")
    @ManyToOne
    private Grupo grupo;

    public CargaAcademica() {
    }

    public CargaAcademica(Integer idCarga) {
        this.idCarga = idCarga;
    }

    public Integer getIdCarga() {
        return idCarga;
    }

    public void setIdCarga(Integer idCarga) {
        this.idCarga = idCarga;
    }

    public List<Nota> getNotaList() {
        return notaList;
    }

    public void setNotaList(List<Nota> notaList) {
        this.notaList = notaList;
    }

    public AnioLectivo getAnioLectivo() {
        return anioLectivo;
    }

    public void setAnioLectivo(AnioLectivo anioLectivo) {
        this.anioLectivo = anioLectivo;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCarga != null ? idCarga.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CargaAcademica)) {
            return false;
        }
        CargaAcademica other = (CargaAcademica) object;
        if ((this.idCarga == null && other.idCarga != null) || (this.idCarga != null && !this.idCarga.equals(other.idCarga))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "djk.procesardkj.domain.CargaAcademica[ idCarga=" + idCarga + " ]";
    }
    
}
