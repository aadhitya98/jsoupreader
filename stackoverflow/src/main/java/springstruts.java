import com.sun.xml.internal.ws.developer.MemberSubmissionEndpointReference;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

import javax.swing.text.Document;

import java.io.IOException;
import java.util.Scanner;

public class springstruts {
    public static void main(String args[]) throws IOException {
        int choice;
        System.out.println("Enter 1 for Spring");
        System.out.println("Enter 2 for Struts");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the choice");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                final org.jsoup.nodes.Document document= (org.jsoup.nodes.Document) Jsoup.connect("https://stackoverflow.com/questions/tagged/spring").get();
                //Elements
                final String springcount=document.select("div.summarycount").text();
                System.out.println(springcount);
                break;
                //Element spring= document.getElementById("summarycount");
            }
            case 2:
            {
                final org.jsoup.nodes.Document document= (org.jsoup.nodes.Document) Jsoup.connect("https://stackoverflow.com/questions/tagged/struts").get();
                final String strutscount=document.select("div.summarycount").text();
                System.out.println(strutscount);
                break;

            }


        }

    }
}
