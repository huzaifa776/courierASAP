package domain;

import java.io.Serializable;
import java.util.List;

public interface TrackingInterface extends Serializable {
    void storeData(Tracking addingData);

    List<Tracking> retrieveData();
}
