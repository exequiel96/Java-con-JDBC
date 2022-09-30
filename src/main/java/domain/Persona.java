
package domain;

public class Persona {
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
//este constructor vacio es para poder crear objetos de cualquier tipo si es que surge la necesidad
    public Persona() {
    }
/*este es para poder crear objetos con el id de persona, ya que para eliminar un objeeto de tipo persona no hace falta
    poner elnombre, apellido, email o telefono
    */
    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }
/*este contructor se usa para insertar un nuevo objeto de tipo persona, ya que no
    necesitariamos indicar el id persona porque es autoincrementabe
    */ 
    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
//    este constructor se usa por si se quiere modificar un registro de la tabla de la base de datos
    public Persona(int idPersona, String nombre, String apellido, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
//para modificar los atributos por separado usamos el metodo get y set
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    } 
}
