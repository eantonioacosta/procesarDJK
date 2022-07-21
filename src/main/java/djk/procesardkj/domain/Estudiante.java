/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djk.procesardkj.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ENOR ACOSTA
 */
@Entity
@Table(name = "estudiantes")
@NamedQueries({
    @NamedQuery(name = "Estudiante.findAll", query = "SELECT e FROM Estudiante e"),
    @NamedQuery(name = "Estudiante.findByIdEstudiante", query = "SELECT e FROM Estudiante e WHERE e.idEstudiante = :idEstudiante"),
    @NamedQuery(name = "Estudiante.findByIdentificacion", query = "SELECT e FROM Estudiante e WHERE e.identificacion = :identificacion"),
    @NamedQuery(name = "Estudiante.findByTipoId", query = "SELECT e FROM Estudiante e WHERE e.tipoId = :tipoId"),
    @NamedQuery(name = "Estudiante.findByEstado", query = "SELECT e FROM Estudiante e WHERE e.estado = :estado"),
    @NamedQuery(name = "Estudiante.findByExpedicion", query = "SELECT e FROM Estudiante e WHERE e.expedicion = :expedicion"),
    @NamedQuery(name = "Estudiante.findByPrimerNombre", query = "SELECT e FROM Estudiante e WHERE e.primerNombre = :primerNombre"),
    @NamedQuery(name = "Estudiante.findBySegundoNombre", query = "SELECT e FROM Estudiante e WHERE e.segundoNombre = :segundoNombre"),
    @NamedQuery(name = "Estudiante.findByPrimerApellido", query = "SELECT e FROM Estudiante e WHERE e.primerApellido = :primerApellido"),
    @NamedQuery(name = "Estudiante.findBySegundoApellido", query = "SELECT e FROM Estudiante e WHERE e.segundoApellido = :segundoApellido"),
    @NamedQuery(name = "Estudiante.findBySexo", query = "SELECT e FROM Estudiante e WHERE e.sexo = :sexo"),
    @NamedQuery(name = "Estudiante.findByFechaNacimiento", query = "SELECT e FROM Estudiante e WHERE e.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Estudiante.findByDireccion", query = "SELECT e FROM Estudiante e WHERE e.direccion = :direccion"),
    @NamedQuery(name = "Estudiante.findByTipoSangre", query = "SELECT e FROM Estudiante e WHERE e.tipoSangre = :tipoSangre"),
    @NamedQuery(name = "Estudiante.findByFechaIngreso", query = "SELECT e FROM Estudiante e WHERE e.fechaIngreso = :fechaIngreso"),
    @NamedQuery(name = "Estudiante.findByCorreo", query = "SELECT e FROM Estudiante e WHERE e.correo = :correo"),
    @NamedQuery(name = "Estudiante.findByLugarExpedicion", query = "SELECT e FROM Estudiante e WHERE e.lugarExpedicion = :lugarExpedicion")})
public class Estudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estudiante")
    private Integer idEstudiante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String identificacion;
    @Column(name = "tipo_id")
    private Integer tipoId;
    @Size(max = 45)
    private String estado;
    @Temporal(TemporalType.DATE)
    private Date expedicion;
    @Size(max = 45)
    @Column(name = "primer_nombre")
    private String primerNombre;
    @Size(max = 45)
    @Column(name = "segundo_nombre")
    private String segundoNombre;
    @Size(max = 45)
    @Column(name = "primer_apellido")
    private String primerApellido;
    @Size(max = 45)
    @Column(name = "segundo_apellido")
    private String segundoApellido;
    private Integer sexo;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Size(max = 45)
    private String direccion;
    @Column(name = "tipo_sangre")
    private Integer tipoSangre;
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    @Size(max = 45)
    private String correo;
    @Size(max = 45)
    @Column(name = "lugar_expedicion")
    private String lugarExpedicion;
    @OneToMany(mappedBy = "estudiante")
    private List<Nota> notaList;
    @JoinColumn(name = "id_madre", referencedColumnName = "id_padre")
    @ManyToOne
    private Padre padre;
    @JoinColumn(name = "id_padre", referencedColumnName = "id_padre")
    @ManyToOne
    private Padre padre1;
    @OneToMany(mappedBy = "estudiante")
    private List<Matricula> matriculaList;

    public Estudiante() {
    }

    public Estudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Estudiante(Integer idEstudiante, String identificacion) {
        this.idEstudiante = idEstudiante;
        this.identificacion = identificacion;
    }

    public Estudiante(String identificacion, Integer tipoId, String estado, Date expedicion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Integer sexo, Date fechaNacimiento, String direccion, Integer tipoSangre, Date fechaIngreso, String correo, String lugarExpedicion) {
        this.identificacion = identificacion;
        this.tipoId = tipoId;
        this.estado = estado;
        this.expedicion = expedicion;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.tipoSangre = tipoSangre;
        this.fechaIngreso = fechaIngreso;
        this.correo = correo;
        this.lugarExpedicion = lugarExpedicion;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Integer getTipoId() {
        return tipoId;
    }

    public void setTipoId(Integer tipoId) {
        this.tipoId = tipoId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getExpedicion() {
        return expedicion;
    }

    public void setExpedicion(Date expedicion) {
        this.expedicion = expedicion;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(Integer tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    public void setLugarExpedicion(String lugarExpedicion) {
        this.lugarExpedicion = lugarExpedicion;
    }

    public List<Nota> getNotaList() {
        return notaList;
    }

    public void setNotaList(List<Nota> notaList) {
        this.notaList = notaList;
    }

    public Padre getPadre() {
        return padre;
    }

    public void setPadre(Padre padre) {
        this.padre = padre;
    }

    public Padre getPadre1() {
        return padre1;
    }

    public void setPadre1(Padre padre1) {
        this.padre1 = padre1;
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
        hash += (idEstudiante != null ? idEstudiante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiante)) {
            return false;
        }
        Estudiante other = (Estudiante) object;
        if ((this.idEstudiante == null && other.idEstudiante != null) || (this.idEstudiante != null && !this.idEstudiante.equals(other.idEstudiante))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Estudiante{" + "identificacion=" + identificacion + 
                ", tipoId=" + tipoId + ", estado=" + estado + 
                ", expedicion=" + expedicion + ", primerNombre=" + primerNombre + 
                ", segundoNombre=" + segundoNombre + ", primerApellido=" + primerApellido + 
                ", segundoApellido=" + segundoApellido + ", sexo=" + sexo + 
                ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + 
                ", tipoSangre=" + tipoSangre + ", fechaIngreso=" + fechaIngreso + 
                 ", correo=" + correo + 
                ", lugarExpedicion=" + lugarExpedicion + '}';
    }

    public String getTipoSangreTexto() {
        switch (tipoSangre) {
            case 1:
                return "O negativo (O-)";
            case 2:
                return "O positivo (O+)";
            case 3:
                return "A positivo (A +)";
            case 4:
                return "A negativo (A-)";
            case 5:
                return "B positivo (B +)";
            case 6:
                return "B negativo (B-)";
            case 7:
                return "AB negativo (AB-)";
            case 8:
                return "AB positivo (AB+)";
            default:
                return "Otro";
        }
    }

    public String getSexoTexto() {
        switch (sexo) {
            case 1:
                return "Masculino";
            case 2:
                return "Femenino";
            case 3:
                return "Otro";
            default:
                return "Sin definir";
        }
    }

    public String getTipoIdTexto() {
        switch (tipoId) {
            case 1:
                return "RC";
            case 2:
                return "TI";
            case 3:
                return "CC";
            case 4:
                return "PASAPORTE";
            default:
                return "Sin Definir";
        }
    }

    private String getFormatFecha(Date fecha) {
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
        return objSDF.format(fecha);
    }

    public String getFechaIngresoTexto() {
        return getFormatFecha(fechaIngreso);
    }

    public String getFechaNacimientoTexto() {
        return getFormatFecha(fechaNacimiento);
    }

    public String getExpedicionTexto() {
        return getFormatFecha(expedicion);
    }
}
