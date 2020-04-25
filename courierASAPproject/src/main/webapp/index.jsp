<%--
  Created by IntelliJ IDEA.
  User: Huzaifa
  Date: 17/03/2020
  Time: 6:34 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mail Order Tracking</title>
    <link rel="stylesheet"
          href="css/styles.css"
          type="text/css"/>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <Title>Courier ASAP</title>
</head>
<body>


<header>
    <div class="styleContain">
        <div id="navigationPane">
            <h1>Courier ASAP</h1>
        </div>
        <nav>
            <ul>
                <li class="currentHighlight"><a href="index.jsp">home</a></li>
                <li><a href="viewOrder.jsp">View and Track</a></li>
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


        <form action="OrderServlet" method="post" class="formdesign">


            <h1>Enter Receiver Details to Track Order</h1>


            <h1>Enter Sender Details</h1>
            <label for="nameFull">Sender Name</label>
            <input name="nameFulln" id="nameFull" type="text" placeholder="enter full name" required>

            <label for="houseAndStreet">House Number and Street</label>
            <input name="houseAndStreetn" id="houseAndStreet" type="text" placeholder="enter house number and street"
                   required>

            <label for="city">City</label>
            <input name="cityn" id="city" type="text" placeholder="enter city" required>

            <label for="postcode">Postcode</label>
            <input name="postcoden" id="postcode" type="text" placeholder="enter postcode" required>

            <h1>Enter Parcel Destination</h1>

            <label for="destFullName">Receiver Name</label>
            <input name="destFullNamen" id="destFullName" type="text" placeholder="enter full name" required>

            <label for="desthouseAndStreet">House Number and Street</label>
            <input name="desthouseAndStreetn" id="desthouseAndStreet" type="text"
                   placeholder="enter house number and street" required>

            <label for="destcity">Destination City</label>
            <input name="destcityn" id="destcity" type="text" placeholder="enter city" required>

            <label for="destpostcode">Destination Postcode</label>
            <input name="destpostcoden" id="destpostcode" type="text" placeholder="enter postcode" required>

            <button type="submit" value="submit" id="createOrderBtn">Create Order</button>
        </form>
    </div>
</section>
<footer>© 2020 Courier ASAP</footer>


</body>
</html>
