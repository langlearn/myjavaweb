<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/10/30
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div id="content"></div>
<script id="test" type="text/html">
    <h1>{{title}}</h1>
    <ul>
        {{each list as value i}}
        <li>索引 {{i + 1}} ：{{value}}</li>
        {{/each}}
    </ul>
</script>
<script type="text/javascript" src="static/template.js"></script>
<script type="text/javascript">
    var data = {
        title: '标签',
        list: ['文艺', '博客', '摄影', '电影', '民谣', '旅行', '吉他']
    };
    var html = template('test', data);
    document.getElementById('content').innerHTML = html;
</script>
</body>
</html>
