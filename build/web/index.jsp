<%-- 
    Document   : index
    Created on : Nov 12, 2018, 10:59:37 PM
    Author     : Sarthak Jain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%
	if(request.getSession().getAttribute("loggedIn") == "true")
	{
		%>
		<script>
			alert("Redirecting back to your logged in session...");
			<%
			if(request.getSession().getAttribute("user").equals("admin"))
                        {
				%>
				location = "home_admin.jsp";
				<%
                        }
                        else if(request.getSession().getAttribute("user").equals("student"))
                        {
			%>
				location = "home_student.jsp";
                        <%
                        }
                        %>
		</script>
		<%
	}
	else
	{
%>
<html>
    <head>
        <title>ERP - Beta Version | Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<style>
		*
		{
			font-family: Segoe UI;
		}
		legend
		{
			color: crimson;
		}
		@font-face
		{
			font-family: DS Digi;
			src: url('sources/DS-DIGI.TTF')
		}
		#timebox
		{
			background-color: black;
			color: white;
			font-family: DS Digi;
			font-size: 20px;
			text-align: right;
			padding: 12px;
			border-radius: 10px;
		}
		</style>
		<script type = "text/javascript">
			function updateTime()
			{
				var d = new Date();
				var tt = "AM"
				var hh = d.getHours();
				var mm = d.getMinutes();
				var ss = d.getSeconds();

				if(parseInt(hh/10) == 0)
					hh = "0"+hh;

				if(hh > 12)
				{
					hh = hh - 12;
					tt = "PM";
				}

				if(parseInt(mm/10) == 0)
					mm = "0"+mm;

				if(parseInt(ss/10) == 0)
					ss = "0"+ss;

				document.getElementById("timebox").innerHTML = "#Time: " + hh+":"+mm+":"+ss+" "+tt+" #Date: "+d.getDate()+"/"+(d.getMonth()+1)+"/"+d.getFullYear();
			}
		</script>
    </head>
    <body background = "sources\grey-chevron-stripes-1920.png" style = "background-attachment: fixed;">
		<script>
		setInterval(updateTime, 1000);
		</script>
		
		<div id = "timebox"> Time will load up here shortly... </div>
        <div style = "border: 10px solid grey;border-radius: 10px;background-color:white;margin: 200px 200px 200px 200px;padding: 0px 20px 20px 20px;">
			<form id = "login-form" action = "Login" method="POST">
				<fieldset>
					<legend align="center">
						<h1>LOGIN</h1>
					</legend>
					<table>
						<tr>
						<td width="60%" style="padding: 0px 0px 0px 40px"><img src="sources/logo.png" style = "height: 300px;width: 300px;"></td>
						<td style="text-align: justify;">
						<h2>
						Login ID : <input type="text" placeholder="ID" name = "id" autofocus required><br>
						Password : <input type="password" placeholder="password" name = "pass" required><br><br>
						<input type="submit" value="Login" style="background-color: crimson;color: white;border: 2px dotted grey; height: 40px; width: 80px;">
						</h2>
						</td>
						</tr>
					</table>
				</fieldset>
			</form>
		</div>
    </body>
</html>
<%
	}
%>