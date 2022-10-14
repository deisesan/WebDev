package io.github.deisesan.grupostrabalho.servlets;

import io.github.deisesan.grupostrabalho.atuacao.AtuacaoBeanLocal;
import io.github.deisesan.grupostrabalho.grupo.GrupoBeanLocal;
import io.github.deisesan.grupostrabalho.pessoa.PessoaBeanLocal;
import io.github.deisesan.grupostrabalho.util.Util;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

@Transactional
@WebServlet(name = "Consultas", urlPatterns = {"/Consultas"})
public class Consultas extends HttpServlet {

    @Inject
    private PessoaBeanLocal pessoaBean;

    @Inject
    private GrupoBeanLocal grupoBean;

    @Inject
    private AtuacaoBeanLocal atuacaoBean;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {

            StringBuilder builder = new StringBuilder();

            builder.append("<!DOCTYPE html>");
            builder.append("<html>");
            builder.append("<head>");
            builder.append("<title>Servlet Consultas</title>");
            builder.append("</head>");
            builder.append("<body>");
            builder.append("<h1>Consultas</h1>");
            
            builder.append("<h2>01.A: Quais as pessoas (dados completos) cadastradas? Por meio de Query</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getPessoasQuery()));
            builder.append("</pre></p>");
            builder.append("<h2>01.B: Quais as pessoas (dados completos) cadastradas? Por meio de TypedQuery</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getPessoasTypedQuery()));
            builder.append("</pre></p>");
            builder.append("<h2>01.C: Quais as pessoas (dados completos) cadastradas? Por meio de NamedQuery</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getPessoasNamedQuery()));
            builder.append("</pre></p>");
            
            builder.append("</body>");
            builder.append("</html>");

            out.print(builder.toString());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
