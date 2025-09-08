public class Tarefas {

    private int id;
    private String titulo;
    private boolean realizada;

    public Tarefas (int id, String title, boolean realizada) {
        this.id = id;
        this.titulo = titulo;
        this.realizada = realizada;
    }
    public Tarefas (String titulo) {
        this.titulo = titulo;
        this.realizada = false;
    }
    public int getId() {return id;}
    public String getTitulo() {return titulo;}
    public boolean isRealizada() {return realizada;}

    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setRealizada(boolean realizada) {this.realizada=realizada;}

    @Override
    public String toString() {
        return id + "-" + titulo + "-" + (realizada? "Concluída": "Pendente");
    }
}
