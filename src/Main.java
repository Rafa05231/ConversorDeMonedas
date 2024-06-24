import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consultarMoneda = new ConsultarMoneda();
        GeneradorArchivo generadorArchivo = new GeneradorArchivo();
        List<Moneda> listaConversionMonedas = new ArrayList<>();
        int opcion=0;
        double cantidadConversion;
        String monedaBase;
        String monedaConvertida;
        Moneda moneda;

        while(opcion!=7) {
            System.out.println("*********************************************************************************\n");
            System.out.println("Bienvenido al sistema conversor de monedas, escoge la opcion que desees: ");
            System.out.println("1) Dolar => Peso argentino");
            System.out.println("2) Peso argentino => Dolar");
            System.out.println("3) Won surcoreano => Peso colombiano");
            System.out.println("4) Peso colombiano => Won surcoreano");
            System.out.println("5) Dolar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dolar");
            System.out.println("7) Salir\n");
            System.out.println("*********************************************************************************\n");
            System.out.println("Elige la opcion que deseas: ");
            opcion = lectura.nextInt();

            switch (opcion){
                case 1:
                    monedaBase = "USD";
                    monedaConvertida = "ARS";
                    System.out.println("Ingresa la cantidad que deseas convertir: ");
                    cantidadConversion = lectura.nextDouble();

                    try{
                        moneda = consultarMoneda.convertirMoneda(monedaBase,monedaConvertida,cantidadConversion);
                        System.out.println("El valor de "+cantidadConversion+" "+moneda.base_code()+" equivalen a "
                                + moneda.conversion_result()+" "+ moneda.target_code());
                        listaConversionMonedas.add(moneda);
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando programa!");
                        opcion=7;
                    }
                    break;
                case 2:
                    monedaBase = "ARS";
                    monedaConvertida = "USD";
                    System.out.println("Ingresa la cantidad que deseas convertir: ");
                    cantidadConversion = lectura.nextDouble();

                    try{
                        moneda = consultarMoneda.convertirMoneda(monedaBase,monedaConvertida,cantidadConversion);
                        System.out.println("El valor de "+cantidadConversion+" "+moneda.base_code()+" equivalen a "
                                + moneda.conversion_result()+" "+ moneda.target_code());
                        listaConversionMonedas.add(moneda);
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando programa!");
                        opcion=7;
                    }
                    break;
                case 3:
                    monedaBase = "KRW";
                    monedaConvertida = "COP";
                    System.out.println("Ingresa la cantidad que deseas convertir: ");
                    cantidadConversion = lectura.nextDouble();

                    try{
                        moneda = consultarMoneda.convertirMoneda(monedaBase,monedaConvertida,cantidadConversion);
                        System.out.println("El valor de "+cantidadConversion+" "+moneda.base_code()+" equivalen a "
                                + moneda.conversion_result()+" "+ moneda.target_code());
                        listaConversionMonedas.add(moneda);
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando programa!");
                        opcion=7;
                    }
                    break;
                case 4:
                    monedaBase = "COP";
                    monedaConvertida = "KRW";
                    System.out.println("Ingresa la cantidad que deseas convertir: ");
                    cantidadConversion = lectura.nextDouble();

                    try{
                        moneda = consultarMoneda.convertirMoneda(monedaBase,monedaConvertida,cantidadConversion);
                        System.out.println("El valor de "+cantidadConversion+" "+moneda.base_code()+" equivalen a "
                                + moneda.conversion_result()+" "+ moneda.target_code());
                        listaConversionMonedas.add(moneda);
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando programa!");
                        opcion=7;
                    }
                    break;
                case 5:
                    monedaBase = "USD";
                    monedaConvertida = "COP";
                    System.out.println("Ingresa la cantidad que deseas convertir: ");
                    cantidadConversion = lectura.nextDouble();

                    try{
                        moneda = consultarMoneda.convertirMoneda(monedaBase,monedaConvertida,cantidadConversion);
                        System.out.println("El valor de "+cantidadConversion+" "+moneda.base_code()+" equivalen a "
                                + moneda.conversion_result()+" "+ moneda.target_code());
                        listaConversionMonedas.add(moneda);
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando programa!");
                        opcion=7;
                    }
                    break;
                case 6:
                    monedaBase = "COP";
                    monedaConvertida = "USD";
                    System.out.println("Ingresa la cantidad que deseas convertir: ");
                    cantidadConversion = lectura.nextDouble();

                    try{
                        moneda = consultarMoneda.convertirMoneda(monedaBase,monedaConvertida,cantidadConversion);
                        System.out.println("El valor de "+cantidadConversion+" "+moneda.base_code()+" equivalen a "
                                + moneda.conversion_result()+" "+ moneda.target_code());
                        listaConversionMonedas.add(moneda);
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando programa!");
                        opcion=7;
                    }
                    break;
                case 7:
                    System.out.println("Gracias por usar nuestro sistema de conversion de monedas. Hasta pronto");
                    try{
                        generadorArchivo.GenerarJson(listaConversionMonedas);
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }

                    break;
                default:
                    System.out.println("Ingresa una opcion valida. Entre 1 y 7");
                    break;
            }
        }

    }
}