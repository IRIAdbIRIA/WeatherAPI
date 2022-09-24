
package net.atos.weatherapplication.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "WeatherAPI", targetNamespace = "http://www.example.org/WeatherAPI/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherAPI {


    /**
     * 
     * @param parameters
     * @return
     *     returns net.atos.weatherapplication.soap.GetTownWeatherResponse
     * @throws GetTownWeatherRequestFaultMessage
     */
    @WebMethod(operationName = "GetWeatherOperation", action = "http://www.example.org/WeatherAPI/GetWeatherOperation")
    @WebResult(name = "GetTownWeatherResponse", targetNamespace = "http://www.example.org/WeatherAPI/", partName = "parameters")
    public GetTownWeatherResponse getWeatherOperation(
        @WebParam(name = "GetTownWeatherRequest", targetNamespace = "http://www.example.org/WeatherAPI/", partName = "parameters")
        GetTownWeatherRequest parameters)
        throws GetTownWeatherRequestFaultMessage
    ;

}