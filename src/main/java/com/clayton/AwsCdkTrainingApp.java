package com.clayton;

import com.clayton.stacks.ClusterStack;
import com.clayton.stacks.VpcStack;
import software.amazon.awscdk.App;

public class AwsCdkTrainingApp {
    public static void main(final String[] args) {
        App app = new App();

        VpcStack vpc = new VpcStack(app, "Vpc");
        ClusterStack cluster = new ClusterStack(app, "Cluster", vpc.getVpc());

        cluster.addDependency(vpc);

        app.synth();
    }
}

