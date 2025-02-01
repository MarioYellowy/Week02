package Models;

import Enums.EMeasurementUnit;

public class MetricsTracker implements ITrackable {
    private Integer metrickTrackerId;
    private EMeasurementUnit measurementUnit;

    public MetricsTracker(Integer metrickTrackerId, EMeasurementUnit measurementUnit) {
        this.metrickTrackerId = metrickTrackerId;
        this.measurementUnit = measurementUnit;
    }

    public Integer getMetrickTrackerId() {
        return metrickTrackerId;
    }

    public EMeasurementUnit getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(EMeasurementUnit measurementUnit) {
        this.measurementUnit = measurementUnit;
    }
}
