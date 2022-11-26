import java.util.*;

public class Farmaseutico {//extends Class1 {


    private int Num_cedula;
    private String Nombre;
    private int Direccoin;
    /**
     * Default constructor
     */
    private Farmaseutico( int Num_cedula, String Nombre, int Direccoin) 
    {
  
        this.Num_cedula = Num_cedula;
        this.Nombre = Nombre;
        this.Direccoin = Direccoin;
        
    }

    public int getNum_cedula() 
    {
        return this.Num_cedula;
    }
    public int setNum_cedula(int ed) 
    {
        this.Num_cedula = ed;
        return 0;
    }


    public String getdNombre() 
    {
        return this.Nombre;
    }
    public void setNombre(String nom) 
    {
        this.Nombre = nom ;
    }


    public int getDireccoin() 
    {
        return this.Direccoin;
    }
    public int setDireccoin(int can) 
    {
        this.Direccoin = can;
        return 0;
    }


    public static void main(String[] args) 
    {
        String  Num_cedula, direcion, Direccoin;
        Farmaseutico datos[] = new Farmaseutico[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese su Num_cedula "  + " : ");
        Num_cedula = sc.next();
        System.out.println("ingrese su Nombre "  + " : ");
        direcion = sc.next();
        System.out.println("ingrese su Direccoin "  + " : ");
        Direccoin = sc.next();

    }

}