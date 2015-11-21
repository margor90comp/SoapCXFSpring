package pl.margor.db;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/*
 * @author margor
 */
@XmlRootElement(name = "measureBody", namespace = "MeasurementBody")
@XmlType(propOrder = {"tempC", "humidity", "pressurePa", "type", "date"})
public class MeasurementBody {
    
    private BigDecimal tempC;
    private BigDecimal humidity;
    private BigDecimal pressurePa;
    private String type;
    private Date date;

    public MeasurementBody() {
    }

    public MeasurementBody(Long id, BigDecimal tempC, BigDecimal humidity,
            BigDecimal pressurePa, String type, Date date) {
        this.tempC = tempC;
        this.humidity = humidity;
        this.pressurePa = pressurePa;
        this.type = type;
        this.date = date;
    }

    @XmlElement(required = true)
    public BigDecimal getTempC() {
        return tempC;
    }

    public void setTempC(BigDecimal tempC) {
        this.tempC = tempC;
    }

    @XmlElement(required = true)
    public BigDecimal getHumidity() {
        return humidity;
    }

    public void setHumidity(BigDecimal humidity) {
        this.humidity = humidity;
    }

    @XmlElement(required = true, name = "pressure")
    public BigDecimal getPressurePa() {
        return pressurePa;
    }

    public void setPressurePa(BigDecimal pressurePa) {
        this.pressurePa = pressurePa;
    }

    @XmlElement(required = true)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(required = true)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.tempC);
        hash = 43 * hash + Objects.hashCode(this.humidity);
        hash = 43 * hash + Objects.hashCode(this.pressurePa);
        hash = 43 * hash + Objects.hashCode(this.type);
        hash = 43 * hash + Objects.hashCode(this.date);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MeasurementBody other = (MeasurementBody) obj;
        if (!Objects.equals(this.tempC, other.tempC)) {
            return false;
        }
        if (!Objects.equals(this.humidity, other.humidity)) {
            return false;
        }
        if (!Objects.equals(this.pressurePa, other.pressurePa)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MeasurementBody{" + "tempC=" + tempC + ", humidity=" + humidity + ", pressurePa=" + pressurePa + ", type=" + type + ", date=" + date + '}';
    }

}
