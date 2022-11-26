import java.util.*;

public class Paciente {//extends Class1 {

    private String nombre;
    private int edad;
    private String direccion;
    private int telefono;
    /**
     * Default constructor
     */
    private Paciente(String nombre, int edad, String direccion, int telefono) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        
    }
    public String getNombre() 
    {
        return this.nombre;
    }
    public void setNombre(String nom) 
    {
        this.nombre = nom ;
    }


    public int getEdad() 
    {
        return this.edad;
    }
    public int setEdad(int ed) 
    {
        this.edad = ed;
        return 0;
    }


    public String getdDireccion() 
    {
        return this.direccion;
    }
    public void setDireccion(String dir) 
    {
        this.direccion = dir ;
    }


    public int getTelefono() 
    {
        return this.telefono;
    }
    public int setTelefono(int tel) 
    {
        this.telefono = tel ;
    }


    public static void main(String[] args) 
    {
        String nombre, edad, direcion, telefono;
        Paciente datos[] = new Paciente[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese su Nombre "  + " : ");
        nombre = sc.next();
        System.out.println("ingrese su Edad "  + " : ");
        edad = sc.next();
        System.out.println("ingrese su Direccion "  + " : ");
        direcion = sc.next();
        System.out.println("ingrese su Telefono "  + " : ");
        telefono = sc.next();

    }

}