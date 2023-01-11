public class TestaCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Joao Silva", "321.654.987-78", "21.654.987-8", "Rua ABC, 10", "21/08/1996");
        Cliente c2 = new Cliente("Maria Silva", "321.654.789-78", "21.654.987-9", "Rua DEF, 15", "09/05/1996");

        c1.visualizar();
        c2.visualizar();
    }
}