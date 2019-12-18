package org.drools.examples.backwardchaining;

import org.drools.core.common.InternalFactHandle;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;




public class ComputerDiagnostics {

    public static KieSession kieSession;
    public static void main(String[] args) throws Exception {


        GUI gui = new GUI();
        gui.setVisible(true);

        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        kieSession = kc.newKieSession("computers");

        kieSession.fireUntilHalt();
        kieSession.dispose();
    }
}
