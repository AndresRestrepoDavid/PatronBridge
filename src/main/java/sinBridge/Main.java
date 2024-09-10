package sinBridge;

/* En el ejemplo actual se esta sin el uso del Bridge, cada vez que necesite
* agregar un nuevo tipo de servicio de salud, se debera crear una nueva clase
* que implemente la interfaz ServiciosSalud y que este acoplada a la nueva
* clase de implementación. Como se puede observar la palabra clave es acoplamiento
* en la clase actual hay un alto acople, por lo que tendremos problemas para
* mantener esto en el tiempo y no tendremos flexibilidad y facilidad para
* incorporar cambios*/

/* Para el reto se propone pensar en cual sería la abstracción de alto nivel o
* la logica que no requiere de detalle y cual sería la logica de bajo nivel o la
* que va a ser nuestra funcionalidad que luego se ira implementando acorde a las concreciones
* que el sistema requiera. La idea es aislar estas dos y que se comuniquen por el Bridge,
* o en otras palabras por una referencia de la abstracción hacia la implementación por medio
* de una composición de objetos*/

public class Main {
    public interface ServicioSalud {
        void atenderPaciente();
    }

    public static class ServicioHospital implements ServicioSalud {
        private Hospital hospital;

        public ServicioHospital(Hospital hospital) {
            this.hospital = hospital;
        }

        @Override
        public void atenderPaciente() {
            hospital.atenderPaciente();
        }
    }

    public static class ServicioClinica implements ServicioSalud {
        private Clinica clinica;

        public ServicioClinica(Clinica clinica) {
            this.clinica = clinica;
        }

        @Override
        public void atenderPaciente() {
            clinica.atenderPaciente();
        }
    }

    public static class Hospital {
        public void atenderPaciente() {
            System.out.println("Atendiendo paciente en el hospital");
        }
    }

    public static class Clinica {
        public void atenderPaciente() {
            System.out.println("Atendiendo paciente en la clínica");
        }
    }

    public static void main(String[] args) {
        ServicioSalud servicioHospital = new ServicioHospital(new Hospital());
        servicioHospital.atenderPaciente();

        ServicioSalud servicioClinica = new ServicioClinica(new Clinica());
        servicioClinica.atenderPaciente();
    }
}
