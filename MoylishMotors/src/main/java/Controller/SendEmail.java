/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

    public void SendingEmail(String Email,String Body) throws AddressException, MessagingException
    {

             String host ="smtp.gmail.com";
             String from ="moylishmotorsjr@gmail.com";  //Your mail id
             String pass ="PleaseGodWork";   // Your Password
             Properties props = System.getProperties();
             props.put("mail.smtp.starttls.enable", "true"); // added this line
             props.put("mail.smtp.host", host);
             props.put("mail.smtp.user", from);
             props.put("mail.smtp.password", pass);
             props.put("mail.smtp.port", "25");
             props.put("mail.smtp.auth", "true");
             String[] to = {Email}; // To Email address
             Session session = Session.getDefaultInstance(props, null);
             MimeMessage message = new MimeMessage(session);
             message.setFrom(new InternetAddress(from));
             InternetAddress[] toAddress = new InternetAddress[to.length];        
             // To get the array of addresses
              for( int i=0; i < to.length; i++ )
              { // changed from a while loop
                  toAddress[i] = new InternetAddress(to[i]);
              }
             System.out.println(Message.RecipientType.TO);
             for( int j=0; j < toAddress.length; j++)
             { // changed from a while loop
             message.addRecipient(Message.RecipientType.TO, toAddress[j]);
             }
             message.setSubject("Email from SciArchives");

             message.setContent(Body,"text/html");
             Transport transport = session.getTransport("smtp");
             transport.connect(host, from, pass);
             transport.sendMessage(message, message.getAllRecipients());
                 transport.close();
        }
    }