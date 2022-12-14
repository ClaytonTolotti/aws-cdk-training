package com.clayton;

import com.clayton.stacks.VpcStack;
import software.amazon.awscdk.App;

public class AwsCdkTrainingApp {
    public static void main(final String[] args) {
        App app = new App();

        new VpcStack(app, "Vpc");
        app.synth();
    }
}

