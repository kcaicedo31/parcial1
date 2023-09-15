
    public class LibroDeTexto extends Libro {
        private String curso;
    
        public LibroDeTexto(String titulo, String autor, String curso) {
            super(titulo, autor);
            this.curso = curso;
        }
    
        public String getCurso() {
            return curso;
        }
    
        public void setCurso(String curso) {
            this.curso = curso;
        }
    
        @Override
        public void imprimirInfo() {
            super.imprimirInfo();
            System.out.println("Curso: " + curso);
        }
        
    }
    

