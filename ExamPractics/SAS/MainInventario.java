package SAS;

public class MainInventario {

    public static void main(String[] args) {
        Laptop l1 = new Laptop("L1","Dell", 16);
        Laptop l2 = new Laptop("L2","Asus", 32);
        Smartphone s1 = new Smartphone("S1", "Pixel", "Android");
        Smartphone s2 = new Smartphone("S2", "Iphone", "IOS");
        Inventario inventario = new Inventario();
        inventario.agregarEquipo(l1);
        inventario.agregarEquipo(l2);
        inventario.agregarEquipo(s1);
        inventario.agregarEquipo(s2);
        try {
            inventario.buscarEquipo("S1");
            inventario.buscarEquipo("S2");
            inventario.buscarEquipo("l1");
        } catch (EquipoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

}
