import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente pedro=new Cliente(1, "pedro", "rodrigues", "mamani");

        Ciudad cochabamba=new Ciudad(1,"cochabamba");
        Ciudad santaCruz=new Ciudad(2,"santa cruz");
        Ciudad tarija=new Ciudad(3,"tarija");

        categoria turista=new categoria(1,"turista");

        Aeropuerto jorgeWilsterman=new Aeropuerto("Jw","Jorge wilsterman Camacho",cochabamba);
        Aeropuerto viruViru=new Aeropuerto("VV","VIRU VIRU",santaCruz);
        Aeropuerto orielLea=new Aeropuerto("OL","oriel lea plaza",tarija);

        List<Vuelo> vuelos =new ArrayList<>();


        Vuelo cochabambaSantaCruz=new Vuelo("BOA-158", Calendar.getInstance().getTime(),jorgeWilsterman,viruViru);
        vuelos.add(cochabambaSantaCruz);

        Vuelo santaCruzTarija=new Vuelo("BOA-159",Calendar.getInstance().getTime(),viruViru,orielLea);
        vuelos.add(santaCruzTarija);



        Billete billete=new Billete(1,Calendar.getInstance().getTime(),653.5,pedro,cochabamba,tarija,turista,vuelos);
        System.out.println("Billete: ");
        System.out.println("=========== ");


        System.out.println("Id: " + billete.getIdBillete());

        System.out.println("Fecha: "  + billete.getFechaEmision());

        System.out.println("Precio total: " + billete.getPrecioTotal());

        System.out.println("Cliente: " + billete.getCliente().getNombre());
        System.out.println("Origen: " + billete.getOrigen().getNombre());
        System.out.println("Destino: " +billete.getDestino().getNombre());

        System.out.println("Categoria: "+ billete.getCategoria().getNombre()) ;
        System.out.println("Vuelos: ");
        for (Vuelo vuelo:billete.getVuelos()){
            System.out.println("Codigo vuelo: " + vuelo.getCodigoVuelo() + " | Salida" + vuelo.getSalida() +"| Origen" + vuelo.getDestino().getNombre() + "| Destino");


        }


    }
}
