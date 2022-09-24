
package net.atos.weatherapplication.soap;

import jakarta.xml.bind.annotation.*;


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
 *         <element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="tempMorn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="tempDay" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="tempEve" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="tempNight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="tempMin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="tempMax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="weatherType" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "countryName",
    "tempMorn",
    "tempDay",
    "tempEve",
    "tempNight",
    "tempMin",
    "tempMax",
    "weatherType",
    "pressure",
    "humidity"
})
@XmlRootElement(name = "GetTownWeatherResponse")
public class GetTownWeatherResponse {

    @XmlElement(required = true, nillable = true)
    protected String countryName;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double tempMorn;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double tempDay;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double tempEve;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double tempNight;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double tempMin;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double tempMax;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double weatherType;
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
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the tempMorn property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTempMorn() {
        return tempMorn;
    }

    /**
     * Sets the value of the tempMorn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTempMorn(Double value) {
        this.tempMorn = value;
    }

    /**
     * Gets the value of the tempDay property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTempDay() {
        return tempDay;
    }

    /**
     * Sets the value of the tempDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTempDay(Double value) {
        this.tempDay = value;
    }

    /**
     * Gets the value of the tempEve property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTempEve() {
        return tempEve;
    }

    /**
     * Sets the value of the tempEve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTempEve(Double value) {
        this.tempEve = value;
    }

    /**
     * Gets the value of the tempNight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTempNight() {
        return tempNight;
    }

    /**
     * Sets the value of the tempNight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTempNight(Double value) {
        this.tempNight = value;
    }

    /**
     * Gets the value of the tempMin property.
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
    public Double getWeatherType() {
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
    public void setWeatherType(Double value) {
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
