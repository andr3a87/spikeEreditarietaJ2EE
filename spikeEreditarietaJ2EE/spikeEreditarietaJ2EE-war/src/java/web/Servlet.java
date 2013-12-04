/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import ejb.GestoreAziendaLocal;
import ejb.Impiegato;
import ejb.Manager;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andr3A
 */
public class Servlet extends HttpServlet {
    @EJB
    private GestoreAziendaLocal gestoreAzienda;
    
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
        PrintWriter out = response.getWriter();
        try{
            //gestoreAzienda.aggiungiImpiegato("Gennaro", 1300);
            //gestoreAzienda.aggiungiManager("Filippo", 1300, "Vanessa");
            out.println("STAMPA<br/>");
            Iterator<Impiegato> li = gestoreAzienda.findAllImpiegato().iterator();
            Iterator<Manager> lm = gestoreAzienda.findAllManager().iterator();
            out.print("IMPIEGATI<br/>");  
            while (li.hasNext()){
                out.print(li.next().getClass()+"<br/>");    
            }
            out.print("MANAGER<br/>");  
            while (lm.hasNext()){
                out.print(lm.next().toString()+"<br/>");
                
            }
        }catch(Exception e){out.print("Error");}
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
