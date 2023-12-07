import Info_Producto.Producto;

public class main {
    public static void main(String args[]){
        Producto producto1 = new Producto("01","producto1",20);
        System.out.println("El producto de código " + producto1.getCódigo() + " y nombre " + producto1.getNombre() + " tiene un precio de " + producto1.getPrecio() + " euros.");
        Producto producto2 = new Producto(producto1);
        System.out.println("El producto de código " + producto2.getCódigo()
                + " y nombre " + producto2.getNombre() + " tiene un precio de " + producto2.getPrecio() + " euros.");
        Producto producto3 = new Producto("codigo 03", "producto3", 20.0f);
        System.out.println("El producto de código " + producto3.getCódigo()
                + " y nombre " + producto3.getNombre() + " tiene un precio de " + producto3.getPrecio() + " euros.");

    }

}

