interface PCI {
    public void open();

    public void close();
}

class MainBoard {
    public void run() {
        System.out.println("mainboard run");
    }

    public void usePCI(PCI P) {
        if (P != null) {
            P.open();
            P.close();
        }
    }
}

class NetCard implements PCI {
    public void open() {
        System.out.println("netcard open");
    }

    public void close() {
        System.out.println("netcard close");
    }
}

class SoundCard implements PCI {
    public void open() {
        System.out.println("SoundCard open");
    }

    public void close() {
        System.out.println("SoundCard close");
    }
}

public class DuoTaiDemo4 {
    public static void main(String[] args) {
        MainBoard mb = new MainBoard();
        mb.run();
        mb.usePCI(null);
        mb.usePCI(new NetCard());
        mb.usePCI(new SoundCard());
    }
}
