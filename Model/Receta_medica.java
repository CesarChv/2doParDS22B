import java.util.*;

public class Receta_medica {//extends Class1 {

    private int Fecha_emicion;
    private int Tiempo_tratmietno;
    private String Dosis;
    private String Nombre_paciente;
    private String Especialidad_medico;
    private String edad_paciente;

    /**
     * Default constructor
     */
    private Receta_medica(int Fecha_emicion, int Tiempo_tratmietno, String Dosis, String Nombre_paciente, String Especialidad_medico, String edad_paciente) 
    {
        this.Fecha_emicion = Fecha_emicion;
        this.Tiempo_tratmietno = Tiempo_tratmietno;
        this.Dosis = Dosis;
        this.Nombre_paciente = Nombre_paciente;
        this.Especialidad_medico = Especialidad_medico;
        this.edad_paciente = edad_paciente;
    }

    public int getTiempo_tratmietno() 
    {
        return this.Tiempo_tratmietno;
    }

    public int setTiempo_tratmietno(int ti) 
    {
        this.Tiempo_tratmietno = ti;
        return 0;
    }

    public int getFecha_emicion() 
    {
        return this.Fecha_emicion;
    }

    public int setFecha_emicion(int fec) 
    {
        this.Fecha_emicion = fec;
        return 0;
    }



    public String getDosis() 
    {
        return this.Dosis;
    }


    public void setDosis(String Do) 
    {
        this.Dosis = Do ;
    }


    public String getNombre_paciente() 
    {
        return this.Nombre_paciente;
    }


    public void setNombre_paciente(String nom) 
    {
        this.Nombre_paciente = nom ;
    }

    public String getEspecialidad_medico() 
    {
        return this.Especialidad_medico;
    }


    public void setEspecialidad_medico(String es) 
    {
        this.Especialidad_medico = es ;
    }


    public String getedad_paciente() 
    {
        return this.edad_paciente;
    }


    public void setedad_paciente(String eds) 
    {
        this.edad_paciente = eds ;
    }


    public static void main(String[] args) 
    {
        String Fecha_emicion, Tiempo_tratmietno, Dosis, Nombre_paciente, Especialidad_medico, edad_paciente;
        Receta_medica datos[] = new Receta_medica[2];
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese su Fecha_emicion "  + " : ");
        Fecha_emicion = sc.next();
        System.out.println("ingrese su Tiempo_tratmietno "  + " : ");
        Tiempo_tratmietno = sc.next();

        System.out.println("ingrese su Dosis "  + " : ");
        Dosis = sc.next();
        System.out.println("ingrese su Nombre_paciente "  + " : ");
        Nombre_paciente = sc.next();

        System.out.println("ingrese su Especialidad_medico "  + " : ");
        Especialidad_medico = sc.next();
        System.out.println("ingrese su edad_paciente "  + " : ");
        edad_paciente = sc.next();

    }

}