/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author YERAY
 */
public class puntuacion extends HttpServlet {
    double n1,n2,n3,n4,n5,n6,n7,n8,n9;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet puntuación</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calificaciones</h1>");
            out.println("<table border=\"1\" style=\"width:100%;text-align: center\"");
            out.println("<tr><th colspan=\"3\"><h3><strong>MORENO GIL, YERAY</strong></h3></th></tr>");
            out.println("<tr>");
            out.println("<td>Nota 1:   "+n1+"</td><td>Nota 1:   "+n4+"</td><td>Nota 1:   "+n7+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Nota 2:   "+n2+"</td><td>Nota 2:   "+n5+"</td><td>Nota 2:   "+n8+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Nota 3:   "+n3+"</td><td>Nota 3:   "+n6+"</td><td>Nota 3:   "+n9+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><strong>Media 1º Modulo:"+(n1+n2+n3)/3+"</strong></td><td><strong>Media 2º Modulo:"+(n4+n5+n6)/3+"</strong></td><td><strong>Media 3º Modulo:"+(n7+n8+n9)/3+"</strong></td>");
            out.println("</tr>");
            out.println("<tr><th colspan=\"3\"><h3>NOTA FINAL :  " + ((n1+n2+n3+n4+n5+n6+n7+n8+n9)/9)+"</h3></th></tr>");
            out.println("</table>");
            out.println("");
            out.println("");
            out.println("");
            out.println("");
            out.println("");
            out.println("");
            out.println("");
            out.println("");
            out.println("");
            out.println("");
            

            
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        n1=Double.parseDouble(request.getParameter("n1"));
        n2=Double.parseDouble(request.getParameter("n2"));
        n3=Double.parseDouble(request.getParameter("n3"));
        n4=Double.parseDouble(request.getParameter("n4"));
        n5=Double.parseDouble(request.getParameter("n5"));
        n6=Double.parseDouble(request.getParameter("n6"));
        n7=Double.parseDouble(request.getParameter("n7"));
        n8=Double.parseDouble(request.getParameter("n8"));
        n9=Double.parseDouble(request.getParameter("n9"));
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
