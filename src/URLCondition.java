import java.util.*;
public class URLCondition {
    public static void main(String args[]){
        String url= null;
        System.out.println("Enter the full url of the website");
        Scanner sc = new Scanner (System.in);
        url = sc.nextLine();
        if(url.startsWith("http")){
            String protocol = url.substring(0,url.indexOf(":"));
            System.out.println(protocol);
            if(protocol.equals("https")){
            System.out.println("TCP protocol");
            }else if (protocol.equals("http")){
                System.out.println("UDP protocol");
            }
        }else{
            System.out.println("No protocol mentioned!!!");
        }
        String ext = url.substring(url.lastIndexOf(".")+1, url.length());
        if(ext.equals("com")){
            System.out.println("Its commercial");
            
        }else if(ext.equals("in")){
            System.out.println("Indian website");
        }else if(ext.equals("net")){
            System.out.println("Networking website");
        }else if(ext.equals("org")){
            System.out.println("Organization website");
        }else{
            System.out.println("Invaild extention");
        }
    }
}