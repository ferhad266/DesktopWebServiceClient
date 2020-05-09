
package desktopwebservicesclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the desktopwebservicesclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Worker_QNAME = new QName("http://webservice.hotel/", "Worker");
    private final static QName _RespWorkerList_QNAME = new QName("http://webservice.hotel/", "respWorkerList");
    private final static QName _AddWorkerResponse_QNAME = new QName("http://webservice.hotel/", "addWorkerResponse");
    private final static QName _LoginUser_QNAME = new QName("http://webservice.hotel/", "loginUser");
    private final static QName _Logout_QNAME = new QName("http://webservice.hotel/", "logout");
    private final static QName _ReqWorker_QNAME = new QName("http://webservice.hotel/", "reqWorker");
    private final static QName _ReqWorkerId_QNAME = new QName("http://webservice.hotel/", "reqWorkerId");
    private final static QName _LoginUserResponse_QNAME = new QName("http://webservice.hotel/", "loginUserResponse");
    private final static QName _RespLogin_QNAME = new QName("http://webservice.hotel/", "respLogin");
    private final static QName _LogoutResponse_QNAME = new QName("http://webservice.hotel/", "logoutResponse");
    private final static QName _GetWorkerByIdResponse_QNAME = new QName("http://webservice.hotel/", "getWorkerByIdResponse");
    private final static QName _ReqToken_QNAME = new QName("http://webservice.hotel/", "reqToken");
    private final static QName _TestResponse_QNAME = new QName("http://webservice.hotel/", "testResponse");
    private final static QName _ReqLogin_QNAME = new QName("http://webservice.hotel/", "reqLogin");
    private final static QName _DeleteWorker_QNAME = new QName("http://webservice.hotel/", "deleteWorker");
    private final static QName _GetWorkerById_QNAME = new QName("http://webservice.hotel/", "getWorkerById");
    private final static QName _DeleteWorkerResponse_QNAME = new QName("http://webservice.hotel/", "deleteWorkerResponse");
    private final static QName _ReqLogout_QNAME = new QName("http://webservice.hotel/", "reqLogout");
    private final static QName _RespStatus_QNAME = new QName("http://webservice.hotel/", "respStatus");
    private final static QName _Test_QNAME = new QName("http://webservice.hotel/", "test");
    private final static QName _GetWorkerList_QNAME = new QName("http://webservice.hotel/", "getWorkerList");
    private final static QName _AddWorker_QNAME = new QName("http://webservice.hotel/", "addWorker");
    private final static QName _UpdateWorker_QNAME = new QName("http://webservice.hotel/", "updateWorker");
    private final static QName _GetWorkerListResponse_QNAME = new QName("http://webservice.hotel/", "getWorkerListResponse");
    private final static QName _UpdateWorkerResponse_QNAME = new QName("http://webservice.hotel/", "updateWorkerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: desktopwebservicesclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link LoginUserResponse }
     * 
     */
    public LoginUserResponse createLoginUserResponse() {
        return new LoginUserResponse();
    }

    /**
     * Create an instance of {@link RespLogin }
     * 
     */
    public RespLogin createRespLogin() {
        return new RespLogin();
    }

    /**
     * Create an instance of {@link ReqWorker }
     * 
     */
    public ReqWorker createReqWorker() {
        return new ReqWorker();
    }

    /**
     * Create an instance of {@link ReqWorkerId }
     * 
     */
    public ReqWorkerId createReqWorkerId() {
        return new ReqWorkerId();
    }

    /**
     * Create an instance of {@link LoginUser }
     * 
     */
    public LoginUser createLoginUser() {
        return new LoginUser();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link AddWorkerResponse }
     * 
     */
    public AddWorkerResponse createAddWorkerResponse() {
        return new AddWorkerResponse();
    }

    /**
     * Create an instance of {@link RespWorker }
     * 
     */
    public RespWorker createRespWorker() {
        return new RespWorker();
    }

    /**
     * Create an instance of {@link RespWorkerList }
     * 
     */
    public RespWorkerList createRespWorkerList() {
        return new RespWorkerList();
    }

    /**
     * Create an instance of {@link GetWorkerListResponse }
     * 
     */
    public GetWorkerListResponse createGetWorkerListResponse() {
        return new GetWorkerListResponse();
    }

    /**
     * Create an instance of {@link UpdateWorkerResponse }
     * 
     */
    public UpdateWorkerResponse createUpdateWorkerResponse() {
        return new UpdateWorkerResponse();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link DeleteWorkerResponse }
     * 
     */
    public DeleteWorkerResponse createDeleteWorkerResponse() {
        return new DeleteWorkerResponse();
    }

    /**
     * Create an instance of {@link ReqLogout }
     * 
     */
    public ReqLogout createReqLogout() {
        return new ReqLogout();
    }

    /**
     * Create an instance of {@link RespStatus }
     * 
     */
    public RespStatus createRespStatus() {
        return new RespStatus();
    }

    /**
     * Create an instance of {@link AddWorker }
     * 
     */
    public AddWorker createAddWorker() {
        return new AddWorker();
    }

    /**
     * Create an instance of {@link UpdateWorker }
     * 
     */
    public UpdateWorker createUpdateWorker() {
        return new UpdateWorker();
    }

    /**
     * Create an instance of {@link GetWorkerList }
     * 
     */
    public GetWorkerList createGetWorkerList() {
        return new GetWorkerList();
    }

    /**
     * Create an instance of {@link DeleteWorker }
     * 
     */
    public DeleteWorker createDeleteWorker() {
        return new DeleteWorker();
    }

    /**
     * Create an instance of {@link GetWorkerById }
     * 
     */
    public GetWorkerById createGetWorkerById() {
        return new GetWorkerById();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link ReqToken }
     * 
     */
    public ReqToken createReqToken() {
        return new ReqToken();
    }

    /**
     * Create an instance of {@link ReqLogin }
     * 
     */
    public ReqLogin createReqLogin() {
        return new ReqLogin();
    }

    /**
     * Create an instance of {@link GetWorkerByIdResponse }
     * 
     */
    public GetWorkerByIdResponse createGetWorkerByIdResponse() {
        return new GetWorkerByIdResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespWorker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "Worker")
    public JAXBElement<RespWorker> createWorker(RespWorker value) {
        return new JAXBElement<RespWorker>(_Worker_QNAME, RespWorker.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespWorkerList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "respWorkerList")
    public JAXBElement<RespWorkerList> createRespWorkerList(RespWorkerList value) {
        return new JAXBElement<RespWorkerList>(_RespWorkerList_QNAME, RespWorkerList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddWorkerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "addWorkerResponse")
    public JAXBElement<AddWorkerResponse> createAddWorkerResponse(AddWorkerResponse value) {
        return new JAXBElement<AddWorkerResponse>(_AddWorkerResponse_QNAME, AddWorkerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "loginUser")
    public JAXBElement<LoginUser> createLoginUser(LoginUser value) {
        return new JAXBElement<LoginUser>(_LoginUser_QNAME, LoginUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqWorker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "reqWorker")
    public JAXBElement<ReqWorker> createReqWorker(ReqWorker value) {
        return new JAXBElement<ReqWorker>(_ReqWorker_QNAME, ReqWorker.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqWorkerId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "reqWorkerId")
    public JAXBElement<ReqWorkerId> createReqWorkerId(ReqWorkerId value) {
        return new JAXBElement<ReqWorkerId>(_ReqWorkerId_QNAME, ReqWorkerId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "loginUserResponse")
    public JAXBElement<LoginUserResponse> createLoginUserResponse(LoginUserResponse value) {
        return new JAXBElement<LoginUserResponse>(_LoginUserResponse_QNAME, LoginUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "respLogin")
    public JAXBElement<RespLogin> createRespLogin(RespLogin value) {
        return new JAXBElement<RespLogin>(_RespLogin_QNAME, RespLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkerByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "getWorkerByIdResponse")
    public JAXBElement<GetWorkerByIdResponse> createGetWorkerByIdResponse(GetWorkerByIdResponse value) {
        return new JAXBElement<GetWorkerByIdResponse>(_GetWorkerByIdResponse_QNAME, GetWorkerByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "reqToken")
    public JAXBElement<ReqToken> createReqToken(ReqToken value) {
        return new JAXBElement<ReqToken>(_ReqToken_QNAME, ReqToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "reqLogin")
    public JAXBElement<ReqLogin> createReqLogin(ReqLogin value) {
        return new JAXBElement<ReqLogin>(_ReqLogin_QNAME, ReqLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteWorker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "deleteWorker")
    public JAXBElement<DeleteWorker> createDeleteWorker(DeleteWorker value) {
        return new JAXBElement<DeleteWorker>(_DeleteWorker_QNAME, DeleteWorker.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkerById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "getWorkerById")
    public JAXBElement<GetWorkerById> createGetWorkerById(GetWorkerById value) {
        return new JAXBElement<GetWorkerById>(_GetWorkerById_QNAME, GetWorkerById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteWorkerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "deleteWorkerResponse")
    public JAXBElement<DeleteWorkerResponse> createDeleteWorkerResponse(DeleteWorkerResponse value) {
        return new JAXBElement<DeleteWorkerResponse>(_DeleteWorkerResponse_QNAME, DeleteWorkerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqLogout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "reqLogout")
    public JAXBElement<ReqLogout> createReqLogout(ReqLogout value) {
        return new JAXBElement<ReqLogout>(_ReqLogout_QNAME, ReqLogout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "respStatus")
    public JAXBElement<RespStatus> createRespStatus(RespStatus value) {
        return new JAXBElement<RespStatus>(_RespStatus_QNAME, RespStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkerList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "getWorkerList")
    public JAXBElement<GetWorkerList> createGetWorkerList(GetWorkerList value) {
        return new JAXBElement<GetWorkerList>(_GetWorkerList_QNAME, GetWorkerList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddWorker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "addWorker")
    public JAXBElement<AddWorker> createAddWorker(AddWorker value) {
        return new JAXBElement<AddWorker>(_AddWorker_QNAME, AddWorker.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateWorker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "updateWorker")
    public JAXBElement<UpdateWorker> createUpdateWorker(UpdateWorker value) {
        return new JAXBElement<UpdateWorker>(_UpdateWorker_QNAME, UpdateWorker.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkerListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "getWorkerListResponse")
    public JAXBElement<GetWorkerListResponse> createGetWorkerListResponse(GetWorkerListResponse value) {
        return new JAXBElement<GetWorkerListResponse>(_GetWorkerListResponse_QNAME, GetWorkerListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateWorkerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hotel/", name = "updateWorkerResponse")
    public JAXBElement<UpdateWorkerResponse> createUpdateWorkerResponse(UpdateWorkerResponse value) {
        return new JAXBElement<UpdateWorkerResponse>(_UpdateWorkerResponse_QNAME, UpdateWorkerResponse.class, null, value);
    }

}
