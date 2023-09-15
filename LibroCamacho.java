
    public class LibroCamacho extends LibroDeTexto {
        private String facultad;
    
        public LibroCamacho(String titulo, String autor, String curso, String facultad) {
            super(titulo, autor, curso);
            this.facultad = facultad;
        }
    
        public String getFacultad() {
            return facultad;
        }
    
        public void setFacultad(String facultad) {
            this.facultad = facultad;
        }
    
        @Override
        public void imprimirInfo() {
            super.imprimirInfo();
            System.out.println("Facultad: " + facultad);
        }
    }
    
    