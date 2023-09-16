package mx.utel.poo.objetos;

public class Foco {

        private int intensidad;
        private Luz luz;
        private Modelo tipo;

        public Foco(int intensidad, Luz luz, Modelo tipo) {
                this.intensidad = intensidad;
                this.luz = luz;
                this.tipo = tipo;
        }

        @Override
        public String toString() {
                String cadena = "Foco con %dlm con luz %s de tipo %s";
                return cadena.formatted(intensidad, luz, tipo);
        }
}
