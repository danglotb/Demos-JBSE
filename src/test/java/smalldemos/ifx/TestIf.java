package smalldemos.ifx;

import jbse.apps.run.RunParameters;
import jbse.apps.run.Run;
import org.junit.Test;

public class TestIf {

    @Test
    public void test() throws Exception {
        final RunParameters p = new RunParameters();
        p.setJREPath("lib/jre1.8.0/");
        p.addClasspath("./target/classes", "lib/jbse-0.8.0-SNAPSHOT.jar"); // build from sources, after cloning the repos
        p.setMethodSignature("smalldemos/ifx/IfExample", "(I)V", "m");
        p.setDecisionProcedureType(RunParameters.DecisionProcedureType.Z3);
        p.setExternalDecisionProcedurePath("lib/z3/bin/z3"); // build from sources, after cloning the repos
        p.setOutputFileName("out/runIf_z3.txt");
        p.setStepShowMode(RunParameters.StepShowMode.LEAVES);
        final Run r = new Run(p);
        r.run();
    }
}