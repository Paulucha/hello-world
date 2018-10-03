package bankApp;

public interface RateInterface  {
    default double getBaseRate(){
        return 2.5;
    };

}
