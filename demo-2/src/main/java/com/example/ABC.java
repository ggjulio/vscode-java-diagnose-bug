package com.example;

public class ABC extends AB {
    // Err
    @Override
    public void setValue() {
        // The issue is that vscode diagnose takes the wrong signature from A class
        // instead of the IAB interface.
        super.setValue();
        // Unlike the first demo, there is no good workaround:
        //   - change private to protected in A class
        //   - or change function name in A class
        // Also note that `Go to super implementation` does not work.
	}
}
