package Others.OCA.abiten.Q067;

class Caller {

    private void init() {

        System.out.println("Initialized");
    }


    private void start() {
        init();
        System.out.println("Started");
    }

}


//What is the result?
//A. An exception is thrown at runtime.
//B. InitializedStartedInitialized
//C. InitializedStarted
//D. Compilation fails.
//Answer: D