public class TestaGame {
    public static void main(String[] args) {
        Produto c1 = new Produto(591, "Teclado Gamer", 200.00, "M", "30/02/2023");
        Produto c2 = new Produto(176, "Cadeira Gamer",900.00, "M", "15/06/2023");

        c1.visualizar();
        c2.visualizar();
    }
}