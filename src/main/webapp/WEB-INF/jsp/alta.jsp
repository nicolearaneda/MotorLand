 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Formulario Motores</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
    </head>
    <body>
        <div class="container">
            <ol class="breadcrumb">
                <li><a href="<c:url value="/listado.htm" />">Listado de motores</a></li>
                <li class="active">Listado motor</li>
            </ol>
                              
                        <form:form method="post" commandName="motor">
                              <form:errors path="*" element="div" cssClass="alert alert-danger" />
                            <h1>Complete el formulario</h1>
                            
                                                       
                            <p>
                                <form:label path="modelo">Modelo:</form:label>
                                <form:input path="modelo" cssClass="form-control"/>
                                
                            </p>
                            
                            <p>
                                <form:label path="fabricante">Fabricante</form:label>
                                <form:input path="fabricante" cssClass="form-control" />
                            </p>
                            
                            <p>
                                <form:label path="potencia">Potencia</form:label>
                               
                                <input type="number" id="potencia" name="potencia">
                            </p>
                            
                            <p>
                                <form:label path="peso">Peso</form:label>
                               
                                <input type="number" id="peso" name="peso">
                            </p>
                            
                            <p>
                                <form:label path="cantidad">Cantidad</form:label>
                               
                                <input type="number" id="cantidad" name="cantidad">
                            </p>
                            
                            <br/>
                            <input type="submit" value="Enviar" class="btn btn-danger" />
                        </form:form>
                </div>
        </body>
</html>
