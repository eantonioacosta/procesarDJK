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
@Table(name = "grupos")
@NamedQueries({
    @NamedQuery(name = "Grupo.findAll", query = "SELECT g FROM Grupo g"),
    @NamedQuery(name = "Grupo.findByIdGrupo", query = "SELECT g FROM Grupo g WHERE g.idGrupo = :idGrupo"),
    @NamedQuery(name = "Grupo.findByNombre", query = "SELECT g FROM Grupo g WHERE g.nombre = :nombre"),
    @NamedQuery(name = "Grupo.findByJornada", query = "SELECT g FROM Grupo g WHERE g.jornada = :jornada"),
    @NamedQuery(name = "Grupo.findByIndiceGrupo", query = "SELECT g FROM Grupo g WHERE g.indiceGrupo = :indiceGrupo")})
public class Grupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_grupo")
    private Integer idGrupo;
    private Integer nombre;
    private Integer jornada;
    @Column(name = "indice_grupo")
    private Integer indiceGrupo;
    @JoinColumn(name = "id_anio_lectivo", referencedColumnName = "id_anio_lectivo")
    @ManyToOne
    private AnioLectivo anioLectivo;
    @JoinColumns({
        @JoinColumn(name = "id_docente", referencedColumnName = "id_docente"),
        @JoinColumn(name = "id_docente", referencedColumnName = "id_docente")})
    @ManyToOne
    private Docente docente;
    @OneToMany(mappedBy = "grupo")
    private List<CargaAcademica> cargaAcademicaList;
    @OneToMany(mappedBy = "grupo")
    private List<Matricula> matriculaList;

    public Grupo() {
    }

    public Grupo(Integer idGrupo, Integer nombre, Integer jornada, Integer indiceGrupo, AnioLectivo anioLectivo, Docente docente) {
        this.idGrupo = idGrupo;
        this.nombre = nombre;
        this.jornada = jornada;
        this.indiceGrupo = indiceGrupo;
        this.anioLectivo = anioLectivo;
        this.docente = docente;
        cargaAcademicaList= new ArrayList<>();
        matriculaList = new ArrayList<>();
    }
    
    

    public Grupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public Integer getJornada() {
        return jornada;
    }

    public void setJornada(Integer jornada) {
        this.jornada = jornada;
    }

    public Integer getIndiceGrupo() {
        return indiceGrupo;
    }

    public void setIndiceGrupo(Integer indiceGrupo) {
        this.indiceGrupo = indiceGrupo;
    }

    public AnioLectivo getAnioLectivo() {
        return anioLectivo;
    }

    public void setAnioLectivo(AnioLectivo anioLectivo) {
        this.anioLectivo = anioLectivo;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public List<CargaAcademica> getCargaAcademicaList() {
        return cargaAcademicaList;
    }

    public void setCargaAcademicaList(List<CargaAcademica> cargaAcademicaList) {
        this.cargaAcademicaList = cargaAcademicaList;
    }

    public List<Matricula> getMatriculaList() {
        return matriculaList;
    }

    public void setMatriculaList(List<Matricula> matriculaList) {
        this.matriculaList = matriculaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGrupo != null ? idGrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupo)) {
            return false;
        }
        Grupo other = (Grupo) object;
        if ((this.idGrupo == null && other.idGrupo != null) || (this.idGrupo != null && !this.idGrupo.equals(other.idGrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNombreTexto() + " / jornada: " + getJornadaTexto() + " / Grupo: " + indiceGrupo;
    }
    
        public String getNombreTexto(){
        switch(nombre){
            case 0: return "Jardin";
            case 1: return "Transicion";
            case 2: return "Primero";
            case 3: return "Segundo";
            case 4: return "Tercero";
            case 5: return "Cuarto";
            case 6: return "Quinto";
            case 7: return "Sexto";
            case 8: return "Septimo";
            case 9: return "Octavo";
            case 10: return "Noveno";
            case 11: return "Decimo";
            case 12: return "Once";
            default: return "Otro";
        }
    }
    public String getJornadaTexto(){
        switch(jornada){
            case 1: return "Mañana";
            case 2: return "Tarde";
            case 3: return "Nocturna";
            default : return "Otra";
        }
    }
    
}
