package services;

import com.fasterxml.jackson.databind.*;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;


public class ApiFetchService {
    static private String apiUrl = "https://services.nvd.nist.gov/rest/json/cves/2.0/";


    static public void save50kData(){
        ObjectMapper om = new ObjectMapper();
        try{
            File newFile = new File("../data/data500.txt");

            for(int page = 0;page<25;page++){
                System.out.println("Page: " + page);
                URL url=new URL(apiUrl + "?resultsPerPage=2000&startIndex=" + 2000 * page);
                URLConnection urlCon = url.openConnection();
                InputStream stream=urlCon.getInputStream();
                String jsonData = new String(stream.readAllBytes(), StandardCharsets.UTF_8);

                JsonNode node = om.readTree(jsonData);
                System.out.println(node.get("startIndex"));
            }





        }catch(Exception e){System.out.println(e);}
    }


    }