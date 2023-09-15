
    public class Novela extends Libro {
        private String tipo;
    
        public Novela(String titulo, String autor, String tipo) {
            super(titulo, autor);
            this.tipo = tipo;
        }
    
        public String getTipo() {
            return tipo;
        }
    
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    
        @Override
        public void imprimirInfo() {
            super.imprimirInfo();
            System.out.println("Tipo: " + tipo);
        }
    }
    

