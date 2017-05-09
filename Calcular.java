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
 * @author YERAY MORENO GIL
 */
public class Calcular extends HttpServlet {
    double   op1,   op2,   result;
    int   operacion;
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
            out.println("<title>Servlet Calcular</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>YERAY MORENO</h1>");
            out.println("<h1>El resultado de la operación es :</h1>");
            out.println("<h2><strong>"+op1);
                switch   (operacion){
                    case   1: out.println(" + ");break;
                    case   2: out.println(" - ");break;
                    case   3: out.println(" * ");break;
                    case   4: out.println(" / ");break;
                }
            out.println(op2+" = "+result+"</strong></h2>");
                    //+op2+" = "+result+"</strong></h2>");
            out.println("</body>");
            out.println("</html>");           
        }
    }
    public double calcu(double op1,double op2,int operacion){
        switch   (operacion){
        case   1: return   op1   +   op2;
        case   2: return   op1   -   op2;
        case   3: return   op1   *   op2;
        case   4: return   op1   /   op2;
        default: return 0;
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
        op1   =   Double.parseDouble(request.getParameter("operando1"));
        op2   =   Double.parseDouble(request.getParameter("operando2"));
        operacion = Integer.parseInt(request.getParameter("operacion"));
        result   =   calcu(op1,   op2,   operacion);
        
        
        
        
        
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
