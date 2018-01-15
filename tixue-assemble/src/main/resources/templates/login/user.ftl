<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>登录 | 爱旅行@Travel</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet">
</head>

<body style="background-color: #f1f1f1; padding-bottom: 0">
<#include "../layout/header.ftl">

<div id="fh5co-wrapper">
    <div id="fh5co-page">
        <#include "../layout/guide.ftl">
        <div class="container" style="margin-top: 60px">
            <div style="text-align: center; margin-top: 10%">
                <p style="margin-top: 25px; font-size: 20; color: crimson">欢迎你:${userName}!</p>
                <form action="/logout.htm" method="post">
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    <button class="btn btn-danger" style="margin-top: 20px">退出登录</button>
                </form>
            </div>
        </div>
        <#include "../layout/footer.ftl">
    </div>
</div>
<#include "../layout/js.ftl">
</body>

</html>
