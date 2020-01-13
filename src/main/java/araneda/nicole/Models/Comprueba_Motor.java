/* Clase java donde se comprueban distintas condiciones que tienen que cumplir los 
atributos de la clase Motor.
 */
package araneda.nicole.Models;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

//Implementamos el método comprueba_motor con la interface Validator.
public class Comprueba_Motor implements Validator {
    private int div;
    @Override
    public boolean supports(Class<?> type) 
    {
        return Motor.class.isAssignableFrom(type);
       // return TuClase.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        
        Motor mot=(Motor)o;
        //Acá se exige que se tiene que escribir el modelo.
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "modelo",
        "required.modelo", "El campo modelo es Obligatorio.");

        if (mot.getModelo().length()!=5)
        { //Si el modelo no tiene 5 caracteres, se muestra una ventana que dice que debe tenerlos.
            errors.rejectValue("modelo", "verificamodelo","El modelo debe contener cinco caracteres");
        }
        
        if(mot.getPotencia()<0)
        {
	    errors.rejectValue("potencia", "verificapotencia","La potencia debe ser mayor a cero.");
	}
        
        if (mot.getPeso()<0)
        {
            errors.rejectValue("peso", "verificapeso","El peso debe ser mayor a cero.");
        }
        
        if (mot.getCantidad()==0)
        {
            errors.rejectValue("cantidad", "verificacantidad","La cantidad no puede ser cero.");
        }
        
    }
    
}
