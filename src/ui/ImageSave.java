/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import gui.ava.html.image.generator.HtmlImageGenerator;
import java.awt.Dimension;

/**
 *
 * @author Youtube
 */
public class ImageSave {
    public static void main(String[] args) {
        HtmlImageGenerator imageGenerator = new HtmlImageGenerator();
        //imageGenerator.loadHtml("<b>Hello World!</b> Please goto <a title=\"Goto Google\" href=\"http://www.google.com\">Google</a>."); 
       
        
        //imageGenerator.loadUrl("file:///E:/WEBSITES/invoice%20template/example2/index.html");
        imageGenerator.loadUrl("file:///E:/WEBSITES/invoice%20template/index.html");
        /*imageGenerator.loadHtml("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"  <head>\n" +
"    <meta charset=\"utf-8\">\n" +
"    <title>Example 2</title>\n" +
"    <link rel=\"stylesheet\" href=\"style.css\" media=\"all\" />\n" +
"  </head>\n" +
"  <body>\n" +
"    <header class=\"clearfix\">\n" +
"      <div id=\"logo\">\n" +
"        <img src=\"logo.png\">\n" +
"      </div>\n" +
"      <div id=\"company\">\n" +
"        <h2 class=\"name\">Company Name</h2>\n" +
"        <div>455 Foggy Heights, AZ 85004, US</div>\n" +
"        <div>(602) 519-0450</div>\n" +
"        <div><a href=\"mailto:company@example.com\">company@example.com</a></div>\n" +
"      </div>\n" +
"      </div>\n" +
"    </header>\n" +
"    <main>\n" +
"      <div id=\"details\" class=\"clearfix\">\n" +
"        <div id=\"client\">\n" +
"          <div class=\"to\">INVOICE TO:</div>\n" +
"          <h2 class=\"name\">John Doe</h2>\n" +
"          <div class=\"address\">796 Silver Harbour, TX 79273, US</div>\n" +
"          <div class=\"email\"><a href=\"mailto:john@example.com\">john@example.com</a></div>\n" +
"        </div>\n" +
"        <div id=\"invoice\">\n" +
"          <h1>INVOICE 3-2-1</h1>\n" +
"          <div class=\"date\">Date of Invoice: 01/06/2014</div>\n" +
"          <div class=\"date\">Due Date: 30/06/2014</div>\n" +
"        </div>\n" +
"      </div>\n" +
"      <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
"        <thead>\n" +
"          <tr>\n" +
"            <th class=\"no\">#</th>\n" +
"            <th class=\"desc\">DESCRIPTION</th>\n" +
"            <th class=\"unit\">UNIT PRICE</th>\n" +
"            <th class=\"qty\">QUANTITY</th>\n" +
"            <th class=\"total\">TOTAL</th>\n" +
"          </tr>\n" +
"        </thead>\n" +
"        <tbody>\n" +
"          <tr>\n" +
"            <td class=\"no\">01</td>\n" +
"            <td class=\"desc\"><h3>Website Design</h3>Creating a recognizable design solution based on the company's existing visual identity</td>\n" +
"            <td class=\"unit\">$40.00</td>\n" +
"            <td class=\"qty\">30</td>\n" +
"            <td class=\"total\">$1,200.00</td>\n" +
"          </tr>\n" +
"          <tr>\n" +
"            <td class=\"no\">02</td>\n" +
"            <td class=\"desc\"><h3>Website Development</h3>Developing a Content Management System-based Website</td>\n" +
"            <td class=\"unit\">$40.00</td>\n" +
"            <td class=\"qty\">80</td>\n" +
"            <td class=\"total\">$3,200.00</td>\n" +
"          </tr>\n" +
"          <tr>\n" +
"            <td class=\"no\">03</td>\n" +
"            <td class=\"desc\"><h3>Search Engines Optimization</h3>Optimize the site for search engines (SEO)</td>\n" +
"            <td class=\"unit\">$40.00</td>\n" +
"            <td class=\"qty\">20</td>\n" +
"            <td class=\"total\">$800.00</td>\n" +
"          </tr>\n" +
"        </tbody>\n" +
"        <tfoot>\n" +
"          <tr>\n" +
"            <td colspan=\"2\"></td>\n" +
"            <td colspan=\"2\">SUBTOTAL</td>\n" +
"            <td>$5,200.00</td>\n" +
"          </tr>\n" +
"          <tr>\n" +
"            <td colspan=\"2\"></td>\n" +
"            <td colspan=\"2\">TAX 25%</td>\n" +
"            <td>$1,300.00</td>\n" +
"          </tr>\n" +
"          <tr>\n" +
"            <td colspan=\"2\"></td>\n" +
"            <td colspan=\"2\">GRAND TOTAL</td>\n" +
"            <td>$6,500.00</td>\n" +
"          </tr>\n" +
"        </tfoot>\n" +
"      </table>\n" +
"      <div id=\"thanks\">Thank you!</div>\n" +
"      <div id=\"notices\">\n" +
"        <div>NOTICE:</div>\n" +
"        <div class=\"notice\">A finance charge of 1.5% will be made on unpaid balances after 30 days.</div>\n" +
"      </div>\n" +
"    </main>\n" +
"    <footer>\n" +
"      Invoice was created on a computer and is valid without the signature and seal.\n" +
"    </footer>\n" +
"  </body>\n" +
"</html>"); */
        
        Dimension dimen = imageGenerator.getSize();
        System.out.println("width : "+dimen.getWidth());
        System.out.println("height : "+dimen.getHeight());
        
        try{
            imageGenerator.saveAsImage("hello-world.png"); 
            imageGenerator.saveAsHtmlWithMap("hello-world.html", "hello-world.png");
            
            System.out.println("Saved");
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
