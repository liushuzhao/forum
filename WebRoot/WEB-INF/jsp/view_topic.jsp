<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<script src="javascript/prototype.js" type="text/javascript">
</script>

		<script type="text/javascript" src="javascript/common.js">
</script>
		<link type="text/css" rel="stylesheet" href="css/style.css" />
	</head>
	<body>
		<span style="font-size: 13px"> <a href="main.action"> 返回</a>
		</span>
		<p />
			<span style="font-size: 13px"> 标题：<b><s:property
						value="topic.topic" />
			</b>
			</span>
		<p />
		<div style="padding-left: 10px; width: 90%">



			<table width="100%">
				<tr>
					<td valign="top" style="padding-top: 5px;" class="line_bottom">

						<span class="floatright gray">浏览：<s:property
								value="topic.viewCount" />
						</span><span>作者：<b><s:property value="user" />
						</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;发表时间：</span><span class="green"><s:property
								value="topic.formattedPostTopicTime" />
						</span>
						<br />
						<div class="Content"><jsp:include page="${topicURL}" /></div>
						<div class="gray" style="text-align: right">
							楼主
						</div>
					</td>
				</tr>

			</table>

			<p />
				<s:iterator id="review" value="reviews" status="status">
					<table width="100%" border="0" style="table-layout: fixed;">
						<tr>
							<td width="20px" class="thread_bottom">
								&nbsp;
							</td>
							<td align="right" valign="top" width="50px" class="thread_bottom">

							</td>

							<td valign="top" class="line_bottom">

								<span class="green"
									title="回复时间：<s:property value='#review.formattedReviewTime'/>">
									<s:property value='#review.reviewTimeInterval' /> </span>&nbsp;&nbsp;
								<b> <s:property value='#review.reviewUser.name' />&nbsp;:</b>
								<br />
								<div class="CommentBody"><jsp:include
										page="${topicPath}${review.id}.txt" /></div>
								<div class="gray" style="text-align: right">
									&nbsp;
									<s:property value="#status.count" />
									楼
									<a href="#top"><img height="25" width="14" border="0"
											src="images/uparrow.gif" align="absmiddle" alt="回到顶楼">
									</a>&nbsp;
								</div>

							</td>
						</tr>
					</table>
					<p />
				</s:iterator>
		</div>
		<div>
			<b>我的回复：</b>
			<p />
			<form name="postReview" action="post_review.action" method="post">
				<input type="hidden" name="user" value="${param.user}">
				<input type="hidden" name="path" value="${param.path}">
				${requestScope.editor}
			</form>
			<p />
			<p />

				<input type="button" value="提交" onclick="post_review()" />
		</div>
		<script type="text/javascript">

 var timer = setTimeout("scroller()",5);
  function scroller()
  {
      window.scroll(0,10000);      
      clearTimeout(timer)
    
  }
  
  function post_review()
  {
      
      postReview.submit();
  }

  </script>
	</body>
</html>