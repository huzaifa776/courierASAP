import domain.Tracking;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.Response;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.util.Random;

@WebServlet(name = "OrderServlet")
public class OrderServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw  = response.getWriter();

        // extracting form data and string into variables
        String senderFullName = request.getParameter("nameFulln");
        String senderHouseAndStreet = request.getParameter("houseAndStreetn");
        String senderCity = request.getParameter("cityn");
        String senderPostCode = request.getParameter("postcoden");
        String receiverFullName = request.getParameter("destFullNamen");
        String receiverHouseAndStreet = request.getParameter("desthouseAndStreetn");
        String receiverCity = request.getParameter("destcityn");
        String receiverPostCode = request.getParameter("destpostcoden");

        //string variables of extracted into an array
        String[] parcelDetails = {senderFullName, senderHouseAndStreet, senderCity, senderPostCode,
                receiverFullName, receiverHouseAndStreet, receiverCity, receiverPostCode};

        storeData(parcelDetails);


        response.sendRedirect(request.getContextPath()+"/bookingConfirm.jsp");

    }


    private void storeData(String[] parcelDetails) {
        try {

            //mapping the forms fields to databases records
            Tracking addingData = new Tracking();
            addingData.setFullName(parcelDetails[0]);
            addingData.setHouseAndStreet(parcelDetails[1]);
            addingData.setCity(parcelDetails[2]);
            addingData.setPostcode(parcelDetails[3]);
            addingData.setDestFullName(parcelDetails[4]);
            addingData.setDestHouseAndStreet(parcelDetails[5]);
            addingData.setDestCity(parcelDetails[6]);
            addingData.setDestPostcode(parcelDetails[7]);
            addingData.setTracking((int) generateRandom(12));

            //converting data into JSON and sending it to web service
            Entity<Tracking> rasd = Entity.entity(addingData, MediaType.APPLICATION_JSON_TYPE);
            javax.ws.rs.core.Response post = ClientBuilder.newClient()
                    .target(
                            URI.create(new URL("http://localhost:8080/rest-backend/resources/tracking").toExternalForm()))
                    .request(MediaType.APPLICATION_JSON_TYPE)
                    .post(rasd);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

        }
    }

    //method to generate random tracking number
    public long generateRandom(int length) {
        Random random = new Random();
        char[] digits = new char[length];
        digits[0] = (char) (random.nextInt(9) + '1');
        for (int i = 1; i < length; i++) {
            digits[i] = (char) (random.nextInt(10) + '0');
        }
        return Long.parseLong(new String(digits));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
