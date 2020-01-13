 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Formulario Motores</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
    </head>
    <body>
                              <form:form method="post" commandName="motor">
                              <form:errors path="modelo" element="div" cssClass="alert alert-danger"/>
                              <form:errors path="potencia" element="div" cssClass="alert alert-danger"/>
                              <form:errors path="peso" element="div" cssClass="alert alert-danger"/>
                              <form:errors path="cantidad" element="div" cssClass="alert alert-danger"/>
                            <h1>Alta motores</h1>
                            <h2>Complete el siguiente formulario con la información de su motor.</h2>
                                                       
                            <p>
                                <form:label path="modelo">Modelo:</form:label>
                                <form:input path="modelo" cssClass="form-control"/>
                            </p>
                            
                            <p>
                                <form:label path="fabricante">Fabricante:</form:label>
                                <form:input path="fabricante" cssClass="form-control" />
                            </p>
                            
                            <p>
                                <form:label path="potencia">Potencia:</form:label>
                                <input type="number" id="potencia" name="potencia">
                            </p>
                            
                            <p>
                                <form:label path="peso">Peso:</form:label>
                                <input type="number" id="peso" name="peso">
                            </p>
                            
                            <p>
                                <form:label path="cantidad">Cantidad:</form:label>
                                <input type="number" id="cantidad" name="cantidad">
                            </p>
                            <br/>
                            <input type="submit" value="Enviar" class="btn btn-danger" />
                        </form:form>
                     </div>
                </div>
            </div>
        </body>
</html>
