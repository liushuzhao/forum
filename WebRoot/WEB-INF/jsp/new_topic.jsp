<%@ page language="java" pageEncoding="UTF-8"%>
<html>
	<head>
		<link type="text/css" rel="stylesheet" href="css/style.css" />
		<%
			common.WebEditor.createFCKEditor(request, "800", "450");
		%>
	</head>
	<body>

		<a href=""> 返回</a>
		<form name="postTopic" action="post_topic.action" method="post">
			标题：
			<input type="text" name="title" id="title" style="width: 720px" />
			<p />
				${requestScope.editor}
		</form>
		<p />
			<input type="button" onclick="new_topic()" value="提交" />
			<script type="text/javascript">
	  function new_topic()
	  {
 try
 { 
   var title = document.getElementById("title");
   
   if(title.value.replace(/(^\s*)/g, "") == "")
   {
       alert("请输入标题!");
       title.focus();
       return;
   }          
  
       postTopic.submit();

   }
   catch(e)
   {
       alert(e);
   }
}
  </script>
	</body>
</html>