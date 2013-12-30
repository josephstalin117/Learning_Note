<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>随机点名系统</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="css/navbar.css" rel="stylesheet">
    <link href="css/sticky-footer.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
  </head>
  <body>
    <div class="container">
    <!-- Static navbar -->
    <div class="navbar navbar-default navbar-fixed-top" role="navigation">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="index.jsp">随机点名</a>
      </div>
      <div class="navbar-collapse collapse">
        <ul class="nav navbar-nav" id="navLeft">
          <li id="navInsert"><a href="../RollNameJdbc/insert.jsp">添加同学</a></li>
          <li id="navDelete"><a href="../RollNameJdbc/delete.jsp">删除同学</a></li>
          <li id="navUpdate"><a href="../RollNameJdbc/update.jsp">更新学生</a></li>
          <li id="navRead"><a href="../RollNameJdbc/read.jsp">查询学生</a></li>
          <li class="dropdown" id="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" id="dropdownTitle">下拉菜单 <b class="caret"></b></a>
            <ul class="dropdown-menu">
              <li><a href="#">Action</a></li>
              <li><a href="#">Another action</a></li>
              <li><a href="#">Something else here</a></li>
              <li class="divider"></li>
              <li class="dropdown-header">Nav header</li>
              <li><a href="#">Separated link</a></li>
              <li><a href="#">One more separated link</a></li>
            </ul>
          </li>
        </ul>
        <ul class="nav navbar-nav navbar-right" id="navRight">
          <li class="active"><a href="#">Default</a></li>
          <li><a href="#">呵呵</a></li>
          <li><a href="#">哇咔咔</a></li>
        </ul>
      </div>
      <!--/.nav-collapse -->
    </div>

  </div>