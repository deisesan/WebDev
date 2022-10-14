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
            
            builder.append("<h2>Consulta 1.A: Quais as pessoas (dados completos) cadastradas? Por meio de Query</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getPessoasQuery()));
            builder.append("</pre></p>");
            builder.append("<h2>Consulta 1.B: Quais as pessoas (dados completos) cadastradas? Por meio de TypedQuery</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getPessoasTypedQuery()));
            builder.append("</pre></p>");
            builder.append("<h2>Consulta 1.C: Quais as pessoas (dados completos) cadastradas? Por meio de NamedQuery</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getPessoasNamedQuery()));
            builder.append("</pre></p>");

            builder.append("<h2>Consulta 2.A: Quais os nomes das pessoas? Por meio de Query</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getNomesQuery()));
            builder.append("</pre></p>");
            builder.append("<h2>Consulta 2.B: Quais os nomes das pessoas? Por meio de TypedQuery</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getNomesTypedQuery()));
            builder.append("</pre></p>");
            builder.append("<h2>Consulta 2.C: Quais os nomes das pessoas? Por meio de NamedQuery</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getNomesNamedQuery()));
            builder.append("</pre></p>");

            builder.append("<h2>Consulta 3.A: Quais as pessoas (nome) e seus respectivos endereços (dados completos)? Por meio de Query</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getNomesEnderecosQuery()));
            builder.append("</pre></p>");
            builder.append("<h2>Consulta 3.B: Quais as pessoas (nome) e seus respectivos endereços (dados completos)? Por meio de TypedQuery</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getNomesEnderecosTypedQuery()));
            builder.append("</pre></p>");
            builder.append("<h2>Consulta 3.C: Quais as pessoas (nome) e seus respectivos endereços (dados completos)? Por meio de NamedQuery</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getNomesEnderecosNamedQuery()));
            builder.append("</pre></p>");

            builder.append("<h2>Consulta 4.A: Quais pessoas (dados completos) moram em avenidas? Por meio de Query</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getPessoasAvenidaQuery()));
            builder.append("</pre></p>");
            builder.append("<h2>Consulta 4.B: Quais pessoas (dados completos) moram em avenidas? Por meio de TypedQuery</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getPessoasAvenidaTypedQuery()));
            builder.append("</pre></p>");
            builder.append("<h2>Consulta 4.C: Quais pessoas (dados completos) moram em avenidas? Por meio de NamedQuery</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getPessoasAvenidaNamedQuery()));
            builder.append("</pre></p>");
            
            builder.append("<h2>Consulta 5.A: Quais pessoas (dados completos) não moram em praças? Por meio de Query</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getPessoasNaoPracaQuery()));
            builder.append("</pre></p>");
            builder.append("<h2>Consulta 5.B: Quais pessoas (dados completos) não moram em praças? Por meio de TypedQuery</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getPessoasNaoPracaTypedQuery()));
            builder.append("</pre></p>");
            builder.append("<h2>Consulta 5.C: Quais pessoas (dados completos) não moram em praças? Por meio de NamedQuery</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getPessoasNaoPracaNamedQuery()));
            builder.append("</pre></p>");
            
            builder.append("<h2>Consulta 6.A: Quais pessoas (nomes) e seus respectivos telefones (dados completos)? Por meio de Query</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getNomesTelefonesQuery()));
            builder.append("</pre></p>");
            builder.append("<h2>Consulta 6.B: Quais pessoas (nomes) e seus respectivos telefones (dados completos)? Por meio de TypedQuery</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getNomesTelefonesTypedQuery()));
            builder.append("</pre></p>");
            builder.append("<h2>Consulta 6.C: Quais pessoas (nomes) e seus respectivos telefones (dados completos)? Por meio de NamedQuery</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getNomesTelefonesNamedQuery()));
            builder.append("</pre></p>");
            
            builder.append("<h2>Consulta 9: Quais pessoas (dados completos) não possuem telefone?</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getPessoasNaoTelefonesQuery()));
            builder.append("</pre></p>");

            builder.append("<h2>Consulta 10: Quantos telefones cada pessoa (nome) tem?</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(pessoaBean.getPessoasCountTelefonesQuery()));
            builder.append("</pre></p>");
    
            builder.append("<h2>Consulta 11: Quais grupos (dados completos) não estão ativos?</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(grupoBean.getGruposNaoAtivosQuery()));
            builder.append("</pre></p>");

            builder.append("<h2>Consulta 12: Quais são os líderes (nomes) dos grupos (nomes)?</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(grupoBean.getNomesLideresQuery()));
            builder.append("</pre></p>");

            builder.append("<h2>Consulta 17: Quais são os grupos (nomes) e os respectivos totais de membros distintos já alocados?</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(grupoBean.getNomesMembrosDistintosQuery()));
            builder.append("</pre></p>");

            builder.append("<h2>Consulta 21: Quais os grupos (nomes) e respectivos membros (nomes) que não possuem</h2>");
            builder.append("<h2>data de término de atuação em seus grupos?</h2>");      
            builder.append("<p><pre>");
            builder.append(Util.toJson(grupoBean.getNomesMembrosNaoDataTerminoQuery()));
            builder.append("</pre></p>");
            
            builder.append("<h2>Consulta 22.A: Quais são os grupos (nomes) e líderes (nomes) com respectivos membros (nomes)?</h2>");
            builder.append("<p><pre>");
            builder.append(Util.toJson(grupoBean.getNomesLideresMembrosQuery()));
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
