import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/solution")
public class SolutionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String a = req.getParameter("paramA");
        String b = req.getParameter("paramB");
        String c = req.getParameter("paramC");
        double discriminant, x1, x2;
        String solution = null;

        //validation
        try {
            int valueParamA = Integer.parseInt(a);
            int valueParamB = Integer.parseInt(b);
            int valueParamC = Integer.parseInt(c);

            if (valueParamA == 0 ){
                req.getServletContext().getRequestDispatcher("/responseBad.jsp").forward(req, resp);
            }

            discriminant = valueParamB * valueParamB - 4 * valueParamA * valueParamC;

            if (discriminant > 0) {
                x1 = (-valueParamB - Math.sqrt(discriminant)) / (2 * valueParamA);
                x2 = (-valueParamB + Math.sqrt(discriminant)) / (2 * valueParamA);
                solution = "x1 = " + String.valueOf(x1) + " ; x2 = " + String.valueOf(x2);
            }

            if (discriminant == 0) {
                x1 = x2 = -valueParamB / (2 * valueParamA);
                solution = "x1 = x2 = " + String.valueOf(x1);

            }
            if (discriminant < 0) {
                solution = "Множество действительных чисел";
            }

            req.getServletContext().setAttribute("A", valueParamA);
            req.getServletContext().setAttribute("B", valueParamB);
            req.getServletContext().setAttribute("C", valueParamC);
            req.getServletContext().setAttribute("D", discriminant);
            req.getServletContext().setAttribute("solution", solution);
            req.getServletContext().getRequestDispatcher("/responseok.jsp").forward(req, resp);
        } catch (Exception e){
            req.getServletContext().getRequestDispatcher("/responseBad.jsp").forward(req, resp);
        }





    }
}
