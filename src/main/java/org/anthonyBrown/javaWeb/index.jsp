<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP 和 JavaScript 示例</title>
    <script>
        function submitForm() {
            const xhr = new XMLHttpRequest();
            const name = document.getElementById('name').value;

            xhr.open("POST", "process.jsp", true);
            xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

            // 定义请求的响应处理函数
            xhr.onreadystatechange = function() {
                if (xhr.readyState === 4 && xhr.status === 200) {
                    document.getElementById('result').innerHTML = xhr.responseText;
                }
            };

            // 发送请求
            xhr.send("name=" + encodeURIComponent(name));
        }
    </script>
</head>
<body>
<h1>JSP 和 JavaScript 示例</h1>
<form onsubmit="event.preventDefault(); submitForm();">
    <label for="name">输入你的名字：</label>
    <input type="text" id="name" name="name">
    <button type="submit">提交</button>
</form>
<div id="result"></div>
</body>
</html>
