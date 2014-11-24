<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
  <link href="./css/style.css" 
              rel="stylesheet" type="text/css"/> 
<title>Cacher POC</title>
</head>
<body>
      <table>
            <tr>
                <td style='width: 30%;'><img src='images/newapp-icon.png'>
                </td>
                <td>
            Hello from EJB Cache POC 
            <br />
            <br />
            <a href="EhCacheServlet?action=listEmployee" >Show All Employee Items with EHCache</a>
             <br />
            <a href="HazelcastCacheServlet?action=listEmployee" >Show All Employee Items with Hazelcast</a>
            <br />
            <a href="MemCachedServlet?action=listEmployee" >Show All Employee Items with MemCached</a> 
            <br />
            <a href="OsCacheServlet?action=listEmployee" >Show All Employee Items with OSCache</a>
                </td>
            </tr>
      </table>
</body>
</html>