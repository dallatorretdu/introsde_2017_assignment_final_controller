
package introsde.APP4.orchestrator.wsdl.app3user;

import java.util.List;
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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserWebService", targetNamespace = "http://soap.users.APP3.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHelloWorldAsString", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetHelloWorldAsString")
    @ResponseWrapper(localName = "getHelloWorldAsStringResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetHelloWorldAsStringResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/getHelloWorldAsStringRequest", output = "http://soap.users.APP3.introsde/UserWebService/getHelloWorldAsStringResponse")
    public String getHelloWorldAsString(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteUserById", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.DeleteUserById")
    @ResponseWrapper(localName = "deleteUserByIdResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.DeleteUserByIdResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/deleteUserByIdRequest", output = "http://soap.users.APP3.introsde/UserWebService/deleteUserByIdResponse")
    public void deleteUserById(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns introsde.APP4.orchestrator.wsdl.app3user.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.UpdateUser")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.UpdateUserResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/updateUserRequest", output = "http://soap.users.APP3.introsde/UserWebService/updateUserResponse")
    public User updateUser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns introsde.APP4.orchestrator.wsdl.app3user.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addUser", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.AddUserResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/addUserRequest", output = "http://soap.users.APP3.introsde/UserWebService/addUserResponse")
    public User addUser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.APP4.orchestrator.wsdl.app3user.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserList", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetUserList")
    @ResponseWrapper(localName = "getUserListResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetUserListResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/getUserListRequest", output = "http://soap.users.APP3.introsde/UserWebService/getUserListResponse")
    public List<User> getUserList();

    /**
     * 
     * @param arg0
     * @return
     *     returns introsde.APP4.orchestrator.wsdl.app3user.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserById", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetUserById")
    @ResponseWrapper(localName = "getUserByIdResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetUserByIdResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/getUserByIdRequest", output = "http://soap.users.APP3.introsde/UserWebService/getUserByIdResponse")
    public User getUserById(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.APP4.orchestrator.wsdl.app3user.Review>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getReviewList", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetReviewList")
    @ResponseWrapper(localName = "getReviewListResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetReviewListResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/getReviewListRequest", output = "http://soap.users.APP3.introsde/UserWebService/getReviewListResponse")
    public List<Review> getReviewList();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<introsde.APP4.orchestrator.wsdl.app3user.Review>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getReviewsOfUser", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetReviewsOfUser")
    @ResponseWrapper(localName = "getReviewsOfUserResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetReviewsOfUserResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/getReviewsOfUserRequest", output = "http://soap.users.APP3.introsde/UserWebService/getReviewsOfUserResponse")
    public List<Review> getReviewsOfUser(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<introsde.APP4.orchestrator.wsdl.app3user.Review>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getReviewsOfPark", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetReviewsOfPark")
    @ResponseWrapper(localName = "getReviewsOfParkResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetReviewsOfParkResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/getReviewsOfParkRequest", output = "http://soap.users.APP3.introsde/UserWebService/getReviewsOfParkResponse")
    public List<Review> getReviewsOfPark(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<introsde.APP4.orchestrator.wsdl.app3user.Review>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getReviewsOfShed", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetReviewsOfShed")
    @ResponseWrapper(localName = "getReviewsOfShedResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetReviewsOfShedResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/getReviewsOfShedRequest", output = "http://soap.users.APP3.introsde/UserWebService/getReviewsOfShedResponse")
    public List<Review> getReviewsOfShed(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addReview", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.AddReview")
    @ResponseWrapper(localName = "addReviewResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.AddReviewResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/addReviewRequest", output = "http://soap.users.APP3.introsde/UserWebService/addReviewResponse")
    public void addReview(
        @WebParam(name = "arg0", targetNamespace = "")
        Review arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns introsde.APP4.orchestrator.wsdl.app3user.Review
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateReview", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.UpdateReview")
    @ResponseWrapper(localName = "updateReviewResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.UpdateReviewResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/updateReviewRequest", output = "http://soap.users.APP3.introsde/UserWebService/updateReviewResponse")
    public Review updateReview(
        @WebParam(name = "arg0", targetNamespace = "")
        Review arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns introsde.APP4.orchestrator.wsdl.app3user.Review
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getReviewById", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetReviewById")
    @ResponseWrapper(localName = "getReviewByIdResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetReviewByIdResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/getReviewByIdRequest", output = "http://soap.users.APP3.introsde/UserWebService/getReviewByIdResponse")
    public Review getReviewById(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.APP4.orchestrator.wsdl.app3user.PlaceVisited>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPlaceVisitedList", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetPlaceVisitedList")
    @ResponseWrapper(localName = "getPlaceVisitedListResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetPlaceVisitedListResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/getPlaceVisitedListRequest", output = "http://soap.users.APP3.introsde/UserWebService/getPlaceVisitedListResponse")
    public List<PlaceVisited> getPlaceVisitedList();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<introsde.APP4.orchestrator.wsdl.app3user.PlaceVisited>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPlacesVisitedOfUser", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetPlacesVisitedOfUser")
    @ResponseWrapper(localName = "getPlacesVisitedOfUserResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetPlacesVisitedOfUserResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/getPlacesVisitedOfUserRequest", output = "http://soap.users.APP3.introsde/UserWebService/getPlacesVisitedOfUserResponse")
    public List<PlaceVisited> getPlacesVisitedOfUser(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addPlaceVisited", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.AddPlaceVisited")
    @ResponseWrapper(localName = "addPlaceVisitedResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.AddPlaceVisitedResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/addPlaceVisitedRequest", output = "http://soap.users.APP3.introsde/UserWebService/addPlaceVisitedResponse")
    public void addPlaceVisited(
        @WebParam(name = "arg0", targetNamespace = "")
        PlaceVisited arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns introsde.APP4.orchestrator.wsdl.app3user.PlaceVisited
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updatePlaceVisited", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.UpdatePlaceVisited")
    @ResponseWrapper(localName = "updatePlaceVisitedResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.UpdatePlaceVisitedResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/updatePlaceVisitedRequest", output = "http://soap.users.APP3.introsde/UserWebService/updatePlaceVisitedResponse")
    public PlaceVisited updatePlaceVisited(
        @WebParam(name = "arg0", targetNamespace = "")
        PlaceVisited arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns introsde.APP4.orchestrator.wsdl.app3user.PlaceVisited
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPlaceVisitedById", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetPlaceVisitedById")
    @ResponseWrapper(localName = "getPlaceVisitedByIdResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetPlaceVisitedByIdResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/getPlaceVisitedByIdRequest", output = "http://soap.users.APP3.introsde/UserWebService/getPlaceVisitedByIdResponse")
    public PlaceVisited getPlaceVisitedById(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<introsde.APP4.orchestrator.wsdl.app3user.PlaceVisited>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPlacesVisitedOfPark", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetPlacesVisitedOfPark")
    @ResponseWrapper(localName = "getPlacesVisitedOfParkResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetPlacesVisitedOfParkResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/getPlacesVisitedOfParkRequest", output = "http://soap.users.APP3.introsde/UserWebService/getPlacesVisitedOfParkResponse")
    public List<PlaceVisited> getPlacesVisitedOfPark(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<introsde.APP4.orchestrator.wsdl.app3user.PlaceVisited>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPlacesVisitedOfShed", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetPlacesVisitedOfShed")
    @ResponseWrapper(localName = "getPlacesVisitedOfShedResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.GetPlacesVisitedOfShedResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/getPlacesVisitedOfShedRequest", output = "http://soap.users.APP3.introsde/UserWebService/getPlacesVisitedOfShedResponse")
    public List<PlaceVisited> getPlacesVisitedOfShed(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "userPreferParks", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.UserPreferParks")
    @ResponseWrapper(localName = "userPreferParksResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.UserPreferParksResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/userPreferParksRequest", output = "http://soap.users.APP3.introsde/UserWebService/userPreferParksResponse")
    public boolean userPreferParks(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "userPreferSheds", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.UserPreferSheds")
    @ResponseWrapper(localName = "userPreferShedsResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.UserPreferShedsResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/userPreferShedsRequest", output = "http://soap.users.APP3.introsde/UserWebService/userPreferShedsResponse")
    public boolean userPreferSheds(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setUserPreference", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.SetUserPreference")
    @ResponseWrapper(localName = "setUserPreferenceResponse", targetNamespace = "http://soap.users.APP3.introsde/", className = "introsde.APP4.orchestrator.wsdl.app3user.SetUserPreferenceResponse")
    @Action(input = "http://soap.users.APP3.introsde/UserWebService/setUserPreferenceRequest", output = "http://soap.users.APP3.introsde/UserWebService/setUserPreferenceResponse")
    public void setUserPreference(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        boolean arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        boolean arg2);

}