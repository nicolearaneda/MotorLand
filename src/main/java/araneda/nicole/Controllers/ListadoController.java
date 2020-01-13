/*Este el archivo del controlador para la vista listado.jsp, donde se realiza la consulta de sql para muestre el listado
de los motores*/


package araneda.nicole.Controllers;

import araneda.nicole.Models.Conectar;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
public class ListadoController 
{
    private JdbcTemplate jdbcTemplate;
    
    public ListadoController()
    {//Conecta con la Base de Datos
        Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
    
    @RequestMapping("listado.htm")
    public ModelAndView home(HttpServletRequest request)
    {//Lee el parametro de la ubicacion request.getParameter("opcion") y lo guarda en el String opc
        String opc=request.getParameter("opcion");
        //crea un nuevo ModelAndView y lo guarda en mav
        ModelAndView mav=new ModelAndView();
        //Consulta sql
        String sql="select * from motor";
        //Guarda el resultado que se obtiene al realizar la consulta sql, que es un listado 
        List motores=this.jdbcTemplate.queryForList(sql);
//Muestra una ventana cuando se realiza la alta 
        
        //agrega el objeto motores a la variable mav
        mav.addObject("motores",motores); 
//lo anterior es: quiero usar la lista motores bajo el nombre "motores"
        mav.setViewName("listado");
        return mav;
    }
}
