package pl.margor.db;

import java.util.Objects;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * @author margor
 */
@XmlRootElement(name = "measure", namespace = "Measurement")
public class Measurement {

    private long id;
    private MeasurementBody measureBody;

    @Override
    public String toString() {
        return "Measurement{" + "id=" + id + ", measureBody=" + measureBody + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 67 * hash + Objects.hashCode(this.measureBody);
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
        final Measurement other = (Measurement) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.measureBody, other.measureBody)) {
            return false;
        }
        return true;
    }

    @XmlElement(required = true)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @XmlElement(required = true)
    public MeasurementBody getMeasureBody() {
        return measureBody;
    }

    public void setMeasureBody(MeasurementBody measureBody) {
        this.measureBody = measureBody;
    }

}
