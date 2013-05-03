<%-- 
    Document   : ReporteAccesorio
    Created on : 04-16-2013, 04:20:22 PM
    Author     : Reyes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="net.sf.jasperreports.engine.JasperRunManager"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
         <%
        Connection conn=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver"); //se carga el driver
            conn= DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/el_lancero", "root", "Hola2013");
            out.print("conexion CTM! xD");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        File reportFile = new File(application.getRealPath("report1.jasper"));

        Map parameters = new HashMap();

        byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath (),parameters,conn);

        response.setContentType("application/pdf");
        response.setContentLength(bytes.length);
        ServletOutputStream ouputStream = response.getOutputStream();
        ouputStream.write(bytes, 0, bytes.length);
        ouputStream.flush();
        ouputStream.close();
        %>
