package practicaInterfaces.recomendacionesInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Recomendaciones UPB !!");
        Producto p1 = new Producto("Laptop", "Electrónica", 1200);
        Producto p2 = new Producto("Mouse", "Electrónica", 30);
        Producto p3 = new Producto("Cámara", "Electrónica", 200);
        Producto p4 = new Producto("Tablet", "Electrónica", 3800);
        Producto p5 = new Producto("Teclado Mecánico", "Electrónica", 150);
        Producto p6 = new Producto("Smartphone", "Electrónica", 999);
        Producto p7 = new Producto("Monitor 4K", "Electrónica", 600);
        Producto p8 = new Producto("Audífonos Inalámbricos", "Electrónica", 120);
        Producto p9 = new Producto("Impresora Láser", "Electrónica", 250);
        Producto p10 = new Producto("Consola de Videojuegos", "Electrónica", 500);
        Producto p11 = new Producto("Router WiFi", "Electrónica", 180);
        Producto p12 = new Producto("Disco Duro Externo", "Electrónica", 90);
        Producto p13 = new Producto("Silla Gamer", "Muebles", 300);
        Producto p14 = new Producto("Drone", "Electrónica", 750);


        List<Producto> historial = new ArrayList<>();
        historial.add(p1);
        historial.add(p5);
        historial.add(p7);
        historial.add(p4);

        List<Producto> historial2 = new ArrayList<>();
        historial2.add(p6);
        historial2.add(p7);
        historial2.add(p9);
        historial2.add(p14);

        List<Producto> recomendacion = new ArrayList<>();
        recomendacion.add(p8);

        List<Producto> recomendacion1 = new ArrayList<>();
        recomendacion1.add(p9);

        UsuarioPremium premium = new UsuarioPremium("Minho", historial);
        UsuarioPremium premium1 = new UsuarioPremium("Hanji", historial2);
        UsuarioRegular regular = new UsuarioRegular("Hyun", recomendacion);
        UsuarioRegular regular1 = new UsuarioRegular("Felix", recomendacion1);

        SistemaRecomendaciones.recomendar(premium);
        System.out.println("----------------------------------------------------");
        SistemaRecomendaciones.recomendar(premium1);
        System.out.println("----------------------------------------------------");
        SistemaRecomendaciones.recomendar(regular);
        System.out.println("----------------------------------------------------");
        SistemaRecomendaciones.recomendar(regular1);
        System.out.println("----------------------------------------------------");
    }
}