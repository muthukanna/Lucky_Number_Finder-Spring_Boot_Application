<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lucky Number Page</title>
</head>
<body style="margin: 0; padding: 0; font-family: Arial, sans-serif; background-color: gray;">

    <div style="max-width: 600px; margin: 50px auto; padding: 20px; background-color: white; 
                border-radius: 12px; box-shadow: 0 0 10px rgba(0,0,0,0.1);">

        <h2 style="text-align: center; color: #333;">Your Lucky Number & Daily Inspiration</h2>

        <table style="width: 100%; border-collapse: collapse; margin-top: 20px;">
            <thead>
                <tr style="background-color: #007BFF; color: white;">
                    <th style="padding: 12px; border: 1px solid #ccc;">Lucky Number</th>
                    <th style="padding: 12px; border: 1px solid #ccc;">Quote of the Day</th>
                    <th style="padding: 12px; border: 1px solid #ccc;">Author</th>
                </tr>
            </thead>
            <tbody>
                <tr style="text-align: center;">
                    <td style="padding: 12px; border: 1px solid #ccc; font-weight: bold; color: #007BFF;">
                        ${numbers.number}
                    </td>
                    <td style="padding: 12px; border: 1px solid #ccc;">
                        "${numbers.quotes.quotes}"
                    </td>
                    <td style="padding: 12px; border: 1px solid #ccc; font-style: italic;">
                        - ${numbers.quotes.author}
                    </td>
                </tr>
            </tbody>
        </table>

    </div>

</body>
</html>
