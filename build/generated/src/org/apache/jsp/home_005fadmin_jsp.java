package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>ERP - Beta Version | Home</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t\t<style>\n");
      out.write("\t\t@font-face\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfont-family: DS Digi;\n");
      out.write("\t\t\tsrc: url('sources/DS-DIGI.TTF')\n");
      out.write("\t\t}\n");
      out.write("\t\t*\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfont-family: Segoe UI;\n");
      out.write("\t\t}\n");
      out.write("\t\tlegend\n");
      out.write("\t\t{\n");
      out.write("\t\t\tcolor: crimson;\n");
      out.write("\t\t}\n");
      out.write("\t\tiframe\n");
      out.write("\t\t{\n");
      out.write("\t\t\tborder: 10px solid grey;\n");
      out.write("\t\t\tborder-radius: 10px;\n");
      out.write("\t\t}\n");
      out.write("\t\tbutton\n");
      out.write("\t\t{\n");
      out.write("\t\t\tborder: 5px solid black;\n");
      out.write("\t\t\tborder-radius: 5px;\n");
      out.write("\t\t\tbackground-color: crimson;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\tfloat: right;\n");
      out.write("\t\t\tfont-size: 20px;\n");
      out.write("\t\t\tfont-family: Impact;\n");
      out.write("\t\t\tmargin: 0px 5px 5px 0px;\n");
      out.write("\t\t}\n");
      out.write("\t\t#timebox\n");
      out.write("\t\t{\n");
      out.write("\t\t\tbackground-color: black;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\tfont-family: DS Digi;\n");
      out.write("\t\t\tfont-size: 20px;\n");
      out.write("\t\t\ttext-align: right;\n");
      out.write("\t\t\tpadding: 12px;\n");
      out.write("\t\t\tborder-radius: 10px;\n");
      out.write("\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("\t\t<script type = \"text/javascript\">\n");
      out.write("\t\t\tfunction updateTime()\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tvar d = new Date();\n");
      out.write("\t\t\t\tvar tt = \"AM\"\n");
      out.write("\t\t\t\tvar hh = d.getHours();\n");
      out.write("\t\t\t\tvar mm = d.getMinutes();\n");
      out.write("\t\t\t\tvar ss = d.getSeconds();\n");
      out.write("\n");
      out.write("\t\t\t\tif(parseInt(hh/10) == 0)\n");
      out.write("\t\t\t\t\thh = \"0\"+hh;\n");
      out.write("\n");
      out.write("\t\t\t\tif(hh > 12)\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\thh = hh - 12;\n");
      out.write("\t\t\t\t\ttt = \"PM\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\tif(parseInt(mm/10) == 0)\n");
      out.write("\t\t\t\t\tmm = \"0\"+mm;\n");
      out.write("\n");
      out.write("\t\t\t\tif(parseInt(ss/10) == 0)\n");
      out.write("\t\t\t\t\tss = \"0\"+ss;\n");
      out.write("\n");
      out.write("\t\t\t\tdocument.getElementById(\"timebox\").innerHTML = \"#Time: \" + hh+\":\"+mm+\":\"+ss+\" \"+tt+\" #Date: \"+d.getDate()+\"/\"+(d.getMonth()+1)+\"/\"+d.getFullYear();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t</script>\n");
      out.write("    </head>\n");
      out.write("    <body background = \"sources\\grey-chevron-stripes-1920.png\">\n");
      out.write("\t\t<script>\n");
      out.write("\t\tsetInterval(updateTime, 1000);\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<div id = \"timebox\"> Time will load up here shortly... </div>\n");
      out.write("\t\t<div style = \"margin: 50px 100px 100px 100px;\">\n");
      out.write("\t\t<img src=\"\" style = \"border: 1px dashed black;height: 100px;width: 100px;\">\n");
      out.write("\t\tWelcome\n");
      out.write("\t\t");

			String uname = (String)request.getAttribute("uname");
			
			out.println(uname);
		
      out.write("\n");
      out.write("\t\t!\n");
      out.write("\t\t<button type=\"button\"> Logout </button>\n");
      out.write("\t\t<button type=\"button\"> Profile </button>\n");
      out.write("        <iframe src = \"buttons.html\" name = \"tabs\" width = \"100%\" height = \"20%\"> iframe1 </iframe><br>\n");
      out.write("\t\t<iframe src = \"output.html\" name = \"output\" width = \"100%\" height = \"60%\"> iframe2 </iframe>\n");
      out.write("\t\t</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
