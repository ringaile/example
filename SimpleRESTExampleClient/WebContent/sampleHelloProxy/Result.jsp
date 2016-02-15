<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleHelloProxyid" scope="session" class="com.example.webservice.HelloProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleHelloProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleHelloProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleHelloProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.example.webservice.Hello getHello10mtemp = sampleHelloProxyid.getHello();
if(getHello10mtemp == null){
%>
<%=getHello10mtemp %>
<%
}else{
        if(getHello10mtemp!= null){
        String tempreturnp11 = getHello10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        java.lang.String sayPlainTextHello13mtemp = sampleHelloProxyid.sayPlainTextHello();
if(sayPlainTextHello13mtemp == null){
%>
<%=sayPlainTextHello13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sayPlainTextHello13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 16:
        gotMethod = true;
        java.lang.String sayHtmlHello16mtemp = sampleHelloProxyid.sayHtmlHello();
if(sayHtmlHello16mtemp == null){
%>
<%=sayHtmlHello16mtemp %>
<%
}else{
        String tempResultreturnp17 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sayHtmlHello16mtemp));
        %>
        <%= tempResultreturnp17 %>
        <%
}
break;
case 19:
        gotMethod = true;
        java.lang.String sayXMLHello19mtemp = sampleHelloProxyid.sayXMLHello();
if(sayXMLHello19mtemp == null){
%>
<%=sayXMLHello19mtemp %>
<%
}else{
        String tempResultreturnp20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sayXMLHello19mtemp));
        %>
        <%= tempResultreturnp20 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>