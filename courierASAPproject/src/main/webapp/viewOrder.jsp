<%--
  Created by IntelliJ IDEA.
  User: Huzaifa
  Date: 17/03/2020
  Time: 6:41 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Mail Order Tracking</title>
    <link rel="stylesheet"
          href="css/styles.css"
          type="text/css"/>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <Title>View and Track</title>
</head>
<body>


<header>
    <div class="styleContain">
        <div id="navigationPane">
            <h1>Courier ASAP</h1>
        </div>
        <nav>
            <ul>
                <li><a href="index.jsp">home</a></li>
                <li class="currentHighlight"><a href="viewOrder.jsp">View and Track</a></li>
            </ul>
        </nav>
    </div>
</header>


<section id="slider">
    <div class="styleContain">
        <h1>Send parcel worldwide</h1>
    </div>
</section>


<section>
    <div class="styleContain">

        <form action="TrackServlet" method="post" class="formdesign">
            <h1>Enter Receiver Details to Track Order</h1>
            <label for="rFull">Receiver Name</label>
            <input name="reFlNm" id="rFull" type="text" placeholder="enter full name" required>

            <label for="Rpostcode">Receiver Postcode</label>
            <input name="rpstcd" id="Rpostcode" type="text" placeholder="enter postcode" required>


            <button type="submit" value="submit" id="createOrderBtn">Track Order</button>
        </form>
    </div>
</section>
<footer>© 2020 Courier ASAP</footer>

</body>
</html>
