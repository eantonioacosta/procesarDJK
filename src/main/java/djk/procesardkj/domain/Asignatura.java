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
import javax.persistence.ManyToOne;
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
@Table(name = "asignaturas")
@NamedQueries({
    @NamedQuery(name = "Asignatura.findAll", query = "SELECT a FROM Asignatura a"),
    @NamedQuery(name = "Asignatura.findByIdAsignatura", query = "SELECT a FROM Asignatura a WHERE a.idAsignatura = :idAsignatura"),
    @NamedQuery(name = "Asignatura.findByNombre", query = "SELECT a FROM Asignatura a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Asignatura.findByIHoraria", query = "SELECT a FROM Asignatura a WHERE a.iHoraria = :iHoraria"),
    @NamedQuery(name = "Asignatura.findByNombreCompleto", query = "SELECT a FROM Asignatura a WHERE a.nombreCompleto = :nombreCompleto"),
    @NamedQuery(name = "Asignatura.findByPorcentaje", query = "SELECT a FROM Asignatura a WHERE a.porcentaje = :porcentaje")})
public class Asignatura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)    
    @Column(name = "id_asignatura")
    private Integer idAsignatura;
    @Size(max = 45)
    private String nombre;
    @Column(name = "i_horaria")
    private Integer iHoraria;
    @Size(max = 90)
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    private Integer porcentaje;
    @JoinColumn(name = "id_area", referencedColumnName = "id_area")
    @ManyToOne
    private Area area;
    @OneToMany(mappedBy = "asignatura")
    private List<CargaAcademica> cargaAcademicaList;

    public Asignatura() {
    }

    public Asignatura(Integer idAsignatura, String nombre, Integer iHoraria, String nombreCompleto, Integer porcentaje, Area area) {
        this.idAsignatura = idAsignatura;
        this.nombre = nombre;
        this.iHoraria = iHoraria;
        this.nombreCompleto = nombreCompleto;
        this.porcentaje = porcentaje;
        this.area = area;
        this.cargaAcademicaList = new ArrayList<>();
    }
    

    public Asignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIHoraria() {
        return iHoraria;
    }

    public void setIHoraria(Integer iHoraria) {
        this.iHoraria = iHoraria;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
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
        hash += (idAsignatura != null ? idAsignatura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asignatura)) {
            return false;
        }
        Asignatura other = (Asignatura) object;
        if ((this.idAsignatura == null && other.idAsignatura != null) || (this.idAsignatura != null && !this.idAsignatura.equals(other.idAsignatura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "djk.procesardkj.domain.Asignatura[ idAsignatura=" + idAsignatura + " ]";
    }
    
}
