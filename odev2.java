// GameController Interface
interface GameController {
    void addController();
    void playGame();
}

// Xbox Class
class Xbox implements GameController {
    private boolean isOpen;

    public Xbox() {
        this.isOpen = false;
    }

    @Override
    public void addController() {
        System.out.println("Xbox Controller Added");
    }

    @Override
    public void playGame() {
        if (!isOpen) {
            throw new IllegalStateException("Xbox is closed. Turn it on to play the game.");
        }
        System.out.println("Game started on Xbox.");
    }

    public void open() {
        if (isOpen) {
            throw new IllegalStateException("Xbox is already open.");
        }
        isOpen = true;
        System.out.println("Xbox is now open.");
    }

    public void shutdown() {
        if (!isOpen) {
            throw new IllegalStateException("Xbox is already closed.");
        }
        isOpen = false;
        System.out.println("Xbox is now closed.");
    }
}

// Playstation Class
class Playstation implements GameController {
    private boolean isOpen;

    public Playstation() {
        this.isOpen = false;
    }

    @Override
    public void addController() {
        System.out.println("Playstation Controller Added");
    }

    @Override
    public void playGame() {
        if (!isOpen) {
            throw new IllegalStateException("Playstation is closed. Turn it on to play the game.");
        }
        System.out.println("Game started on Playstation.");
    }

    public void open() {
        if (isOpen) {
            throw new IllegalStateException("Playstation is already open.");
        }
        isOpen = true;
        System.out.println("Playstation is now open.");
    }

    public void shutdown() {
        if (!isOpen) {
            throw new IllegalStateException("Playstation is already closed.");
        }
        isOpen = false;
        System.out.println("Playstation is now closed.");
    }
}

// Computer Class
class Computer {
    private boolean isOpen;

    public Computer() {
        this.isOpen = false;
    }

    public void open() {
        if (isOpen) {
            throw new IllegalStateException("Computer is already open.");
        }
        isOpen = true;
        System.out.println("Computer is now open.");
    }

    public void shutdown() {
        if (!isOpen) {
            throw new IllegalStateException("Computer is already closed.");
        }
        isOpen = false;
        System.out.println("Computer is now closed.");
    }
}
