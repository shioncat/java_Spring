/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2022-05-29 17:13:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.case02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class show_005flotto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/Users/shion/Desktop/java_Spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/myCoffee/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.4.jar!/META-INF/c.tld", Long.valueOf(1420527028000L));
    _jspx_dependants.put("jar:file:/C:/Users/shion/Desktop/java_Spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/myCoffee/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.4.jar!/META-INF/fn.tld", Long.valueOf(1420527028000L));
    _jspx_dependants.put("jar:file:/C:/Users/shion/Desktop/java_Spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/myCoffee/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.4.jar!/META-INF/fmt.tld", Long.valueOf(1420527028000L));
    _jspx_dependants.put("/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.4.jar", Long.valueOf(1644731960697L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://unpkg.com/purecss@2.0.6/build/pure-min.css\">\n");
      out.write(" <!-- CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/ress/dist/ress.min.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Philosopher\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/case02.css\" rel=\"stylesheet\">\n");
      out.write("	<meta charset=\"UTF-8\">\n");
      out.write("	<style type=\"text/css\">\n");
      out.write("		.item{\n");
      out.write("			margin: 100px\n");
      out.write("			padding: 100px\n");
      out.write("		}\n");
      out.write("		.container{\n");
      out.write("			display:flex;\n");
      out.write("		}\n");
      out.write("						\n");
      out.write("	</style>\n");
      out.write("	<title>Show Lotto</title>\n");
      out.write("</head>\n");
      out.write("<body style=\"padding: 15px\" >\n");
      out.write("		\n");
      out.write("			<form class=\"pure-form\" method=\"post\" action=\"./add\">\n");
      out.write("		    <fieldset>\n");
      out.write("		        <button type=\"submit\" class=\"pure-button pure-button-primary\" >\n");
      out.write("		        	電腦選號\n");
      out.write("		        </button>\n");
      out.write("		    </fieldset>\n");
      out.write("		    </form>\n");
      out.write("	<div class=\"container\">				    \n");
      out.write("		 <div class=\"item\">\n");
      out.write("			   <table  class=\"pure-table pure-table-bordered\" >\n");
      out.write("				 	<thead >\n");
      out.write("				    	<tr>\n");
      out.write("				    		<th>index</th><th>餐點號碼</th><th>修改</th><th>刪除</th>\n");
      out.write("				    	</tr>	\n");
      out.write("				    </thead>\n");
      out.write("				    <tbody>\n");
      out.write("				    	");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("				    </tbody>		    	   \n");
      out.write("			   </table>	\n");
      out.write("		    </div>\n");
      out.write("										<div>\n");
      out.write("											<tr>\n");
      out.write("												<td>  &emsp; &emsp;&emsp;  </td>	    	\n");
      out.write("											</tr>		  \n");
      out.write("										</div>\n");
      out.write("	   \n");
      out.write("		   <div class=\"item\">\n");
      out.write("			 <table  class=\"pure-table pure-table-bordered\" >\n");
      out.write("				 	<thead>\n");
      out.write("				    	<tr>\n");
      out.write("				    		<th>餐點號碼</th><th>產品名稱</th><th>說明</th>\n");
      out.write("				    	</tr>	\n");
      out.write("				    </thead>\n");
      out.write("				    \n");
      out.write("				    <tbody>\n");
      out.write("				    	<tr>\n");
      out.write("				    		<th>1號</th><th>黑咖啡</th><th>咖啡的講究，就是這麼單醇與濃烈。 100%阿拉比卡豆，100%雨林聯盟認證， 新鮮研磨、Espresso濃縮咖啡香醇萃取， 面對複雜的世界，要單純，很難！ 專注做一件事，夠單醇，才敢簡單！ 純粹就是好的黑咖啡。</th>\n");
      out.write("				    	</tr>	\n");
      out.write("				    				    \n");
      out.write("				    </tbody>	\n");
      out.write("				    \n");
      out.write("				    <tbody>\n");
      out.write("				    	<tr>\n");
      out.write("				    		<th>2號</th><th>那堤</th><th>香醇的牛奶搭配咖啡，陪你迎接美好一天。 通過雨林聯盟認證的100%阿拉比卡豆， 新鮮研磨成香醇濃縮咖啡，注入新鮮牛奶， 再蓋上選用高品質的香濃鮮奶打成的綿密奶泡， 細緻到幾乎看不到氣泡，搖晃起來呈濃稠質感。 喝一口，享受綿密親吻與完美比例的香醇。</th>\n");
      out.write("				    	</tr>				    \n");
      out.write("				    </tbody>	\n");
      out.write("				    <tbody>\n");
      out.write("				    	<tr>\n");
      out.write("				    		<th>3號</th><th>橙香塔</th><th>這個法式香橙塔的味道超棒 ♥ 喜歡新鮮水果派的朋友，現榨的柳橙香味和濃密的內餡口感是這款甜點最吸引人的地方喔！</th>\n");
      out.write("				    	</tr>				    \n");
      out.write("				    </tbody>	\n");
      out.write("				    <tbody>\n");
      out.write("				    	  \n");
      out.write("				    </tbody>	\n");
      out.write("			</table>\n");
      out.write("	\n");
      out.write("		\n");
      out.write("   		</div>\n");
      out.write("   </div>			 \n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/case02/show_lotto.jsp(45,9) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVarStatus("status");
      // /WEB-INF/views/case02/show_lotto.jsp(45,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("lotto");
      // /WEB-INF/views/case02/show_lotto.jsp(45,9) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/case02/show_lotto.jsp(45,9) '${ lottos }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${ lottos }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("				    		<tr>\n");
            out.write("				    			<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ status.index }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td><td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ lotto }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("				    			<td>\n");
            out.write("				    				<button type=\"button\" \n");
            out.write("				    						onclick=\"window.location.href='./update/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("';\"\n");
            out.write("				    						class=\"pure-button pure-button-primary\">\n");
            out.write("				        				修改\n");
            out.write("				        			</button>\n");
            out.write("				    			</td>\n");
            out.write("				    			<td>\n");
            out.write("				    				<button type=\"button\" \n");
            out.write("				    						onclick=\"window.location.href='./delete/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("';\"\n");
            out.write("				    						class=\"pure-button pure-button-primary\">\n");
            out.write("				        				刪除\n");
            out.write("				        			</button>\n");
            out.write("				    			</td>\n");
            out.write("				    		</tr>\n");
            out.write("				    	");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}