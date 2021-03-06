<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>注册 | 爱旅行@Travel</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet">
</head>
<#include "../layout/header.ftl">
<body style="background-color: #f1f1f1; padding-bottom: 0">
<div id="fh5co-wrapper">
    <div id="fh5co-page">
        <#include "../layout/guide.ftl">
        <div class="container" style="margin-top: 40px">

            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title">爱旅行@Travel</h3>
                        </div>
                        <div class="panel-body">
                            <form action="/register.htm" method="post">
                                <div class="form-group" style="margin-top: 30px">
                                    <div class="input-group col-md-6 col-md-offset-3">
                                        <div class="input-group-addon"><span class="glyphicon glyphicon-user"></span>
                                        </div>
                                        <input type="text" class="form-control" name="username" id="username"
                                               placeholder="账号">
                                    </div>
                                </div>
                                <div class="form-group ">
                                    <div class="input-group col-md-6 col-md-offset-3">
                                        <div class="input-group-addon"><span class="glyphicon glyphicon-lock"></span>
                                        </div>
                                        <input type="password" class="form-control" name="password" id="password"
                                               placeholder="密码">
                                    </div>
                                </div>
                                <br>
                                <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
                                <div class="form-group">
                                    <div class="input-group col-md-6 col-md-offset-3 col-xs-12 ">
                                        <button type="submit" class="btn btn-primary btn-block">注册</button>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="input-group col-md-6 col-md-offset-3" style="text-align: center">
                                        <a href="/toLogin.htm">返回登录页面</a>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <#include "../layout/footer.ftl">
    </div>
</div>
<#include "../layout/js.ftl">
</body>

</html>
