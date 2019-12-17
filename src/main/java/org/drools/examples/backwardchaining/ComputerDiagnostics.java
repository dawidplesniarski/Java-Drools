package org.drools.examples.backwardchaining;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;




public class ComputerDiagnostics {

    public static void main(String[] args) throws Exception {
        GUI gui = new GUI();
        gui.setVisible(true);

        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("computers");


        ksession.fireAllRules();
        ksession.dispose();
    }


}
