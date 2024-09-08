public class FlorSamambaia {
    public static String tentativaDesenhar(int r1, int x1, int y1, int r2, int x2, int y2) {
        // Calcular a distância entre os centros dos dois círculos
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Verificar se o círculo do caçador cobre completamente o círculo da flor
        if (distancia + r2 <= r1 && r1 > r2) {
            return "RICO";
        } else {
            return "MORTO";
        }
    }

    public static void main(String[] args) {
        // Testes
        System.out.println(tentativaDesenhar(5, 0, 0, 3, 0, 0));  // Exemplo RICO
        System.out.println(tentativaDesenhar(5, 0, 0, 5, 7, 7));  // Exemplo MORTO
        System.out.println(tentativaDesenhar(10, 0, 0, 5, 0, 0));  // RICO
        System.out.println(tentativaDesenhar(5, 2, 2, 5, 2, 2));  // MORTO
        System.out.println(tentativaDesenhar(7, 0, 0, 3, 10, 10));  // MORTO
        System.out.println(tentativaDesenhar(10, 0, 0, 5, 5, 0));  // RICO
        System.out.println(tentativaDesenhar(3, 0, 0, 1, 10, 10));  // MORTO
    }
}
