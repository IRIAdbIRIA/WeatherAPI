
package net.atos.weatherApplication.soap;



import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="temp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="tempMin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="tempMax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="weatherType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pressure" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="humidity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cityName",
    "temp",
    "tempMin",
    "tempMax",
    "weatherType",
    "pressure",
    "humidity"
})
@XmlRootElement(name = "GetTownWeatherResponse")
public class GetTownWeatherResponse {

    @XmlElement(required = true, nillable = true)
    protected String cityName;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double temp;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double tempMin;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double tempMax;
    @XmlElement(required = true, nillable = true)
    protected String weatherType;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double pressure;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double humidity;

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the tempMorn property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTemp() {
        return temp;
    }

    /**
     * Sets the value of the tempMorn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTemp(Double value) {
        this.temp = value;
    }

    /**
     * Gets the value of the tempDay property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTempMin() {
        return tempMin;
    }

    /**
     * Sets the value of the tempMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTempMin(Double value) {
        this.tempMin = value;
    }

    /**
     * Gets the value of the tempMax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTempMax() {
        return tempMax;
    }

    /**
     * Sets the value of the tempMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTempMax(Double value) {
        this.tempMax = value;
    }

    /**
     * Gets the value of the weatherType property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public String getWeatherType() {
        return weatherType;
    }

    /**
     * Sets the value of the weatherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeatherType(String value) {
        this.weatherType = value;
    }

    /**
     * Gets the value of the pressure property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPressure() {
        return pressure;
    }

    /**
     * Sets the value of the pressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPressure(Double value) {
        this.pressure = value;
    }

    /**
     * Gets the value of the humidity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHumidity() {
        return humidity;
    }

    /**
     * Sets the value of the humidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHumidity(Double value) {
        this.humidity = value;
    }

}
