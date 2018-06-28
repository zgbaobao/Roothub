<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>标签-roothub</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!-- 引入 Bootstrap -->
  <link href="/resources/css/bootstrap.min.css" rel="stylesheet">
  <link href="/resources/css/app.css" rel="stylesheet" type="text/css">
  <link rel="shortcut icon" href="/resources/images/favicon.ico">
</head>
<body>
<div class="wrapper">
<jsp:include page="../components/head.jsp"></jsp:include>
<div class="row">
  <div class="panel panel-default">
    <div class="panel-body">
      <div class="row">
      <c:forEach var="item" items="${tag.list}">
          <div class="col-md-3" style="margin-bottom: 10px; padding-left: 10px;">
            <a href="/topic/tag/${item.tag}">
              <span class="label label-success">${item.tag}</span>
            </a>
            <span class="text-muted">x ${item.number}</span>
            <small class="excerpt text-muted" style="display: block; margin-top: 10px;"></small>
          </div>
          </c:forEach>       
      </div>
  <div class="divide mar-top-5"></div>
<ul class="pagination pagination-sm pagination2"></ul>
    </div>
  </div>
</div>
  </div>
</div>
<jsp:include page="../components/foot.jsp"></jsp:include>
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="/resources/js/jquery.js"></script>
<!-- 引入 Bootstrap -->
<script src="/resources/js/bootstrap.min.js"></script>
<!-- 分页 -->
<script src="/resources/js/pagination2.js"></script>
<script type="text/javascript">
	$("#biaoqian").addClass("active");
	var url = "/tags?";
	$(".pagination2").pagination("${tag.pageNumber}","${tag.totalPage}",10);
</script>
</body>
</html>