public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "MIDIA";

        String plano = "M"; // M / T

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
                break;
            }
            case "M": {
                System.out.println("Whats e Intagram grátis");
                break;
            }
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
            default:
                System.out.println("Plano Indefinido");
        }
    }
}
