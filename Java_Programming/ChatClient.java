import java.net.*;
import java.io.*;

class ChatClient
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("Client is ready to conect with server");

        Socket sobj = new Socket("localhost",5100);
        System.out.println("Marvellous client is succesfully connect with server");


        PrintStream pobj = new PrintStream(sobj.getOutputStream());

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        String str = bobj1.readLine();
        System.out.println("Message from server : "+str);

        pobj.println("Hi message for client");

    }
}