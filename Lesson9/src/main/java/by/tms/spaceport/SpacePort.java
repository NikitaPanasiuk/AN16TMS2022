package by.tms.spaceport;

public class SpacePort {
    public void start(IStart object) {
        if (object.checkSystem()) {
            object.engineStart();
            System.out.println("10...9...8...7...6...5...4...3...2...1");
            object.start();
        } else {
            System.out.println("System check is fold");
        }
    }
}
