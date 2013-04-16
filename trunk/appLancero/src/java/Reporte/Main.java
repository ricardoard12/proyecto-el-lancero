/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporte;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Reyes
 */
public class Main {
    

    public static void main(String[] args) {
        try
        {
            //Objeto para parámetros
            Map parámetros = new HashMap();
            //Compilar el informe
            JasperReport informeCompilado = JasperCompileManager.compileReport("reportEjemplo.jrxml");
            //Rellenar el informe con datos
            JasperPrint informeRelleno = JasperFillManager.fillReport(informeCompilado, parámetros);
            //Mostrar el informe
            JasperViewer.viewReport(informeRelleno, false);
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e.toString());
        }
    }

}
