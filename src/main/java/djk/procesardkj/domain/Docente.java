/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djk.procesardkj.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author ENOR ACOSTA
 */
@Entity
@Table(name = "docentes")
@NamedQueries({
    @NamedQuery(name = "Docente.findAll", query = "SELECT d FROM Docente d"),
    @NamedQuery(name = "Docente.findByIdDocente", query = "SELECT d FROM Docente d WHERE d.idDocente = :idDocente"),
    @NamedQuery(name = "Docente.findByNombres", query = "SELECT d FROM Docente d WHERE d.nombres = :nombres"),
    @NamedQuery(name = "Docente.findByApellidos", query = "SELECT d FROM Docente d WHERE d.apellidos = :apellidos"),
    @NamedQuery(name = "Docente.findByEstado", query = "SELECT d FROM Docente d WHERE d.estado = :estado"),
    @NamedQuery(name = "Docente.findByFechaNacimiento", query = "SELECT d FROM Docente d WHERE d.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Docente.findByTipoSangre", query = "SELECT d FROM Docente d WHERE d.tipoSangre = :tipoSangre"),
    @NamedQuery(name = "Docente.findByDireccion", query = "SELECT d FROM Docente d WHERE d.direccion = :direccion"),
    @NamedQuery(name = "Docente.findByTelefono", query = "SELECT d FROM Docente d WHERE d.telefono = :telefono"),
    @NamedQuery(name = "Docente.findByCorreo", query = "SELECT d FROM Docente d WHERE d.correo = :correo"),
    @NamedQuery(name = "Docente.findByCiudad", query = "SELECT d FROM Docente d WHERE d.ciudad = :ciudad"),
    @NamedQuery(name = "Docente.findByTitulo", query = "SELECT d FROM Docente d WHERE d.titulo = :titulo")})
public class Docente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_docente")
    private Integer idDocente;
    @Size(max = 45)
    private String nombres;
    @Size(max = 45)
    private String apellidos;
    private Integer estado;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "tipo_sangre")
    private Integer tipoSangre;
    @Size(max = 45)
    private String direccion;
    @Size(max = 45)
    private String telefono;
    @Size(max = 45)
    private String correo;
    @Size(max = 45)
    private String ciudad;
    @Size(max = 45)
    private String titulo;
    @OneToMany(mappedBy = "docente")
    private List<Grupo> grupoList;
    @OneToMany(mappedBy = "docente")
    private List<CargaAcademica> cargaAcademicaList;
    @JoinColumn(name = "identificacion", referencedColumnName = "codigo")
    @OneToOne
    private Usuario usuario;

    public Docente() {
    }

    public Docente(Integer idDocente) {
        this.idDocente = idDocente;
    }

    public Docente(Integer idDocente, String nombres, String apellidos, Integer estado, Date fechaNacimiento, Integer tipoSangre, String direccion, String telefono, String correo, String ciudad, String titulo, Usuario usuario) {
        this.idDocente = idDocente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.ciudad = ciudad;
        this.titulo = titulo;
        this.usuario = usuario;
        cargaAcademicaList = new ArrayList<>();
        grupoList = new ArrayList<>();
    }

    public Integer getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Integer idDocente) {
        this.idDocente = idDocente;
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

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(Integer tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocente != null ? idDocente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Docente)) {
            return false;
        }
        Docente other = (Docente) object;
        if ((this.idDocente == null && other.idDocente != null) || (this.idDocente != null && !this.idDocente.equals(other.idDocente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "djk.procesardkj.domain.Docente[ idDocente=" + idDocente + " ]";
    }

    private String getFormatFecha(Date fecha) {
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
        return objSDF.format(fecha);
    }

    public String getFechaNacimientoTexto() {
        return getFormatFecha(fechaNacimiento);
    }

    public String getEstadoTexto() {
        switch (estado) {
            case 1:
                return "Activo";
            case 2:
                return "Suspendido";
            case 3:
                return "Retirado";
            default:
                return "Sin definir";
        }
    }

    public String getNombreCompleto() {
        return nombres + " " + apellidos;
    }

    public String getNombreCarga() {
        return usuario.getCodigo()+" - "+ nombres + " " + apellidos;
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
}
