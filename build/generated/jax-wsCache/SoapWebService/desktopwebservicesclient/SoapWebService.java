
package desktopwebservicesclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SoapWebService", targetNamespace = "http://webservice.hotel/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SoapWebService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "test", targetNamespace = "http://webservice.hotel/", className = "desktopwebservicesclient.Test")
    @ResponseWrapper(localName = "testResponse", targetNamespace = "http://webservice.hotel/", className = "desktopwebservicesclient.TestResponse")
    @Action(input = "http://webservice.hotel/SoapWebService/testRequest", output = "http://webservice.hotel/SoapWebService/testResponse")
    public String test(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param reqWorker
     * @return
     *     returns desktopwebservicesclient.RespStatus
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addWorker", targetNamespace = "http://webservice.hotel/", className = "desktopwebservicesclient.AddWorker")
    @ResponseWrapper(localName = "addWorkerResponse", targetNamespace = "http://webservice.hotel/", className = "desktopwebservicesclient.AddWorkerResponse")
    @Action(input = "http://webservice.hotel/SoapWebService/addWorkerRequest", output = "http://webservice.hotel/SoapWebService/addWorkerResponse")
    public RespStatus addWorker(
        @WebParam(name = "reqWorker", targetNamespace = "")
        ReqWorker reqWorker);

    /**
     * 
     * @param reqLogin
     * @return
     *     returns desktopwebservicesclient.RespLogin
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginUser", targetNamespace = "http://webservice.hotel/", className = "desktopwebservicesclient.LoginUser")
    @ResponseWrapper(localName = "loginUserResponse", targetNamespace = "http://webservice.hotel/", className = "desktopwebservicesclient.LoginUserResponse")
    @Action(input = "http://webservice.hotel/SoapWebService/loginUserRequest", output = "http://webservice.hotel/SoapWebService/loginUserResponse")
    public RespLogin loginUser(
        @WebParam(name = "reqLogin", targetNamespace = "")
        ReqLogin reqLogin);

    /**
     * 
     * @param reqLogin
     * @return
     *     returns desktopwebservicesclient.RespStatus
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "logout", targetNamespace = "http://webservice.hotel/", className = "desktopwebservicesclient.Logout")
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "http://webservice.hotel/", className = "desktopwebservicesclient.LogoutResponse")
    @Action(input = "http://webservice.hotel/SoapWebService/logoutRequest", output = "http://webservice.hotel/SoapWebService/logoutResponse")
    public RespStatus logout(
        @WebParam(name = "reqLogin", targetNamespace = "")
        ReqLogout reqLogin);

    /**
     * 
     * @param reqWorker
     * @return
     *     returns desktopwebservicesclient.RespStatus
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateWorker", targetNamespace = "http://webservice.hotel/", className = "desktopwebservicesclient.UpdateWorker")
    @ResponseWrapper(localName = "updateWorkerResponse", targetNamespace = "http://webservice.hotel/", className = "desktopwebservicesclient.UpdateWorkerResponse")
    @Action(input = "http://webservice.hotel/SoapWebService/updateWorkerRequest", output = "http://webservice.hotel/SoapWebService/updateWorkerResponse")
    public RespStatus updateWorker(
        @WebParam(name = "reqWorker", targetNamespace = "")
        ReqWorker reqWorker);

    /**
     * 
     * @param workerId
     * @return
     *     returns desktopwebservicesclient.RespWorker
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWorkerById", targetNamespace = "http://webservice.hotel/", className = "desktopwebservicesclient.GetWorkerById")
    @ResponseWrapper(localName = "getWorkerByIdResponse", targetNamespace = "http://webservice.hotel/", className = "desktopwebservicesclient.GetWorkerByIdResponse")
    @Action(input = "http://webservice.hotel/SoapWebService/getWorkerByIdRequest", output = "http://webservice.hotel/SoapWebService/getWorkerByIdResponse")
    public RespWorker getWorkerById(
        @WebParam(name = "workerId", targetNamespace = "")
        ReqWorkerId workerId);

    /**
     * 
     * @param workerId
     * @return
     *     returns desktopwebservicesclient.RespStatus
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteWorker", targetNamespace = "http://webservice.hotel/", className = "desktopwebservicesclient.DeleteWorker")
    @ResponseWrapper(localName = "deleteWorkerResponse", targetNamespace = "http://webservice.hotel/", className = "desktopwebservicesclient.DeleteWorkerResponse")
    @Action(input = "http://webservice.hotel/SoapWebService/deleteWorkerRequest", output = "http://webservice.hotel/SoapWebService/deleteWorkerResponse")
    public RespStatus deleteWorker(
        @WebParam(name = "workerId", targetNamespace = "")
        Long workerId);

    /**
     * 
     * @param arg0
     * @return
     *     returns desktopwebservicesclient.RespWorkerList
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWorkerList", targetNamespace = "http://webservice.hotel/", className = "desktopwebservicesclient.GetWorkerList")
    @ResponseWrapper(localName = "getWorkerListResponse", targetNamespace = "http://webservice.hotel/", className = "desktopwebservicesclient.GetWorkerListResponse")
    @Action(input = "http://webservice.hotel/SoapWebService/getWorkerListRequest", output = "http://webservice.hotel/SoapWebService/getWorkerListResponse")
    public RespWorkerList getWorkerList(
        @WebParam(name = "arg0", targetNamespace = "")
        ReqToken arg0);

}