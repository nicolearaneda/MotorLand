package araneda.nicole.Controllers;

import araneda.nicole.Models.Comprueba_Motor;
import araneda.nicole.Models.Conectar;
import araneda.nicole.Models.Motor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("alta.htm")
public class altaController {
    
    
    private JdbcTemplate jdbcTemplate;
    private Comprueba_Motor comprobar;
    
    public altaController() 
    {
                Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar() );
        this.comprobar = new Comprueba_Motor();
    }
    @RequestMapping(method=RequestMethod.GET) 
    public ModelAndView alta()
    {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("alta");
        mav.addObject("motor",new Motor());
        return mav;
    }
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView alta
        (
                @ModelAttribute("motor") Motor m,
                BindingResult result
        )
    {
         this.comprobar.validate(m, result);
        if (result.hasErrors())
        {
             ModelAndView mav=new ModelAndView();
            mav.setViewName("alta");
            mav.addObject("motor",new Motor());
            return mav;
        }
        else
        {
        this.jdbcTemplate.update 
        (
        "insert into motor (modelo,fabricante,potencia,peso,cantidad) values (?,?,?,?,?)",
         m.getModelo(),m.getFabricante(),m.getPotencia(),m.getPeso(),m.getCantidad());
         return new ModelAndView("redirect:/alta.htm");
        }
    }
       
    }


