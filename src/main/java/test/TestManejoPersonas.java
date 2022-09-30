package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

//        Persona personaNueva = new Persona("Jorge", "Funes", "jf@mail.com", "88997766");
//        personaDao.insertar(personaNueva);
//        Persona personaModificar= new Persona(4, "Juan Carlos", "Funes", "Juanc@mail.com", "66445533");
//        personaDao.actualizar(personaModificar);
        
        Persona personaEliminar= new Persona(4);
        personaDao.eliminar(personaEliminar);


        List<Persona> personas = personaDao.seleccionar();

        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
        

    }
}
