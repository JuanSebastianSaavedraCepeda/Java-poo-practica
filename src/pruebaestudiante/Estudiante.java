
package pruebaestudiante;


public class Estudiante {
    
    private String nombre;
    private double promedio;
    
    //metodo constructor
    public Estudiante(String nombre,double promedio){

        this.nombre=nombre;
    if(promedio > 0.0)
          if (promedio <= 100.0)        
           this.promedio=promedio;
      
    }
    
    public void establecerNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public void establecerPromedio(double promedio){
        if (promedio > 0.0)
           if (promedio <= 100.0)
              this.promedio = promedio; // asigna a la variable de instancia
    }
    
    public double obtenerPromedio(){
        return promedio;
    }
    
    public String obtenercalificacionestudiante(){
        String calificacionEstudiante="";
        
        if (promedio >= 90.0)
            calificacionEstudiante = "A";
        else if (promedio >= 80.0)
            calificacionEstudiante = "B";
        else if (promedio >= 70.0)
            calificacionEstudiante = "C";
        else if (promedio >= 60.0)
            calificacionEstudiante = "D";
        else
            calificacionEstudiante = "F";

 return calificacionEstudiante;
        
        
    }
    

}
