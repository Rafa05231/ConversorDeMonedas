import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeneradorArchivo {

    public void GenerarJson(List<Moneda> moneda){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            FileWriter escritura = new FileWriter("conversiones.json");
            escritura.write(gson.toJson(moneda));
            escritura.close();
        } catch (Exception e) {
            throw new RuntimeException("Error al generar el archivo");
        }

    }
}
