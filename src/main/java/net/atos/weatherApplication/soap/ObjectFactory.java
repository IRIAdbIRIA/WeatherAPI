
package net.atos.weatherApplication.soap;


import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.atos.weatherapplication.soap package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.atos.weatherapplication.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTownWeatherRequest }
     * 
     * @return
     *     the new instance of {@link GetTownWeatherRequest }
     */
    public GetTownWeatherRequest createGetTownWeatherRequest() {
        return new GetTownWeatherRequest();
    }

    /**
     * Create an instance of {@link GetTownWeatherResponse }
     * 
     * @return
     *     the new instance of {@link GetTownWeatherResponse }
     */
    public GetTownWeatherResponse createGetTownWeatherResponse() {
        return new GetTownWeatherResponse();
    }

    /**
     * Create an instance of {@link GetTownWeatherRequestFault }
     * 
     * @return
     *     the new instance of {@link GetTownWeatherRequestFault }
     */
    public GetTownWeatherRequestFault createGetTownWeatherRequestFault() {
        return new GetTownWeatherRequestFault();
    }

}
