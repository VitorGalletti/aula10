public class Main {
    public static void main(String[] args) {
        Modelagem model = new Modelagem();
        Negocio controller = new Negocio(model);
        controller.processNumbers();
    }
}