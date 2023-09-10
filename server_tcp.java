import java.net.*;
import java.io.*;
public class server_tcp
{
 private socket socket=null;
 private serversocket server=null;
 private DataInputStream in=null;
 public server_tcp(int port)
 {
  try
  {
   server=new serversocket(port);
   System.out.println("Server Started");
   System.out.println("Waiting for a client");
   socket=server.accept();
   System.out.println("Client Accepted");
   in=new DataInputStream(new BufferedInputStream socket.get InputStream()));
   String line=" ";
   while(!line.equals("over"))
   {
    try
    {
     line=in.readUTF();
     System.out.println(line);
    }
    catch(IOException i)
    {
     System.out.println(i);
    }
   }
   System.out.println("Closing Connection");
   socket.close();
   in.close();
  }
  catch(IOException i)
  {
   System.out.println(i);
  }
 }
 public static void main(String args[])
{
 server_tcp servertcp=new server_tcp(5000);
}
}