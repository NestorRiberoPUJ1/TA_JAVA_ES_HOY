<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
        </head>

        <body>
            <h1>SEND AN OMIKUJI</h1>
            <form action="/omikuji" method="post">
                <div>
                    <label>Pick a number</label>
                    <input type="number" name="years">
                </div>
                <div>
                    <label>Enter a city</label>
                    <input type="text" name="place">
                </div>
                <div>
                    <label>Enter a real person name</label>
                    <input type="text" name="person">
                </div>
                <div>
                    <label>Enter a hobby</label>
                    <input type="text" name="hobby">
                </div>
                <div>
                    <label>Enter a living place</label>
                    <input type="text" name="living">
                </div>
                <div>
                    <label>Say something nice</label>
                    <textarea name="message"></textarea>
                </div>
                <div>
                    <label>Send and show a friend</label>
                    <input type="submit" value="Send">
                </div>
            </form>
        </body>

        </html>