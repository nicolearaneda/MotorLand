/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package araneda.nicole.Models;



import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class Comprueba_Motor implements Validator {
    
    @Override
    public boolean supports(Class<?> type) 
    {
        return Motor.class.isAssignableFrom(type);
       // return TuClase.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        
        Motor mot=(Motor)o;
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "modelo",
        "required.modelo", "El campo modelo es Obligatorio.");

        if (mot.getModelo().length()!=5)
        {
            errors.rejectValue("modelo", "verificamodelo","el modelo debe contener cinco caracteres");
        }
        
        if(mot.getPotencia()<0)
        {
	    errors.rejectValue("potencia", "verificapotencia","la potencia debe ser mayor a cero");
	}
        
        if (mot.getPeso()<0)
        {
            errors.rejectValue("Peso", "verificapeso","el peso debe ser mayor a cero");
        }
        
        if (mot.getCantidad()==0)
        {
            errors.rejectValue("cantidad", "verificacantidad","la cantidad no puede ser cero");
        }
    }
    
}
