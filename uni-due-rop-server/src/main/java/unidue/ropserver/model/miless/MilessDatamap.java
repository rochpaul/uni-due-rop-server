package unidue.ropserver.model.miless;

import unidue.ropserver.model.miless.auto._MilessDatamap;

public class MilessDatamap extends _MilessDatamap {

    private static MilessDatamap instance;

    private MilessDatamap() {}

    public static MilessDatamap getInstance() {
        if(instance == null) {
            instance = new MilessDatamap();
        }

        return instance;
    }
}
