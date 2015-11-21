package pl.margor.soap.impl;

import javax.inject.Inject;
import javax.jws.WebService;
import pl.margor.db.Measurement;
import pl.margor.service.SimpleService;
import pl.margor.soap.IWeatherService;

/*
 * @author margor
 */
@WebService(endpointInterface = "pl.margor.soap.IWeatherService",
        serviceName = "WeatherService")
public class WeatherService implements IWeatherService {

    @Inject
    private SimpleService srv;

    @Override
    public void persistMeasure(Measurement measure) {
        // check spring DI JSR-330
        System.out.println(srv.generateSimpleText());
        // place service login below
        System.out.println(measure);
    }

}
