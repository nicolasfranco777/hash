import java.util.HashMap;
public class BusquedaHashj {
    public static void main(String[] args) {
        
        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "Perú");
        mapa.put(2, "Argentina");
        mapa.put(3, "Brasil");
        mapa.put(4, "Chile");

        int claveBuscada = 3;
        if (mapa.containsKey(claveBuscada)) {
            System.out.println("Encontrado: clave " + claveBuscada + " -> " + mapa.get(claveBuscada));
        } else {
            System.out.println("Clave " + claveBuscada + " no encontrada.");
        }

        String paisBuscado = "Argentina";
        if (mapa.containsValue(paisBuscado)) {
            System.out.println("El valor '" + paisBuscado + "' está en la tabla hash.");
        } else {
            System.out.println("El valor '" + paisBuscado + "' no está en la tabla hash.");
        }
    }
}
