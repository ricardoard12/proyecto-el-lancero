/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
    package servlets;
     
import Clases.Validador;
    import beans.*;
    import clases.*;
    import java.util.regex.*;
    import java.io.*;
    import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    import javax.servlet.http.HttpSession;
     
    public class Register extends HttpServlet {
     
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            /* En este proyecto; este servlet no recibe ni debe recibir nada por GET,
             * asi que si se lleva a entrar al servelt
             * usando el metodo GET solamente redireccion al index.jsp
             */
            response.sendRedirect("index.jsp");
        }
       
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            HttpSession respuesta = request.getSession(true);
            PrintWriter out = response.getWriter();
            //Declaro e inicio las variables
            String nombreUsuario = request.getParameter("name");
            String emailUsuario = request.getParameter("email");
            String password = request.getParameter("password1");
            String confirm_password = request.getParameter("password2");
            Pattern p = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
            Matcher m = p.matcher(emailUsuario);
            Validador v = new Validador();
            Dao d = new Dao();
            //Comienzo con las validaciones
            /*
             * Podemos hacer un monton de validaciones, por ejemplo:
             * Campos no vacios, direccion de email valida, nombre de usuario y contraseña
             * sin espacios y/o caracteres especiales.
             */
           
            //campos vacios
            if(nombreUsuario.isEmpty() || emailUsuario.isEmpty() || password.isEmpty() || confirm_password.isEmpty()){
                respuesta.setAttribute("error", "Hay campos vacios");
               
            } else {
                //No hay campos vacios, veo que la direccion de email sea válida
                if(m.find()){
                    respuesta.setAttribute("error", "La direccion de email no es correcta");
                   
                } else {
                    //La direccion de email si es correcta, verifico que la contraseña tambien lo sea
                    if(v.isUsernameOrPasswordValid(password)){
                        //Ahora verifico si la contraseña 1 y la contraseña 2 son iguales
                        if(password.equals(confirm_password)){
                            try {
                                d.conectar();
                                    if(d.isEmailRegistered(emailUsuario)){
                                        respuesta.setAttribute("error", "Esta direccion de correo ya fue registrada");
                                    } else {
                                       
                                        //Legado a este punto significa que todo esta correcto, por lo tanto ingreso a la DB
                                        d.registerUser(emailUsuario, password, nombreUsuario);
                                        respuesta.setAttribute("error", null);
                                    }
                               
                                d.desconectar();
                                 
                            } catch (Exception e) { out.println("Ocurrio la sig exception: " +e); }
                           
                           
                           
                        } else {
                            respuesta.setAttribute("error", "Las contraseñas no son iguales");
                           
                        }
                       
                    } else {
                        respuesta.setAttribute("error", "Contraseña no es válida");
                       
                    }
                   
                   
                }
            }
           
            response.sendRedirect("register.jsp");
           
        }
     
    }