import domain.Tracking;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@WebServlet(name = "TrackServlet")
@Transactional
public class TrackServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        // extracting form data and string into variables
        String receiverFullName = request.getParameter("reFlNm");
        String receiverPostCode = request.getParameter("rpstcd");


        String[] parcelFinder = {receiverFullName, receiverPostCode};

        searchData(parcelFinder, pw);

    }

    public String[] searchData(String[] parcelFinder, PrintWriter printWriter) {
        try {
            //receiving data from web services
            List<Tracking> trackings = ClientBuilder.newClient()
                    .target(
                            URI.create(new URL("http://localhost:8080/rest-backend/resources/tracking").toExternalForm()))
                    .request(MediaType.APPLICATION_JSON)
                    .get(new GenericType<List<Tracking>>() {
                    });
            //displaying retrieved data using HTML
            for (Tracking trackedData : trackings) {

                if (trackedData.getDestFullName().contains(parcelFinder[0]) &&
                        trackedData.getDestPostcode().contains(parcelFinder[1])) {

                    String title = "Courier ASAP";
                    String docType =
                            "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
                                    "Transitional//EN\">\n";
                    printWriter.println(docType +
                            "<HTML>\n" +
                            "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
                            "<BODY>\n" +
                            "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
                            "<p ALIGN=\"CENTER\"> Sender Name: " + trackedData.getFullName()+ "</p>\n" +
                            "<p ALIGN=\"CENTER\"> Sender Postcode: " + trackedData.getPostcode()+ "</p>\n" +
                            "<p ALIGN=\"CENTER\"> Receiver Name: " + trackedData.getDestFullName()+ "</p>\n" +
                            "<p ALIGN=\"CENTER\"> Receiver Postcode: " + trackedData.getDestPostcode()+ "</p>\n" +
                            "<p ALIGN=\"CENTER\"> Parcel Tacking Number: " + trackedData.getTracking()+ "</p>\n" +
                            "<p ALIGN=\"CENTER\"> Status: In Transit</p>\n" +
                            "</BODY></HTML>");
//                    String[] matchedData = {trackedData.toString()};
//                    printWriter.print(trackedData.toString());
//                    return matchedData;
                }else{
                    String title = "Courier ASAP";
                    String docType =
                            "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
                                    "Transitional//EN\">\n";
                    printWriter.println(docType +
                            "<HTML>\n" +
                            "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
                            "<BODY>\n" +
                            "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
                            "<p ALIGN=\"CENTER\"> No Booking Found </p>\n" +
                            "</BODY></HTML>");
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } finally {
        }
        return null;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
