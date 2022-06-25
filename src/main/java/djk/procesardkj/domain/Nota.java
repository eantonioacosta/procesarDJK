/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djk.procesardkj.domain;

import java.io.Serializable;
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
import javax.persistence.Table;

/**
 *
 * @author ENOR ACOSTA
 */
@Entity
@Table(name = "notas")
@NamedQueries({
    @NamedQuery(name = "Nota.findAll", query = "SELECT n FROM Nota n"),
    @NamedQuery(name = "Nota.findByIdNotas", query = "SELECT n FROM Nota n WHERE n.idNotas = :idNotas"),
    @NamedQuery(name = "Nota.findByPeriodoUno", query = "SELECT n FROM Nota n WHERE n.periodoUno = :periodoUno"),
    @NamedQuery(name = "Nota.findByPeriodoDos", query = "SELECT n FROM Nota n WHERE n.periodoDos = :periodoDos"),
    @NamedQuery(name = "Nota.findByPeriodoTres", query = "SELECT n FROM Nota n WHERE n.periodoTres = :periodoTres"),
    @NamedQuery(name = "Nota.findByPeriodoCuatro", query = "SELECT n FROM Nota n WHERE n.periodoCuatro = :periodoCuatro"),
    @NamedQuery(name = "Nota.findByNivelacionUno", query = "SELECT n FROM Nota n WHERE n.nivelacionUno = :nivelacionUno"),
    @NamedQuery(name = "Nota.findByNivelacionDos", query = "SELECT n FROM Nota n WHERE n.nivelacionDos = :nivelacionDos"),
    @NamedQuery(name = "Nota.findByNivelacionTres", query = "SELECT n FROM Nota n WHERE n.nivelacionTres = :nivelacionTres"),
    @NamedQuery(name = "Nota.findByNivelacionCuatro", query = "SELECT n FROM Nota n WHERE n.nivelacionCuatro = :nivelacionCuatro"),
    @NamedQuery(name = "Nota.findByFinal1", query = "SELECT n FROM Nota n WHERE n.final1 = :final1"),
    @NamedQuery(name = "Nota.findByIdObservacionUno", query = "SELECT n FROM Nota n WHERE n.idObservacionUno = :idObservacionUno"),
    @NamedQuery(name = "Nota.findByIdObservacionDos", query = "SELECT n FROM Nota n WHERE n.idObservacionDos = :idObservacionDos"),
    @NamedQuery(name = "Nota.findByIdObservacionTres", query = "SELECT n FROM Nota n WHERE n.idObservacionTres = :idObservacionTres"),
    @NamedQuery(name = "Nota.findByIdObservacionCuatro", query = "SELECT n FROM Nota n WHERE n.idObservacionCuatro = :idObservacionCuatro")})
public class Nota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_notas")
    private Integer idNotas;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "periodo_uno")
    private Float periodoUno;
    @Column(name = "periodo_dos")
    private Float periodoDos;
    @Column(name = "periodo_tres")
    private Float periodoTres;
    @Column(name = "periodo_cuatro")
    private Float periodoCuatro;
    @Column(name = "nivelacion_uno")
    private Float nivelacionUno;
    @Column(name = "nivelacion_dos")
    private Float nivelacionDos;
    @Column(name = "nivelacion_tres")
    private Float nivelacionTres;
    @Column(name = "nivelacion_cuatro")
    private Float nivelacionCuatro;
    @Column(name = "final")
    private Float final1;
    @Column(name = "id_observacion_uno")
    private Integer idObservacionUno;
    @Column(name = "id_observacion_dos")
    private Integer idObservacionDos;
    @Column(name = "id_observacion_tres")
    private Integer idObservacionTres;
    @Column(name = "id_observacion_cuatro")
    private Integer idObservacionCuatro;
    @JoinColumn(name = "id_carga", referencedColumnName = "id_carga")
    @ManyToOne
    private CargaAcademica cargaAcademica;
    @JoinColumns({
        @JoinColumn(name = "id_estudiante", referencedColumnName = "id_estudiante"),
        @JoinColumn(name = "id_estudiante", referencedColumnName = "id_estudiante")})
    @ManyToOne
    private Estudiante estudiante;
    @JoinColumn(name = "id_matricula", referencedColumnName = "id_matricula")
    @ManyToOne
    private Matricula matricula;

    public Nota() {
    }

    public Nota(Integer idNotas) {
        this.idNotas = idNotas;
    }

    public Integer getIdNotas() {
        return idNotas;
    }

    public void setIdNotas(Integer idNotas) {
        this.idNotas = idNotas;
    }

    public Float getPeriodoUno() {
        return periodoUno;
    }

    public void setPeriodoUno(Float periodoUno) {
        this.periodoUno = periodoUno;
    }

    public Float getPeriodoDos() {
        return periodoDos;
    }

    public void setPeriodoDos(Float periodoDos) {
        this.periodoDos = periodoDos;
    }

    public Float getPeriodoTres() {
        return periodoTres;
    }

    public void setPeriodoTres(Float periodoTres) {
        this.periodoTres = periodoTres;
    }

    public Float getPeriodoCuatro() {
        return periodoCuatro;
    }

    public void setPeriodoCuatro(Float periodoCuatro) {
        this.periodoCuatro = periodoCuatro;
    }

    public Float getNivelacionUno() {
        return nivelacionUno;
    }

    public void setNivelacionUno(Float nivelacionUno) {
        this.nivelacionUno = nivelacionUno;
    }

    public Float getNivelacionDos() {
        return nivelacionDos;
    }

    public void setNivelacionDos(Float nivelacionDos) {
        this.nivelacionDos = nivelacionDos;
    }

    public Float getNivelacionTres() {
        return nivelacionTres;
    }

    public void setNivelacionTres(Float nivelacionTres) {
        this.nivelacionTres = nivelacionTres;
    }

    public Float getNivelacionCuatro() {
        return nivelacionCuatro;
    }

    public void setNivelacionCuatro(Float nivelacionCuatro) {
        this.nivelacionCuatro = nivelacionCuatro;
    }

    public Float getFinal1() {
        return final1;
    }

    public void setFinal1(Float final1) {
        this.final1 = final1;
    }

    public Integer getIdObservacionUno() {
        return idObservacionUno;
    }

    public void setIdObservacionUno(Integer idObservacionUno) {
        this.idObservacionUno = idObservacionUno;
    }

    public Integer getIdObservacionDos() {
        return idObservacionDos;
    }

    public void setIdObservacionDos(Integer idObservacionDos) {
        this.idObservacionDos = idObservacionDos;
    }

    public Integer getIdObservacionTres() {
        return idObservacionTres;
    }

    public void setIdObservacionTres(Integer idObservacionTres) {
        this.idObservacionTres = idObservacionTres;
    }

    public Integer getIdObservacionCuatro() {
        return idObservacionCuatro;
    }

    public void setIdObservacionCuatro(Integer idObservacionCuatro) {
        this.idObservacionCuatro = idObservacionCuatro;
    }

    public CargaAcademica getCargaAcademica() {
        return cargaAcademica;
    }

    public void setCargaAcademica(CargaAcademica cargaAcademica) {
        this.cargaAcademica = cargaAcademica;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNotas != null ? idNotas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nota)) {
            return false;
        }
        Nota other = (Nota) object;
        if ((this.idNotas == null && other.idNotas != null) || (this.idNotas != null && !this.idNotas.equals(other.idNotas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "djk.procesardkj.domain.Nota[ idNotas=" + idNotas + " ]";
    }
    
}
