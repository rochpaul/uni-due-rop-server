package unidue.ropserver.model.rc;

import unidue.ropserver.model.rc.auto._ReserveCollectionsDatamap;

public class ReserveCollectionsDatamap extends _ReserveCollectionsDatamap {

    private static ReserveCollectionsDatamap instance;

    private ReserveCollectionsDatamap() {}

    public static ReserveCollectionsDatamap getInstance() {
        if(instance == null) {
            instance = new ReserveCollectionsDatamap();
        }

        return instance;
    }
}
