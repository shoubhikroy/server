package server.rpc;

import server.beans.RegisterLoginInfo;
import server.beans.RegisterLoginResult;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import java.util.concurrent.ExecutionException;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface RemoteCalls
{
    @WebMethod
    RegisterLoginResult registerLogin(RegisterLoginInfo li) throws InterruptedException, ExecutionException;
}