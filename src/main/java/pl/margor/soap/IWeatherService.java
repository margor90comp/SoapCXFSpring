package pl.margor.soap;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import pl.margor.db.Measurement;

/*
 * @author margor
 */
@WebService(name = "MeasureService", targetNamespace = "pl.margor.measureservice")
public interface IWeatherService {

    void persistMeasure(
            @WebParam(name = "measure")
            @XmlElement(required = true)
            Measurement measure
    );

}
