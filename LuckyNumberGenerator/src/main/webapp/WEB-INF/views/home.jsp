<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Lucky Number Finder</title>

	<style>
		body {
			background-color: gray;
			font-family: Arial, sans-serif;
			text-align: center;
			margin: 0;
			padding: 0;
		}

		.container {
			width: 50%;
			margin: 100px auto;
			padding: 30px;
			background-color: white;
			border-radius: 10px;
			box-shadow: 0px 4px 15px rgba(0, 0, 0, 0.2);
		}

		h2 {
			color: #333;
			margin-bottom: 20px;
		}

		input[type="submit"] {
			background-color: #007BFF;
			color: white;
			border: none;
			padding: 12px 24px;
			font-size: 16px;
			border-radius: 6px;
			cursor: pointer;
			transition: background-color 0.3s ease;
		}

		input[type="submit"]:hover {
			background-color: #0056b3;
		}
	</style>
</head>
<body>

	<div class="container">
		<h2>Click the button to get your Lucky Number and Quote!</h2>

		<form id="myForm" method="get" action="http://localhost:8082/getquotes">
			<input type="submit" value="Get Lucky Number">
		</form>
	</div>

</body>
</html>
