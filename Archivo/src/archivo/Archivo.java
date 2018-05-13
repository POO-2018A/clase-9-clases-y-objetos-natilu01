package archivo;
 
import java.util.Date;
import java.util.GregorianCalendar;
 
public class Archivo {
     
    private String nombre;
    private String modo;
    private Date fecha;
    private String texto;
     
    public Archivo(String nombre, int año, int mes, int dia){
        this.nombre=nombre;
        
        GregorianCalendar  calendario = new GregorianCalendar (año, mes-1, dia);
        fecha=calendario.getTime();
    }
     
    public Archivo(String nombre, String tipo, int año, int mes, int dia){
        this.nombre=nombre;
        this.modo=modo;
        GregorianCalendar  calendario = new GregorianCalendar (año, mes-1, dia);
        fecha=calendario.getTime();
    }
     
    public Archivo(String nombre, String tipo, int año, int mes, int dia, String contenido){
        this.nombre=nombre;
        this.modo=modo;
        GregorianCalendar  calendario = new GregorianCalendar (año, mes-1, dia);
        fecha=calendario.getTime();
        this.texto=texto;
    }
     
    public String getNombre(){
        return "Nombre del documento: "+nombre;
    }
    public String getTipo(){
        return "Tipo de archivo: "+modo;
    }
     
    public String getFechaCreacion(){
        return "Fecha de ultima modificacion: "+fecha;
    }
     
    public void setContenido(String contenido){
        this.texto=texto;
    }
    public String getContenido(){
        return "Texto: "+texto;
    }
 
    public static void main(String[] args) {
        Archivo objeto1 = new Archivo("Repaso",2018,05,07);
        System.out.println("Deber_Archivo_Clase_Atributos");
        System.out.println("Objeto 1");
        System.out.println();
        System.out.println(objeto1.getNombre());
        System.out.println(objeto1.getFechaCreacion());
         
        Archivo objeto2 = new Archivo("Repaso en clase",27,02,2005);
        System.out.println("Objeto 2");
        System.out.println();
        System.out.println(objeto2.getNombre());
        System.out.println(objeto2.getTipo());
        System.out.println(objeto2.getFechaCreacion());
         
        Archivo objeto3 = new Archivo("Deber",20,05,2017);
        System.out.println("Objeto 3");
        System.out.println();
        objeto3.setContenido("Siempre Sonrie");
        System.out.println(objeto3.getNombre());
        System.out.println(objeto3.getTipo());
        System.out.println(objeto3.getContenido());
        System.out.println(objeto3.getFechaCreacion());
         
    }
     
}
