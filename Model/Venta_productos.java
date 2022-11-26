import java.util.*;

public class Venta_productos {//extends Class1 {


    private int id_prod;
    private String Nombre_prod;
    private int cantidad;
    /**
     * Default constructor
     */
    private Venta_productos( int id_prod, String Nombre_prod, int cantidad) 
    {
  
        this.id_prod = id_prod;
        this.Nombre_prod = Nombre_prod;
        this.cantidad = cantidad;
        
    }

    public int getId_prod() 
    {
        return this.id_prod;
    }
    public int setId_prod(int ed) 
    {
        this.id_prod = ed;
        return 0;
    }


    public String getdNombre_prod() 
    {
        return this.Nombre_prod;
    }
    public void setNombre_prod(String nom) 
    {
        this.Nombre_prod = nom ;
    }


    public int getCantidad() 
    {
        return this.cantidad;
    }
    public int setCantidad(int can) 
    {
        this.cantidad = can;
        return 0;
    }


    public static void main(String[] args) 
    {
        String  id_prod, direcion, cantidad;
        Venta_productos datos[] = new Venta_productos[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese su id_prod "  + " : ");
        id_prod = sc.next();
        System.out.println("ingrese su Nombre_prod "  + " : ");
        direcion = sc.next();
        System.out.println("ingrese su cantidad "  + " : ");
        cantidad = sc.next();

    }

}